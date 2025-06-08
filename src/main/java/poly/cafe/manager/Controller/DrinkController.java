package poly.cafe.manager.Controller;

import poly.cafe.entity.Drinks;

public interface DrinkController extends CRUDController<Drinks> {
    void fillCategories();
    void chooseFile();
}
