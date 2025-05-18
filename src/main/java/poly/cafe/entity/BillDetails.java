package poly.cafe.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BillDetails {
    Long id;
    Long billId;
    String drinkId;
    double unitPrice;
    double discount;
    int quantity;
    String drinkName;
}
