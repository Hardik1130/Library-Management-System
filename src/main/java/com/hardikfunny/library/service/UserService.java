package com.hardikfunny.library.service;


import com.hardikfunny.library.dto.UserDTO;
import com.hardikfunny.library.dto.UserSaveDTO;
import com.hardikfunny.library.dto.UserUpdateDTO;
import com.hardikfunny.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService  {


    User addUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();


    String updateUser(UserUpdateDTO userUpdateDTO);

    String deleteUser(int id);
}
