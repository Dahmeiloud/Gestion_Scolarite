package com.smart.projetsmart.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.smart.projetsmart.entity.UserApp;

public interface UserServices {

    public ResponseEntity<?> addUser(UserApp userInfo);

    public UserApp fidUserByUsername(String username);

    public void DeleteUser(Integer id);

    public boolean findUserById(Integer id);

    public List<UserApp> getUsers();
}
