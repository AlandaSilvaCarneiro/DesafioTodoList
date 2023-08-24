package br.com.alandev.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.alandev.todolist.entity.Todo;
import br.com.alandev.todolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

     public List<Todo> list(){
       Sort sort= Sort.by("prioridad").descending().and(Sort.by("nome").descending());
       
       
       return todoRepository.findAll(sort);
    }

     public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();

        
    }
     public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }

   
}
