package com.huntercodexs.clientresttemplatedemo.mapper.request;

import com.huntercodexs.clientresttemplatedemo.dto.request.UserRequestDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minidev.json.JSONObject;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserRequestMapper {

    public static JSONObject extractCreateUserToJson(UserRequestDto userRequestDto) {
        if (userRequestDto == null) return null;

        JSONObject extracted = new JSONObject();
        extracted.appendField("name", userRequestDto.getName());
        extracted.appendField("email", userRequestDto.getEmail());
        extracted.appendField("phone", userRequestDto.getPhone());
        extracted.appendField("address", userRequestDto.getAddress());
        return extracted;
    }

}
