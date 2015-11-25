package org.spaceit.beans;

import org.spaceit.iterator_pattern.Aggregate;
import org.spaceit.iterator_pattern.Iterator;
import org.spaceit.iterator_pattern.UserRepositoryIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gkstn_000 on 2015-11-26.
 */
public class UserRepository implements Aggregate {

    private List<User> userList = null;
    private int last =0;

    UserRepository(){
        userList = new ArrayList<>();
    }

    public User getUsersAt(int index){
        return userList.get(index);
    }

    public void appendUsers(User user){
        userList.add(user);
        last++;
    }

    public int getLength(){
        return last;
    }

    public Iterator iterator(){
        return new UserRepositoryIterator(this);
    }

}
