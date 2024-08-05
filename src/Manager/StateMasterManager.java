package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.StateMaster;

public interface StateMasterManager {
    List<StateMaster> getAllStates();
    Optional<StateMaster> getStateById(Long id);
    StateMaster createState(StateMaster stateMaster);
    Optional<StateMaster> updateState(Long id, StateMaster stateDetails);
    boolean deleteState(Long id);
}

