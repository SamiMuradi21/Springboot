package com.springboot.blogapp.repositories;

import com.springboot.blogapp.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findOneByEmailIgnoreCase(String email);
}
