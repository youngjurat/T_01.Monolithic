package com.samsung.Mono.data;

import com.samsung.Mono.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<User, String> {

    User save(User user);

    User findUserByUsername(String username);
}
