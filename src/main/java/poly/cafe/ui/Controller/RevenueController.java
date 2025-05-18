package poly.cafe.ui.Controller;

import poly.cafe.entity.Revenue;

public interface RevenueController extends CRUDController<Revenue> {
    void open(); // hiển thị doanh thu từng loại trong ngày
    void selectTimeRange(); // hiển thị doanh thu theo khoảng thời gian được chọn
    void fillRevenue(); // hiển thị doanh thu
}
