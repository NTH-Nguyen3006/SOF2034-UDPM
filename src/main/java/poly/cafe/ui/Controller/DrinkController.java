package poly.cafe.ui.Controller;

import poly.cafe.entity.Drinks;

public interface DrinkController extends CRUDController<Drinks> {
    void fillCategories();
    void chooseFile();
}
