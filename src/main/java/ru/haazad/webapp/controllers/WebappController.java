package ru.haazad.webapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.haazad.webapp.models.User;
import ru.haazad.webapp.services.UserService;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class WebappController {

    private final UserService userService;

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
    
    @GetMapping("/unsecured")
    public String showUnsecuredPage() {
        return "unsecured";
    }

    @GetMapping("/auth_page")
    public String showAuthPage() {
        return "authenticated";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPERADMIN')")
    public String showAdminPage() {
        return "admin";
    }

    @GetMapping("/user_info")
    public String showUserInfo(Principal principal) {
        User user = userService.findByUsername(principal.getName()).orElseThrow(() -> new RuntimeException("Unable to find user " + principal.getName()));
        return String.format("User is %s, email is %s", user.getUsername(), user.getEmail());
    }
}
