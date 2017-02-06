package com.itools.repository;

import com.itools.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dmitry on 6.2.17.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
