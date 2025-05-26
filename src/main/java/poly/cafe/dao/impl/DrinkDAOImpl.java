package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.DrinkDAO;
import poly.cafe.entity.Drinks;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

import java.util.List;

public class DrinkDAOImpl implements DrinkDAO {
    String findAllSQL = "SELECT * FROM Drinks";
    String findByCategoryIdSQL = "SELECT * FROM Drinks WHERE CategoryId = ?;";
    String createSQL = """
            INSERT INTO Drinks (Id, Name, UnitPrice, Discount, Image, Available, CategoryId)
            VALUES (?,?,?,?,?,?,?);""";
    String updateSQL = """
            UPDATE Drinks SET Name = ?, UnitPrice = ?, Discount = ?,
            Image = ?, Available = ? WHERE Id = ?;""";
    String deleteByIdSQL = "DELETE FROM Drinks WHERE Id = ?;";
    String findByIdSQL = "SELECT * FROM Drinks WHERE Id = = ?;";


    @Override
    public List<Drinks> findByCategoryId(String categoryId) {
        return XQuery.getBeanList(Drinks.class, findByCategoryIdSQL, categoryId);
    }

    @Override
    public Drinks create(Drinks entity) {
        //Id, Name, UnitPrice, Discount, Image, Available, CategoryId
        int rowAffect = XJdbc.executeUpdate(createSQL, entity.getId(),
                entity.getName(), entity.getUnitPrice(), entity.getDiscount(),
                entity.getImage(), entity.isAvailable(), entity.getCategoryId());

        if (rowAffect > 0) return this.findById(entity.getId());
        else return null;
    }

    @Override
    public void update(Drinks entity) {
        XJdbc.executeUpdate(updateSQL,
            entity.getName(), entity.getUnitPrice(), entity.getDiscount(),
            entity.getImage(), entity.isAvailable(), entity.getId());
    }

    @Override
    public void deleteById(String s) {
        XJdbc.executeUpdate(deleteByIdSQL, s);
    }

    @Override
    public List<Drinks> findAll() {
        return XQuery.getBeanList(Drinks.class, findAllSQL);
    }

    @Override
    public Drinks findById(String s) {
        return XQuery.getSingleBean(Drinks.class, findByIdSQL, s);
    }
}
