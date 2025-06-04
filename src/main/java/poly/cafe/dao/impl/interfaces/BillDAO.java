package poly.cafe.dao.impl.interfaces;

import poly.cafe.entity.Bills;

import java.util.Date;
import java.util.List;

public interface BillDAO extends CrudDAO<Bills, Long> {
    List<Bills> findByUsername(String username);
    List<Bills> findByCardId(Integer cardId);
    List<Bills> findByTimeRange(Date begin, Date end);
    public Bills findServicingByCardId(Integer cardId);
    List<Bills> findByUserAndTimeRange(String username, Date begin, Date end);
}
