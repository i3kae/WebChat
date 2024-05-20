package com.example.webchat;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatApiController {

    private List<Message> messages = new ArrayList<>();

    @PostMapping("/echo")
    public List<Message> echo(@RequestBody Message input) {
        messages.add(input);
        return messages;
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }
}