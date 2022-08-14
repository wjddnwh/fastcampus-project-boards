package com.fastcampus.projectboards.repository;

import com.fastcampus.projectboards.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
