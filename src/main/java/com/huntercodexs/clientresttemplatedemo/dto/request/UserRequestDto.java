package com.huntercodexs.clientresttemplatedemo.dto.request;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRequestDto {

    String name;
    String email;
    String phone;
    String address;

}
