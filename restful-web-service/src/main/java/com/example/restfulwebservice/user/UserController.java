package com.example.restfulwebservice.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    // new로 인스턴스를 생성하지 않고, 의존성 주입을 통해 이용한다.
    private UserDaoService service;

    // 생성자를 통한 의존성 주입
    public UserController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET /users/1 or /users/10
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        User savedUser = service.save(user);
    }

}
