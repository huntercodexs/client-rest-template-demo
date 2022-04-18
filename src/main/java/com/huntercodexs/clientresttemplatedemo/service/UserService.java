package com.huntercodexs.clientresttemplatedemo.service;

import com.huntercodexs.clientresttemplatedemo.dto.request.UserRequestDto;
import com.huntercodexs.clientresttemplatedemo.dto.response.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    ClientService clientService;

    public ResponseEntity<UserResponseDto> findOne(String userid) {
        return clientService.findOne(userid);
    }

    public ResponseEntity<UserResponseDto> findAll() {
        return clientService.findAll();
    }

    public ResponseEntity<UserResponseDto> delete(String userid) {
        return clientService.delete(userid);
    }

    public ResponseEntity<UserResponseDto> create(UserRequestDto user) {
        return clientService.create(user);
    }

    public ResponseEntity<UserResponseDto> update(String userid, UserRequestDto user) {
        return clientService.update(userid, user);
    }

    public ResponseEntity<UserResponseDto> patch(String userid, UserRequestDto user) {
        return clientService.patch(userid, user);
    }
}
