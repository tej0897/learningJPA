package com.learningJPA.learningJPA;

import com.learningJPA.learningJPA.Entity.User;
import com.learningJPA.learningJPA.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserControllerCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserController userController;
    private static final Logger log = LoggerFactory.getLogger(UserControllerCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Tej", "Admin");
        long insert = userController.insertUser(user);
        log.info("New User is Created : "+user);


    }
}
