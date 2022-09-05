package com.example.springrest.repository;

import com.example.springrest.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities (String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("<admin>") && password.equals("<0000>")) {
            Collections.addAll(authorities, Authorities.READ,Authorities.WRITE,Authorities.DELETE);
        } else if (user.equals("<editor>") && password.equals("<1111>")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("<user>") && password.equals ("<1234>"))  {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
