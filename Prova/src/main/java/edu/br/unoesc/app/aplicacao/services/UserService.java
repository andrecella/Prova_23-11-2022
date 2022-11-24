package edu.br.unoesc.app.aplicacao.services;

import edu.br.unoesc.app.aplicacao.entities.User;
import edu.br.unoesc.app.aplicacao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<List<User>> getActiveUsers(){

        List<User> users = userRepository.findAll();
        List<User> actUsers = new ArrayList<>();
        for (User user:users) {
            if(user.isEnabled())
                actUsers.add(user);
        }
        return ResponseEntity.ok(actUsers);

    }
}
