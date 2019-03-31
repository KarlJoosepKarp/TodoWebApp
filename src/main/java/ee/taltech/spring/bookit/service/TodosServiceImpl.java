package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.repository.TodosRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TodosServiceImpl implements TodosService {

    @Resource
    TodosRepository todosRepository;

    @Override
    public Todo getTodo(Long id) {
        return todosRepository.getOne(id);
    }

    @Override
    public List<Todo> findAllTodos() {
        return todosRepository.findAll();
    }

    @Override
    public Todo addTodo(Todo todo) {
        return todosRepository.save(todo);
    }

    @Override
    public void saveAll(List<Todo> todos) {
        todosRepository.saveAll(todos);
    }
}
