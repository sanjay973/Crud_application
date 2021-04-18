package com.crud.crud.Service;

import com.crud.crud.Model.UserData;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface UserDataService {
    List<UserData> getAllUsers();
    void saveUser(UserData userData);
    public UserData getUserById(int id);
    public void deleteUser(int id);
}
