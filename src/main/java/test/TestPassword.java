package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TestPassword {
    @Autowired
    private static BCryptPasswordEncoder encoder;

    public static void main(String[] args) {
        PasswordEncoder ps = new BCryptPasswordEncoder();
        System.out.println(ps.encode("fdsf"));
    }
}
