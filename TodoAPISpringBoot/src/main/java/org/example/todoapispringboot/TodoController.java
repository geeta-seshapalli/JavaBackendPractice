package org.example.todoapispringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private static List<Todo> todolist = new ArrayList<>();

    public TodoController() {
        todolist = new ArrayList<>();
        todolist.add(new Todo(1, false, "Todo 1", 1));
        todolist.add(new Todo(2, true, "Todo  2", 2));
    }

    @GetMapping("/todos")
    public static List<Todo> getTodos() {
        return todolist;
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo newTodo){
        todolist.add(newTodo);
        return newTodo;
    }


}
