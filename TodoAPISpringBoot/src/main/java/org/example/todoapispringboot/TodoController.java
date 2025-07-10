package org.example.todoapispringboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo newTodo){
        todolist.add(newTodo);
        return newTodo;
    }

    @GetMapping("/todos/{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long todoId) {
        for (Todo todo : todolist) {
            if (todo.getId() == todoId) {
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.notFound().build();
    }

}
