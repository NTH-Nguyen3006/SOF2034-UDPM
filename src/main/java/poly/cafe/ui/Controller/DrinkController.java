package poly.cafe.ui.Controller;

import poly.cafe.entity.Bills;

public interface DrinkController {
    void setBill(Bills bill); // nhận bill từ BillJDialog
    void open(); // hiển thị loại và đồ uống
    void fillCategories(); // tải và hiển thị loại đồ uống
    void fillDrinks(); //  tải và hiển thị đồ uống
    void addDrinkToBill(); // thêm đồ uống vào bill
}
