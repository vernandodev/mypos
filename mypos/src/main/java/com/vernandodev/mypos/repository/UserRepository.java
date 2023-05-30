package com.vernandodev.mypos.repository;

import com.vernandodev.mypos.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository{
    Optional<User> findByEmail(String email);
}
