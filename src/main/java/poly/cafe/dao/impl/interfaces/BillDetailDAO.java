package poly.cafe.dao.impl.interfaces;

import poly.cafe.entity.BillDetails;
import java.util.List;

public interface BillDetailDAO  extends CrudDAO<BillDetails, Long> {
    List<BillDetails> findByBillId(Long billId);
    List<BillDetails> findByDrinkId(String drinkId);
}
