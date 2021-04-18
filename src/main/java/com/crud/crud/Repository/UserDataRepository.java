package com.crud.crud.Repository;

import com.crud.crud.Model.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends CrudRepository<UserData, Integer> {
}
