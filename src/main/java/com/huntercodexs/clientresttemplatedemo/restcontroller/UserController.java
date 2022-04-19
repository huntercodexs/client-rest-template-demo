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
@RequestMapping("${api.prefix}")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * Read User
     */
    @GetMapping(path = "/users/{userid}")
    public ResponseEntity<UserResponseDto> findOne(@PathVariable("userid") String userid) {
        System.out.println("FindOne");
        return userService.findOne(userid);
    }

    /**
     * Read All Users
     */
    @GetMapping(path = "/users")
    public ResponseEntity<UserResponseDto> findAll() {
        System.out.println("FinAll");
        return userService.findAll();
    }

    /**
     * Create User
     */
    @PostMapping(path = "/users")
    public ResponseEntity<UserResponseDto> create(@RequestBody UserRequestDto user) {
        System.out.println("Create");
        return userService.create(user);
    }

    /**
     * Delete User
     */
    @DeleteMapping (path = "/users/{userid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseDto> delete(@PathVariable("userid") String userid) {
        System.out.println("Delete");
        return userService.delete(userid);
    }

    /**
     * Update User
     */
    @PutMapping(path = "/users/{userid}")
    public ResponseEntity<UserResponseDto> update(@PathVariable("userid") String userid, @RequestBody UserRequestDto user) {
        System.out.println("Update");
        return userService.update(userid, user);
    }

    /**
     * Patch User
     */
    @PatchMapping(path = "/users/{userid}")
    public ResponseEntity<UserResponseDto> patch(@PathVariable("userid") String userid, @RequestBody UserRequestDto user) {
        System.out.println("Patcher");
        return userService.patch(userid, user);
    }

}
