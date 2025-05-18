package poly.cafe.util;

import poly.cafe.entity.Users;

public class XAuth {
    public static Users user = Users.builder()
            .username("user1@gmail.com")
            .password("123")
            .enabled(true)
            .manager(true)
            .fullname("Nguyễn Văn Tèo")
            .photo("trump.png")
            .build(); // biến user này sẽ được thay thế sau khi đăng nhập
}
