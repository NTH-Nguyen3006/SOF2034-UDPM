package poly.cafe.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bills {
    public static enum Status {
        Servicing,Completed, Canceled;
    }

    Long id;
    String username;
    Integer cardId;

    @Builder.Default
    Date checkin = new Date();
    Date checkout;
    int status;
}
