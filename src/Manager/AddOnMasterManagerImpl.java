package com.example.demo.Services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.AddOnMaster;
import com.example.demo.repositories.AddOnMasterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AddOnMasterManagerImpl implements AddOnMasterManager {

    @Autowired
    private AddOnMasterRepository addOnMasterRepository;

    @Override
    public List<AddOnMaster> getAllAddOns() {
        return addOnMasterRepository.findAll();
    }

    @Override
    public Optional<AddOnMaster> getAddOnById(Long id) {
        return addOnMasterRepository.findById(id);
    }

    @Override
    public AddOnMaster createAddOn(AddOnMaster addOnMaster) {
        return addOnMasterRepository.save(addOnMaster);
    }

    @Override
    public AddOnMaster updateAddOn(Long id, AddOnMaster addOnMasterDetails) {
        return addOnMasterRepository.findById(id)
                .map(addOnMaster -> {
                    addOnMaster.setAddonName(addOnMasterDetails.getAddonName());
                    addOnMaster.setAddonDailyRate(addOnMasterDetails.getAddonDailyRate());
                    addOnMaster.setRateValidUpto(addOnMasterDetails.getRateValidUpto());
                    return addOnMasterRepository.save(addOnMaster);
                }).orElse(null);
    }

    @Override
    public void deleteAddOn(Long id) {
        addOnMasterRepository.deleteById(id);
    }
}
