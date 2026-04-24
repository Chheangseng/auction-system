package tcs.project.client_auction_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Greeting {
    @GetMapping("/public/greeting")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("Hello world");
    }
}
