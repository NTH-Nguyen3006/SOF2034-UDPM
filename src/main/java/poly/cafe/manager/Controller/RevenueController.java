package poly.cafe.manager.Controller;

import poly.cafe.entity.Revenue;

public interface RevenueController {
    void open(); // hiển thị doanh thu từng loại trong ngày
    void selectTimeRange(); // hiển thị doanh thu theo khoảng thời gian được chọn
    void fillRevenue(); // hiển thị doanh thu
}
