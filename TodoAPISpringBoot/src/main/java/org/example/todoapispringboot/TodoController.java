package org.example.todoapispringboot;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private static List<String> todos;

    public TodoController() {
        todos = new ArrayList<String>();
    }
}
