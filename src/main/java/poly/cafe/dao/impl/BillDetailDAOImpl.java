package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.BillDetailDAO;
import poly.cafe.entity.BillDetails;

import java.util.List;

public class BillDetailDAOImpl implements BillDetailDAO {
    String createSql = "…";
    String updateSql = "…";
    String deleteSql = "…";

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
        return List.of();
    }

    @Override
    public List<BillDetails> findByDrinkId(String drinkId) {
        return List.of();
    }

    @Override
    public BillDetails create(BillDetails entity) {
        return null;
    }

    @Override
    public void update(BillDetails entity) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<BillDetails> findAll() {
        return List.of();
    }

    @Override
    public BillDetails findById(Long aLong) {
        return null;
    }
}
