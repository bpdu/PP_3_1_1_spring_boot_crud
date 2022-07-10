package ru.bpdu.PP_3_1_1_spring_boot_crud.service;

import ru.bpdu.PP_3_1_1_spring_boot_crud.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
    void updateUser(Long id, String name, String email, Integer age);
    List<User> getUserList();
}
