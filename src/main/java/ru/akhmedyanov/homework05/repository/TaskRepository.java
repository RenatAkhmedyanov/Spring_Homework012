package ru.akhmedyanov.homework05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.akhmedyanov.homework05.model.Task;
import ru.akhmedyanov.homework05.model.TaskStatus;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Получить задачи по статусу
     * @param status
     * @return
     */
    List<Task> getTasksByStatus(TaskStatus status);
}
