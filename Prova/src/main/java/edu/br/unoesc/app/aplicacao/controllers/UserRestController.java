package edu.br.unoesc.app.aplicacao.controllers;

import edu.br.unoesc.app.aplicacao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.br.unoesc.app.aplicacao.entities.User;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {

        return userService.getActiveUsers();
    }

}
