package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.CategoryDAO;
import poly.cafe.entity.Categories;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

import java.util.List;

public class CategoryDAOImpl implements CategoryDAO {
    String createSql = "INSERT INTO Categories(Id, Name) VALUES(?, ?)";
    String updateSql = "UPDATE Categories SET Name=? WHERE Id=?";
    String deleteSql = "DELETE FROM Categories WHERE Id=?";
    String findAllSql = "SELECT * FROM Categories";
    String findByIdSql = "SELECT * FROM Categories WHERE Id=?";

    @Override
    public Categories create(Categories entity) {
        Object[] values = {
                entity.getId(),
                entity.getName()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }
    @Override
    public void update(Categories entity) {
        Object[] values = {
                entity.getName(),
                entity.getId()
        };
        XJdbc.executeUpdate(updateSql, values);
    }
    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }
    @Override
    public List<Categories> findAll() {
        return XQuery.getEntityList(Categories.class, findAllSql);
    }
    @Override
    public Categories findById(String id) {
        return XQuery.getSingleBean(Categories.class, findByIdSql, id);
    }
}
