package ru.netology.JCLO_2.repository;

import org.springframework.stereotype.Repository;
import ru.netology.JCLO_2.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("123")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("manager") && password.equals("1234")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("12345")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}