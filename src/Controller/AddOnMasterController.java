package com.example.demo.controllers;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.demo.Services.AddOnMasterManager;
import com.example.demo.entities.AddOnMaster;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/addons")
public class AddOnMasterController {

    @Autowired
    private AddOnMasterManager addOnMasterService;

    // Get all add-ons
    @GetMapping
    public List<AddOnMaster> getAllAddOns() {
        return addOnMasterService.getAllAddOns();
    }

    // Get a single add-on by ID
    @GetMapping("/{id}")
    public ResponseEntity<AddOnMaster> getAddOnById(@PathVariable Long id) {
        Optional<AddOnMaster> addOnMaster = addOnMasterService.getAddOnById(id);
        return addOnMaster.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new add-on
    @PostMapping
    public AddOnMaster createAddOn(@RequestBody AddOnMaster addOnMaster) {
        return addOnMasterService.createAddOn(addOnMaster);
    }

    // Update an existing add-on
    @PutMapping("/{id}")
    public ResponseEntity<AddOnMaster> updateAddOn(@PathVariable Long id, @RequestBody AddOnMaster addOnMasterDetails) {
        AddOnMaster updatedAddOn = addOnMasterService.updateAddOn(id, addOnMasterDetails);
        if (updatedAddOn != null) {
            return ResponseEntity.ok(updatedAddOn);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete an add-on
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddOn(@PathVariable Long id) {
        addOnMasterService.deleteAddOn(id);
        return ResponseEntity.ok().build();
    }
}

