package io.summerx.sso.authentication.service;

import io.summerx.sso.authentication.userdetails.UserDetails;

/**
 * Created by xiayg on 7/12/2016.
 */
public interface UserService {

    UserDetails loadUserByUsername(String username);
}
