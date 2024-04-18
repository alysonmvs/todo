package github.alysonmvs.todo.repository;

import github.alysonmvs.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}