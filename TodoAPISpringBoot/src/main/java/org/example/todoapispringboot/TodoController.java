package org.example.todoapispringboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    private static List<Todo> todolist = new ArrayList<>();

    public TodoController() {
        todolist = new ArrayList<>();
        todolist.add(new Todo(1, false, "Todo 1", 1));
        todolist.add(new Todo(2, true, "Todo  2", 2));
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getTodos(@RequestParam(required = false) String isCompleted) {
        System.out.println("Incoming query param: " + isCompleted);
        return ResponseEntity.ok(todolist);
    }

    @GetMapping("/")
    public static List<Todo> getTodos() {

        return todolist;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo newTodo){
        todolist.add(newTodo);
        return newTodo;
    }

    @GetMapping("/{todoId}")
    public ResponseEntity<?> getTodoById(@PathVariable Long todoId) {
        for (Todo todo : todolist) {
            if (todo.getId() == todoId) {
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo not found");
    }


    @DeleteMapping("/{todoId}")
    public ResponseEntity<?> deleteTodoById(@PathVariable Long todoId) {
        for (Todo todo : todolist) {
            if (todo.getId() == todoId) {
                todolist.remove(todo);
                return ResponseEntity.ok("Todo deleted successfully");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo not found");
    }


    @PatchMapping("/{todoId}")
    public ResponseEntity<?> updateTodoPartially(@PathVariable Long todoId, @RequestBody Todo updateFields){
        for (Todo todo : todolist) {
            if (todo.getId() == todoId) {
                if (updateFields.getTitle() != null) {
                    todo.setTitle(updateFields.getTitle());
                }
                if (updateFields.getUserId() != 0){
                    todo.setUserId(updateFields.getUserId());
                }
              todo.setCompleted(updateFields.isCompleted());
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo not found");    }
}
