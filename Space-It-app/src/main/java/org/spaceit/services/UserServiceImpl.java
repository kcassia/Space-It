package org.spaceit.services;

import org.spaceit.beans.Users;
import org.springframework.stereotype.Service;

/**
 * Created by gkstn_000 on 2015-11-23.
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public String getData(Users users) {
        switch (users.getGender()){
            case "male":
            case "female":
                return "Hello a "+users.getGender();
            case "another":
                return "Hello an "+users.getGender();
        }
        return null;
    }
}
