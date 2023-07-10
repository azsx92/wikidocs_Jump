package com.mysite.sbb.user;

import com.mysite.sbb.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public Site_User create(String username, String email, String password) {
        Site_User user = new Site_User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }

    public Site_User getUser(String username) {
        Optional<Site_User> site_user = this.userRepository.findByusername(username);
        if (site_user.isPresent()) {
            return site_user.get();
        } else {
            throw new DataNotFoundException("site_user not found");
        }
    }
}
