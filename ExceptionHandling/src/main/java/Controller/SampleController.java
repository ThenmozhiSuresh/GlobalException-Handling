package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Exception.ResourceNotFoundException;
import Model.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class SampleController {

    private static Map<Long, User> users = new HashMap<>();

    static {
        users.put(1L, new User(1L, "John Doe"));
        users.put(2L, new User(2L, "Jane Smith"));
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        if (!users.containsKey(id)) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
        return users.get(id);
    }
}
