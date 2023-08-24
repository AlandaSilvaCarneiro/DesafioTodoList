package br.com.alandev.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alandev.todolist.entity.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long>{
    
}
