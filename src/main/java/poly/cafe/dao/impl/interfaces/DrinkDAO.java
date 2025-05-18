package poly.cafe.dao.impl.interfaces;

import poly.cafe.entity.Drinks;
import java.util.List;

public interface DrinkDAO extends CrudDAO<Drinks, String>{
    List<Drinks> findByCategoryId(String categoryId);
}
