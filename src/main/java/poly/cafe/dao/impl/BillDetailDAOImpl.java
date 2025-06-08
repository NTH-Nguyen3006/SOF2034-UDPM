package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.BillDetailDAO;
import poly.cafe.entity.BillDetails;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

import java.util.List;

public class BillDetailDAOImpl implements BillDetailDAO {
    String createSql = """
            INSERT INTO BillDetails (BillId, DrinkId, UnitPrice, Discount, Quantity)
            VALUES (?,?,?,?,?)""";
    String updateSql = """
            UPDATE BillDetails SET 
                BillId = ?, DrinkId = ?, UnitPrice = ?, Discount = ?, Quantity = ?
            WHERE Id = ?""";
    String deleteSql = "DELETE FROM BillDetails WHERE Id = ?";

    String findAllSql = """
        SELECT bd.*, d.name AS drinkName
        FROM BillDetails bd JOIN Drinks d ON d.Id=bd.DrinkId""";

    String findByIdSql = """
        SELECT bd.*, d.name AS drinkName
        FROM BillDetails bd JOIN Drinks d ON d.Id=bd.DrinkId WHERE bd.Id=?""";

    String findByBillIdSql = """
        SELECT bd.*, d.name AS drinkName
        FROM BillDetails bd JOIN Drinks d ON d.Id=bd.DrinkId WHERE bd.BillId=?""";

    String findByDrinkIdSql = """
        SELECT bd.*, d.name AS drinkName
        FROM BillDetails bd JOIN Drinks d ON d.Id=bd.DrinkId WHERE bd.DrinkId=?""";

    @Override
    public List<BillDetails> findByBillId(Long billId) {
        return XQuery.getBeanList(BillDetails.class, findByBillIdSql, billId);
    }

    @Override
    public List<BillDetails> findByDrinkId(String drinkId) {
        return XQuery.getBeanList(BillDetails.class, findByDrinkIdSql, drinkId);
    }

    @Override
    public BillDetails create(BillDetails entity) {
        //BillId, DrinkId, UnitPrice, Discount, Quantity
        int rowAffect = XJdbc.executeUpdate(createSql, new Object[] {
                entity.getBillId(), entity.getDrinkId(),
                entity.getUnitPrice(), entity.getDiscount(),
                entity.getQuantity()
        });

        if (rowAffect > 0) return XQuery.getSingleBean(
                BillDetails.class ,findByBillIdSql, entity.getBillId());
        return null;
    }

    @Override
    public void update(BillDetails entity) {
        int rowAffect = XJdbc.executeUpdate(updateSql, new Object[]{
                entity.getBillId(), entity.getDrinkId(),
                entity.getUnitPrice(), entity.getDiscount(),
                entity.getQuantity(), entity.getId()
        });
    }

    @Override
    public void deleteById(Long aLong) {
        int rowAffect = XJdbc.executeUpdate(deleteSql, aLong);
    }

    @Override
    public List<BillDetails> findAll() {
        return XQuery.getBeanList(BillDetails.class, findAllSql);
    }

    @Override
    public BillDetails findById(Long aLong) {
        return XQuery.getSingleBean(BillDetails.class, findByIdSql, aLong);
    }
}
