package com.ibragimov.testapprailwey;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public List<Test> getTest() {
        return List.of(
                new Test("test1", 1, true),
                new Test("test2", 2, false),
                new Test("test3", 3, true)
        );
    }

    @PostMapping
    public String postTest(@RequestBody Test test) {
        return "Test saved";
    }
}
