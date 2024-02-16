package com.example.demo_db.service;

import com.example.demo_db.entity.User;
import com.example.demo_db.entity.UserRepository;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        // Add any processing logic here before saving to the repository
        // For example, validation, manipulation, etc.
        // if(user.getEmail().contains("@")){
        //     return new ResponseEntity<>(new CustomResponse("unauthorized"), HttpStatus.UNAUTHORIZED);

        // }

        return userRepository.save(user);
    }
    static class CustomResponse {
        private final String message;

        public CustomResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
