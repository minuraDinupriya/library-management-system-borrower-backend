package org.example.repository;

import org.example.entity.LogInEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LogInEntity,Long> {
    Boolean existsAllByUserNameAndPassword(String username, String password);
}
