package br.com.vitorpereira.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IuserRepository extends JpaRepository<UserModel, UUID> {

  UserModel findByUsername(String username);

}
