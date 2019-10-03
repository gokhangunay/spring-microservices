package com.rest.webservices.restfulwebservices.s01.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> userList = new ArrayList<>();

    private static int countId = 3;

    static {
        userList.add(new User(1, "Gökhan", new Date()));
        userList.add(new User(2, "Ahmet", new Date()));
        userList.add(new User(3, "Akif", new Date()));
    }

    public List<User> findAll(){
        return userList;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++countId);
        }
        userList.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user : userList){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

}
