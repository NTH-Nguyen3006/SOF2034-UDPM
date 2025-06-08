package poly.cafe.ui.Controller;

import poly.cafe.entity.Bills;
import poly.cafe.manager.Controller.CRUDController;

public interface BillController extends CRUDController<Bills> {
    void fillBillDetails(); // tải và hiển thị chi tiết phiếu
    void selectTimeRange(); // xử lý chọn khoảng thời gian trong cboTimeRanges
//    void setBill(Bills bill); // truyền bill vào cửa sổ để hiển thị
//    void open(); // Hiển thị bill
//    void close(); // Xóa bill nếu ko chứa đồ uống nào
//    void showDrinkJDialog(); // Hiển thị cửa sổ bổ sung đồ uống vào bill
//    void removeDrinks(); // Xóa đồ uống khỏi bill
//    void cancel();
}
