package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.demo.Services.StateMasterManager;
import com.example.demo.entities.StateMaster;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/states")
public class StateMasterController {

    @Autowired
    private StateMasterManager stateMasterService;

    @GetMapping
    public List<StateMaster> getAllStates() {
        return stateMasterService.getAllStates();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StateMaster> getStateById(@PathVariable Long id) {
        Optional<StateMaster> stateMaster = stateMasterService.getStateById(id);
        return stateMaster.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public StateMaster createState(@RequestBody StateMaster stateMaster) {
        return stateMasterService.createState(stateMaster);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StateMaster> updateState(@PathVariable Long id, @RequestBody StateMaster stateDetails) {
        Optional<StateMaster> updatedState = stateMasterService.updateState(id, stateDetails);
        return updatedState.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteState(@PathVariable Long id) {
        if (stateMasterService.deleteState(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
	