package poly.cafe.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
    String username;
    String password;
    boolean enabled;
    String fullname;

    @Builder.Default
    String photo = "photo.png";
    boolean manager;
}
