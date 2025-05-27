

package com.ireachagility.userapp.repository;

import com.ireachagility.userapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
