package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.StateMaster;
import com.example.demo.repositories.StateMasterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StateMasterManagerImpl implements StateMasterManager {

    @Autowired
    private StateMasterRepository stateMasterRepository;

    @Override
    public List<StateMaster> getAllStates() {
        return stateMasterRepository.findAll();
    }

    @Override
    public Optional<StateMaster> getStateById(Long id) {
        return stateMasterRepository.findById(id);
    }

    @Override
    public StateMaster createState(StateMaster stateMaster) {
        return stateMasterRepository.save(stateMaster);
    }

    @Override
    public Optional<StateMaster> updateState(Long id, StateMaster stateDetails) {
        return stateMasterRepository.findById(id).map(state -> {
            state.setStateName(stateDetails.getStateName());
            return stateMasterRepository.save(state);
        });
    }

    @Override
    public boolean deleteState(Long id) {
        if (stateMasterRepository.existsById(id)) {
            stateMasterRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
