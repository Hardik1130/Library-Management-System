package com.hardikfunny.library.controller;

import com.hardikfunny.library.dto.*;
import com.hardikfunny.library.entity.Author;
import com.hardikfunny.library.entity.User;
import com.hardikfunny.library.repo.UserRepo;
import com.hardikfunny.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    //For Saving The User
    @PostMapping(value = "/saveUser")
    public String saveUser(@RequestBody UserDTO userDTO)
    {
        User user = userService.addUser(userDTO);
        return user.getUserName()+" Added SuccessFully";
    }

    //Retrieve Method - Retrieve All the Users
    @GetMapping(value = "/getAllUsers")
    public List<UserDTO> getAllUsers()
    {
        return userService.getAllUsers();
    }


    //UpDate The User - Save The Updated Data
    @PutMapping(value = "/updateUser")
    public String updateAuthor(@RequestBody UserUpdateDTO userUpdateDTO)
    {
        return userService.updateUser(userUpdateDTO)+ " Updated SuccessFully";
    }

    //Delete The User - Delete The User
    @DeleteMapping(value = "/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") int id)
    {
        String userName = userService.deleteUser(id);
        return userName+" Deleted SuccessFully";
    }



}
