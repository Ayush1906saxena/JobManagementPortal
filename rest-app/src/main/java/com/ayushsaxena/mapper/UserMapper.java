package com.ayushsaxena.mapper;

import com.ayushsaxena.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<String> getUsers();
    User getUser();
    void addUser(User user);
    void updateUser(User user);
    User getUserByEmail(String email);

}
