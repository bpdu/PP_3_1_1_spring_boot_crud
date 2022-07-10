package ru.bpdu.PP_3_1_1_spring_boot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bpdu.PP_3_1_1_spring_boot_crud.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
