package com.example.psotgresdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.createActor(actor);
    }

    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }
    @PutMapping("/{id}")
        public Actor updateActor(@PathVariable Long id, @RequestBody Actor actor) {
            return actorService.updateActor(id, actor);
        }

    @DeleteMapping("/{id}")
        public void deleteActor(@PathVariable Long id) {
            actorService.deleteActor(id);
        }
}        
        
