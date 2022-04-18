package com.huntercodexs.clientresttemplatedemo.restcontroller;

import com.huntercodexs.clientresttemplatedemo.dto.request.UserRequestDto;
import com.huntercodexs.clientresttemplatedemo.dto.response.UserResponseDto;
import com.huntercodexs.clientresttemplatedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * Read User
     */
    @GetMapping(path = "/api/users/{userid}")
    public ResponseEntity<UserResponseDto> findOne(@PathVariable("userid") String userid) {
        return userService.findOne(userid);
    }

    /**
     * Read All Users
     */
    @GetMapping(path = "/api/users")
    public ResponseEntity<UserResponseDto> findAll() {
        return userService.findAll();
    }

    /**
     * Create User
     */
    @PostMapping(path = "/api/users")
    public ResponseEntity<UserResponseDto> create(@RequestBody UserRequestDto user) {
        return userService.create(user);
    }

    /**
     * Delete User
     */
    @DeleteMapping (path = "/api/users/{userid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseDto> delete(@PathVariable("userid") String userid) {
        return userService.delete(userid);
    }

    /**
     * Update User
     */
    @PutMapping(path = "/api/users/{userid}")
    public ResponseEntity<UserResponseDto> update(@PathVariable("userid") String userid, @RequestBody UserRequestDto user) {
        return userService.update(userid, user);
    }

    /**
     * Patch User
     */
    @PatchMapping(path = "/api/users/{userid}")
    public ResponseEntity<UserResponseDto> patch(@PathVariable("userid") String userid, @RequestBody UserRequestDto user) {
        return userService.patch(userid, user);
    }

}
