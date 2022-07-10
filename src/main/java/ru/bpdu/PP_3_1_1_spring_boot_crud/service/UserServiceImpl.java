package ru.bpdu.PP_3_1_1_spring_boot_crud.service;

import org.springframework.stereotype.Service;
import ru.bpdu.PP_3_1_1_spring_boot_crud.entity.User;
import ru.bpdu.PP_3_1_1_spring_boot_crud.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) { userRepository.save(user); }

    @Override
    public void deleteUser(Long id) { userRepository.deleteById(id); }

    @Override
    public User getUser(Long id) { return userRepository.getReferenceById(id); }

    @Override
    public void updateUser(Long id, String name, String email, Integer age) {

    }

    @Override
    public List<User> getUserList() { return userRepository.;
    }
}
