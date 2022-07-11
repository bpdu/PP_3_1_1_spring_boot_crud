package ru.bpdu.PP_3_1_1_spring_boot_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.bpdu.PP_3_1_1_spring_boot_crud.entity.User;
import ru.bpdu.PP_3_1_1_spring_boot_crud.service.UserService;

@Controller
public class UserController {

    @Autowired
    private final UserService userServiceImpl;

    public UserController(UserService userServiceImpl) { this.userServiceImpl = userServiceImpl; }

    @GetMapping(value="/users")
    public String showUsers(Model model) {
        model.addAttribute("users", userServiceImpl.getUserList());
        return("users");
    }

    @GetMapping(value="/create")
    public String createUserRedirect(User user) {
        return "create";
    }

    @PostMapping(value="/create")
    public String createUser(User user) {
        userServiceImpl.addUser(user);
        return "redirect:/users";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userServiceImpl.deleteUser(id);
        return("redirect:/users");
    }

    @GetMapping(value="/update/{id}")
    public String updateUserRedirect(@PathVariable("id") long id, Model model) {
        User user = userServiceImpl.getUser(id);
        model.addAttribute("user", user);
        return "update";
    }

    @PostMapping(value="/update")
    public String updateUser(User user) {
        userServiceImpl.updateUser(user.getId(), user.getName(), user.getEmail(), user.getAge());
        return "redirect:/users";
    }
}
