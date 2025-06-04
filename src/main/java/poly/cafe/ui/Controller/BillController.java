package poly.cafe.ui.Controller;

import poly.cafe.entity.Bills;

public interface BillController {
    void setBill(Bills bill); // truyền bill vào cửa sổ để hiển thị
    void open(); // Hiển thị bill
    void close(); // Xóa bill nếu ko chứa đồ uống nào
    void showDrinkJDialog(); // Hiển thị cửa sổ bổ sung đồ uống vào bill
    void removeDrinks();
    void updateQuantity(); // Thay đổi số lượng đồ uống
    void checkout(); // Thanh toán
    void cancel(); // Hủy bill
}
