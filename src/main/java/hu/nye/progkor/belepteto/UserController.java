package hu.nye.progkor.belepteto;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {
    @GetMapping("/registration")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String userSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "result";
    }
}
