package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.domain.TodoValuesDto;
import ee.taltech.spring.bookit.service.TodosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("todos")
public class TodosController {

    @Resource
    TodosService todosService;

    @GetMapping(value = "/{id}")
    public String getTodoById(Model model, @PathVariable Long id) {
        Todo todo = todosService.getTodo(id);
        model.addAttribute("example_todo", todo);
        return "todos";
    }

    @GetMapping()
    public String getAllTodos(Model model) {
        List<Todo> allTodos = todosService.findAllTodos();
        model.addAttribute("todos", allTodos);
        return "todo-list";
    }

    @PostMapping("form")
    public @ResponseBody Todo addTodo(@ModelAttribute Todo todo) {
        Todo result = todosService.addTodo(todo);
        return result;
    }

    @GetMapping("form")
    public String getForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "form";
    }

    @GetMapping("change")
    public String getChangeForm(Model model) {
        TodoValuesDto todoValuesDto = new TodoValuesDto();
        todoValuesDto.setTodos(todosService.findAllTodos());
        model.addAttribute("form", todoValuesDto);
        return "change-todos";
    }

    @PostMapping("change")
    public String saveChangeForm(Model model, @ModelAttribute TodoValuesDto dto) {
        todosService.saveAll(dto.getTodos());

        model.addAttribute("form", dto);
        return "change-todos";
    }
}
