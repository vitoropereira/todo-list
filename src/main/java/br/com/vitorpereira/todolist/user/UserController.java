package br.com.vitorpereira.todolist.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }

  @GetMapping("/teste")
  public String teste() {
    return "testado!!";
  }
}
