package com.example.demo.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.HubMasterManager;
import com.example.demo.entities.Hub_Master;


@RestController
@RequestMapping("/api/hub")
@CrossOrigin
public class HubMasterController {
	@Autowired
    private HubMasterManager hubmastermanage;

    @PostMapping
    public void saveHubmaster(@RequestBody Hub_Master hubMaster) {
    	hubmastermanage.addHubMaster(hubMaster);
    }

    @GetMapping
    public List<Hub_Master> showAllHub() {
        return hubmastermanage.getAllHubs();
    }

    @GetMapping("/{id}")
    public Optional<Hub_Master> showhubById(@PathVariable int id) {
        return hubmastermanage.getHubById(id);
    }

    @PutMapping("/{id}")
    public Hub_Master updatehub(@RequestBody Hub_Master hubMaster, @PathVariable int id) {
        return hubmastermanage.updateHub(id, hubMaster);
    }

    @DeleteMapping("/{id}")
    public void deleteHub(@PathVariable int id) {
    	hubmastermanage.deleteHub(id);
    }

}
