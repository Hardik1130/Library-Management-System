package com.hardikfunny.library.repo;

import com.hardikfunny.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {


}
