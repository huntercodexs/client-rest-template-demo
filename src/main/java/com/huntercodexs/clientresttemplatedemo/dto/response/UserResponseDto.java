package com.huntercodexs.clientresttemplatedemo.dto.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseDto {

    String name;
    String email;
    String phone;
    String address;
    String createdAt;
    String updatedAt;
    String active;

}
