package org.spaceit.iterator_pattern;

import org.spaceit.beans.User;
import org.spaceit.beans.UserRepository;

/**
 * Created by gkstn_000 on 2015-11-26.
 */
public class UserRepositoryIterator implements Iterator {


    private UserRepository userRepository;
    private int index;

    public UserRepositoryIterator(UserRepository userRepository){
        this.userRepository = userRepository;
        this.index = 0;
    }

    @Override
    public Object next() {
        User user = userRepository.getUsersAt(index);
        index++;
        return user;
    }

    @Override
    public boolean hasNext() {
        if(index < userRepository.getLength() ){
            return true;
        }else {
            return false;
        }
    }
}
