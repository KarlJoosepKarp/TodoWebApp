package ee.taltech.spring.bookit.domain;

import java.util.ArrayList;
import java.util.List;

public class TodoValuesDto {
    List<Todo> todos = new ArrayList<>();

    public void add(Todo todo){
        this.todos.add(todo);
    }
    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
