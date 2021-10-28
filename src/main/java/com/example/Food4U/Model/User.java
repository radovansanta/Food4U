package com.example.Food4U.Model;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class User
{
  private String username;
  private String password;

  public User() {

  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Id
  @Column(name = "username", nullable = false)
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  @Column(name = "password", nullable = false)
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  @Override public String toString()
  {
    return "User{" + "username='" + username + '\'' + ", password='" + password
        + '\'' + '}';
  }
}
