package com.qiantanfengyun.GTD.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
@CrossOrigin("http://localhost:8081")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping(path="/save")
    public @ResponseBody String save (@RequestBody Task task) {
        taskRepository.save(task);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Task> all () {
        return taskRepository.findAll();
    }

}
