package poly.cafe.dao.impl;

import poly.cafe.dao.impl.interfaces.CardDAO;
import poly.cafe.entity.Cards;
import poly.cafe.util.XQuery;

import java.util.List;


public class CardDAOImpl implements CardDAO {
    String findAllSql = """
            SELECT * FROM [PolyCafe].[dbo].[Cards]
            """;

    @Override
    public Cards create(Cards entity) {
        return null;
    }

    @Override
    public void update(Cards entity) {

    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public List<Cards> findAll() {
        return XQuery.getBeanList(Cards.class, findAllSql);
    }

    @Override
    public Cards findById(Integer integer) {
        return null;
    }
}
