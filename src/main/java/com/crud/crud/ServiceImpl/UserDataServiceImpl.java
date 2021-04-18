package com.crud.crud.ServiceImpl;

import com.crud.crud.Model.UserData;
import com.crud.crud.Repository.UserDataRepository;
import com.crud.crud.Service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public List<UserData> getAllUsers() {
        return (List<UserData>) userDataRepository.findAll();
    }

    @Override
    public void saveUser(UserData userData) {
        this.userDataRepository.save(userData);
    }

    @Override
    public UserData getUserById(int id) {
        Optional<UserData> userData=userDataRepository.findById(id);
        if(!userData.isPresent()){
            return null;
        }
        return userData.get();
    }

    @Override
    public void deleteUser(int id) {
       this.userDataRepository.deleteById(id);
    }
}
