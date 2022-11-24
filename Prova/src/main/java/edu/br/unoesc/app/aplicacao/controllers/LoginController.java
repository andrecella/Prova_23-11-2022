package edu.br.unoesc.app.aplicacao.controllers;

import edu.br.unoesc.app.aplicacao.entities.User;
import edu.br.unoesc.app.aplicacao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/aplicacao")
    public String login(Model model) {

        return "aplicacao/login_view";
    }

    @GetMapping("/")
    public String home(Model model) {

        return "aplicacao/home_view";
    }

    @GetMapping("/users")
    public String hello(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("usuariosAtivos", users);
        return "aplicacao/user_view";
    }

    @GetMapping("/logout")
    public String logout(Model model) {
        return "redirect:/aplicacao";
    }
}
