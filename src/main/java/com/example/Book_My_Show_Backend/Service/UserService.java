package com.example.Book_My_Show_Backend.Service;

import com.example.Book_My_Show_Backend.Dtos.UserRequestDto;
import com.example.Book_My_Show_Backend.Models.UserEntity;
import com.example.Book_My_Show_Backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto){
        //Converted userRequestDto to UserEntity
        UserEntity user = UserEntity.builder().name(userRequestDto.getName()).mobileNo(userRequestDto.getMobile()).build();
        try{
            userRepository.save(user);
        }catch (Exception e){
            return "user could not added :( ";
        }
        return "user added successfully :)";
    }
}
