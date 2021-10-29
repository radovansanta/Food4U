package com.example.Food4U.Controller;

import com.example.Food4U.Model.User;
import com.example.Food4U.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController
{
  @Autowired
  private UserRepository userRepository;

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @PostMapping("/users")
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }

  @GetMapping("/users/{username}")
  public ResponseEntity<User> getEmployeeById(@PathVariable(value = "username") String userUsername)
      throws Exception {
      User employee = userRepository.findById(userUsername).orElseThrow(() -> new Exception("User not found"));
    return ResponseEntity.ok().body(employee);
  }
}
