package org.spaceit.services;

import org.spaceit.beans.User;
import org.spaceit.beans.UserRepository;
import org.spaceit.iterator_pattern.Iterator;
import org.springframework.stereotype.Service;

/**
 * Created by gkstn_000 on 2015-11-23.
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public String getData(User user) {
        switch (user.getGender()){
            case "male":
            case "female":
                return "Hello a "+ user.getGender();
            case "another":
                return "Hello an "+ user.getGender();
        }
        return null;
    }

    public String FindSyncbyIndex(UserRepository userRepository, int index){

        User nowUser = userRepository.getUsersAt(index);
        Iterator it = userRepository.iterator();

        String result = "";

        while(it.hasNext()){
            User user = (User)it.next();

            if(user.getTime().equals(null) || nowUser == user || nowUser.getAddr().equals(user.getAddr())){
                continue;
            }
            result += user.getGender() + "\t::\t" +user.getTime()+"\t::\t"+user.getAddr()+"\n";
        }
        return result;
    }
}
