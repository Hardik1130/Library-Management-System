package com.hardikfunny.library.service.IMPL;

import com.hardikfunny.library.dto.UserDTO;
import com.hardikfunny.library.dto.UserSaveDTO;
import com.hardikfunny.library.dto.UserUpdateDTO;
import com.hardikfunny.library.entity.User;
import com.hardikfunny.library.repo.UserRepo;
import com.hardikfunny.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public User addUser(UserDTO userDTO) {
        User user = new User(userDTO.getUserName(), userDTO.getEmail());
        userRepo.save(user);
        return user;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepo.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : users)
        {
            UserDTO userDTO = new UserDTO(user.getUserId(), user.getUserName(), user.getEmail());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public String updateUser(UserUpdateDTO userUpdateDTO) {

        if (userRepo.existsById(userUpdateDTO.getUserId()))
        {
            User user = userRepo.getById(userUpdateDTO.getUserId());
            user.setUserName(userUpdateDTO.getUserName());
            user.setEmail(userUpdateDTO.getEmail());
            userRepo.save(user);
            return user.getUserName();
        }
        else {
            System.out.println("User Not Found!!!");
        }
        return null;
    }

    @Override
    public String deleteUser(int id) {
        if (userRepo.existsById(id)) {
            User user = userRepo.findById(id).get();
            userRepo.deleteById(id);
            return user.getUserName();
        }
        else {
            System.out.println("User Not Found!!!");
        }
        return null;
    }


}
