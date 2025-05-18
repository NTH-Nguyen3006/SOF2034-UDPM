package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.DrinkDAO;
import poly.cafe.entity.Drinks;

import java.util.List;

public class DrinkDAOImpl implements DrinkDAO {
    @Override
    public List<Drinks> findByCategoryId(String categoryId) {
        return List.of();
    }

    @Override
    public Drinks create(Drinks entity) {
        return null;
    }

    @Override
    public void update(Drinks entity) {

    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public List<Drinks> findAll() {
        return List.of();
    }

    @Override
    public Drinks findById(String s) {
        return null;
    }
}
