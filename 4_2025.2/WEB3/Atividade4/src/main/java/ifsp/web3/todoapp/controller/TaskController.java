package ifsp.web3.todoapp.controller;

import ifsp.web3.todoapp.entity.Task;
import ifsp.web3.todoapp.entity.User;
import ifsp.web3.todoapp.entity.Category;
import ifsp.web3.todoapp.repository.TaskRepository;
import ifsp.web3.todoapp.repository.UserRepository;
import ifsp.web3.todoapp.repository.CategoryRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;

    public TaskController(TaskRepository taskRepository, UserRepository userRepository, CategoryRepository categoryRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {
        Optional<User> u = userRepository.findById(task.getUser().getId());
        if (u.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        task.setUser(u.get());
        if (task.getCategory() != null && task.getCategory().getId() != null) {
            Optional<Category> c = categoryRepository.findById(task.getCategory().getId());
            c.ifPresent(task::setCategory);
        }
        Task saved = taskRepository.save(task);
        return ResponseEntity.created(URI.create("/api/tasks/" + saved.getId())).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<Task>> listAll() {
        return ResponseEntity.ok(taskRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id) {
        return taskRepository.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @Valid @RequestBody Task payload) {
        Optional<Task> opt = taskRepository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Task existing = opt.get();
        existing.setDescription(payload.getDescription());
        existing.setDate(payload.getDate());
        existing.setObservation(payload.getObservation());
        existing.setStatus(payload.getStatus());
        if (payload.getUser() != null && payload.getUser().getId() != null) {
            Optional<User> u = userRepository.findById(payload.getUser().getId());
            u.ifPresent(existing::setUser);
        }
        if (payload.getCategory() != null && payload.getCategory().getId() != null) {
            Optional<Category> c = categoryRepository.findById(payload.getCategory().getId());
            if (c.isPresent()) {
                existing.setCategory(c.get());
            } else {
                existing.setCategory(null);
            }
        } else {
            existing.setCategory(null);
        }
        Task saved = taskRepository.save(existing);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        Optional<Task> opt = taskRepository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        taskRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
