package fiap.com.example.challenge.controller;

import fiap.com.example.challenge.model.chat.Chat;
import fiap.com.example.challenge.model.chat.ChatStatus;
import fiap.com.example.challenge.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/id")
    public List<Chat> getChatsById(@RequestParam UUID employeeId) {
        return chatService.getChatsByEmployeeId(employeeId);
    }

    @GetMapping("/status-id")
    public List<Chat> getChatsByStatus(@RequestParam UUID employeeId, @RequestParam ChatStatus status) {
        return chatService.getChatsByEmployeeIdAndStatus(employeeId, status);
    }

    @GetMapping("/timestamp")
    public List<Chat> getChatsAfter(@RequestParam LocalDateTime timestamp) {
        return chatService.getChatsByStartTimestampAfter(timestamp);
    }

    @GetMapping("/list")
    public List<Chat> listAllChats() {
        return chatService.getAllChats();
    }
}