package org.spaceit.services;

import org.spaceit.beans.User;
import org.spaceit.beans.UserRepository;

/**
 * Created by gkstn_000 on 2015-11-23.
 */
public interface UserService {

    public abstract String getData(User user);
    public abstract String FindSyncbyIndex(UserRepository userRepository, int index);
}
