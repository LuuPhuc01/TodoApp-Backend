package com.phucluu.Controller;

import com.phucluu.Exception.NotFoundException;
import com.phucluu.Model.Todo;
import com.phucluu.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping("/get")
    public List<Todo> getTodo(){
        return todoRepository.findAll();
    }
    @PostMapping("/post")
    public Todo addTodo(@RequestBody Todo newTodo){
        return todoRepository.save(newTodo);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTodo(@PathVariable Integer id){
        if(!todoRepository.existsById(id)){
            throw new NotFoundException();
        }
        todoRepository.deleteById(id);
    }
    @PutMapping("/update/{id}")
    public Todo updateTodo(@PathVariable Integer id, @RequestBody Todo newTodo){
        return todoRepository.findById(id).map(todo ->
        {
            todo.setWorks(newTodo.getWorks());
            todo.setPriority(newTodo.getPriority());
            todo.setInitDay(newTodo.getInitDay());
            return todoRepository.save(todo);
        }).orElseThrow(()->new NotFoundException());
    }
    @GetMapping("/get/{id}")
     public Todo getTodoById(@PathVariable Integer id){
        return todoRepository.findById(id).orElseThrow(()->new NotFoundException());
    }

}
