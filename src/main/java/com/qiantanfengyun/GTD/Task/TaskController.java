package com.qiantanfengyun.GTD.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addTask (@RequestParam Task task) {
        taskRepository.save(task);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Task> getAllTasks () {
        return taskRepository.findAll();
    }

}
