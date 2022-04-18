package com.huntercodexs.clientresttemplatedemo.mapper.response;

import com.huntercodexs.clientresttemplatedemo.dto.response.UserResponseDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minidev.json.JSONObject;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserResponseMapper {

    public static UserResponseDto mapperUserDto(UserResponseDto userResponseDto) {
        UserResponseDto resulUserResponseDto = new UserResponseDto();
        resulUserResponseDto.setName(userResponseDto.getName());
        resulUserResponseDto.setEmail(userResponseDto.getEmail());
        resulUserResponseDto.setPhone(userResponseDto.getPhone());
        resulUserResponseDto.setAddress(userResponseDto.getAddress());
        resulUserResponseDto.setCreatedAt(userResponseDto.getCreatedAt());
        resulUserResponseDto.setUpdatedAt(userResponseDto.getUpdatedAt());
        resulUserResponseDto.setActive(userResponseDto.getActive());
        return resulUserResponseDto;
    }

    public static JSONObject mapperAllUserDto(List<UserResponseDto> users) {

        JSONObject results = new JSONObject();
        int counter = 0;

        for (UserResponseDto user : users) {
            counter++;
            results.appendField(Integer.toString(counter), mapperUserDto(user));
        }

        results.appendField("total", counter);

        return results;
    }

}
