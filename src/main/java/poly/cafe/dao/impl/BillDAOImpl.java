package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.BillDAO;
import poly.cafe.entity.Bills;
import poly.cafe.util.XAuth;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

import java.util.Date;
import java.util.List;

public class BillDAOImpl implements BillDAO {
    String findByTimeRangeSql = """
            SELECT * FROM Bills
            WHERE Checkin BETWEEN ? AND ? ORDER BY Checkin DESC
            """;
    String findByIdSql = "SELECT * FROM Bills WHERE ID = ?";
    String deleteByIdSql = "DELETE FROM Bills WHERE ID = ?";
    String findByUsernameSql = "SELECT * FROM Bills WHERE Username = ?";
    String findByCardIdSql = "SELECT * FROM Bills WHERE CardId = ?";
    String createSql = """
            INSERT INTO Bills (Username, CardId, Checkin, Checkout, [Status])
            VALUES (?, ?, ?, ?, ?) """;

    String updateSql = """
            UPDATE Bills SET
                Username = ?, CardId = ?,
                Checkin = ?, Checkout = ?, [Status] = ?
            WHERE ID = ?;
            """;

    String findAllSql = "SELECT * FROM BILLS";


    @Override
    public List<Bills> findByUsername(String username) {
        return XQuery.getBeanList(Bills.class, findByUsernameSql, username);
    }

    @Override
    public List<Bills> findByCardId(Integer cardId) {
        return XQuery.getBeanList(Bills.class, findByCardIdSql, cardId);
    }

    @Override
    public Bills create(Bills entity) {
        int rowAffect = XJdbc.executeUpdate(createSql, entity.getUsername(), entity.getCardId(),
                entity.getCheckin(), entity.getCheckout(),
                entity.getStatus());
        return (rowAffect != 0)? entity : null;
    }

    @Override
    public void update(Bills entity) {
        XJdbc.executeUpdate(updateSql,
                entity.getUsername(), entity.getCardId(),
                entity.getCheckin(), entity.getCheckout(),
                entity.getStatus(), entity.getId());
    }

    @Override
    public void deleteById(Long aLong) {
        XJdbc.executeUpdate(deleteByIdSql, aLong);
    }

    @Override
    public List<Bills> findAll() {
        return XQuery.getBeanList(Bills.class, findAllSql);
    }

    @Override
    public Bills findById(Long aLong) {
        return XQuery.getSingleBean(Bills.class, findByIdSql, aLong);
    }

    @Override
    public List<Bills> findByTimeRange (Date begin, Date end) {
        return XQuery.getBeanList(Bills.class, findByTimeRangeSql, begin, end);
    }

    @Override
    public Bills findServicingByCardId(Integer cardId) {
        String sql = "SELECT * FROM Bills WHERE CardId=? AND Status=0";
        Bills bill = XQuery.getSingleBean(Bills.class, sql, cardId);
        if (bill == null) { // không tìm thấy -> tạo mới
            Bills newBill = new Bills();
            newBill.setCardId(cardId);
            newBill.setCheckin(new Date());
            newBill.setStatus(0); // đang phục vụ
            newBill.setUsername(XAuth.user.getUsername());
            bill = this.create(newBill); // insert
        }
        return bill;
    }

    @Override
    public List<Bills> findByUserAndTimeRange(String username, Date begin, Date end) {
        String sql = """
                SELECT * FROM Bills WHERE Username=? AND Checkin BETWEEN ? AND ?
                """;
        return XQuery.getBeanList(Bills.class, sql, username, begin, end);
    }
}
