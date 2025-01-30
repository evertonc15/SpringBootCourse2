package com.github.evertonc15.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return todoRepository.save(novoTodo);
    }
}
