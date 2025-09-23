package ifsp.web3.todoapp.controller;

import ifsp.web3.todoapp.entity.User;
import ifsp.web3.todoapp.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User saved = userRepository.save(user);
        return ResponseEntity.created(URI.create("/api/users/" + saved.getId())).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @Valid @RequestBody User payload) {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        User existing = opt.get();
        existing.setName(payload.getName());
        existing.setEmail(payload.getEmail());
        existing.setPassword(payload.getPassword());
        existing.setPhone(payload.getPhone());
        existing.setActive(payload.getActive() != null ? payload.getActive() : existing.getActive());
        User saved = userRepository.save(existing);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}/active")
    public ResponseEntity<User> changeActive(@PathVariable Long id, @RequestParam Boolean active) {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        User u = opt.get();
        u.setActive(active);
        User saved = userRepository.save(u);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}