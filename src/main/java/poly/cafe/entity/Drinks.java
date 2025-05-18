package poly.cafe.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Drinks {
    String Id;
    String Name;
    double UnitPrice, Discount;
    @Builder.Default
    String Image ="product.png";
    boolean Available;
    String CategoryId;
}
