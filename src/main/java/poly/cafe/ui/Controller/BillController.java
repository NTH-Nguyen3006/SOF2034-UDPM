package poly.cafe.ui.Controller;

import poly.cafe.entity.Bills;

public interface BillController extends CRUDController<Bills>{
    void fillBillDetails(); // tải và hiển thị chi tiết phiếu
    void selectTimeRange(); // xử lý chọn khoảng thời gian trong cboTimeRanges
}
