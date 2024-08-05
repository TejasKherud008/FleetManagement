package com.example.demo.Services;





import java.util.List;
import java.util.Optional;

import com.example.demo.entities.AddOnMaster;

public interface AddOnMasterManager {
    List<AddOnMaster> getAllAddOns();
    Optional<AddOnMaster> getAddOnById(Long id);
    AddOnMaster createAddOn(AddOnMaster addOnMaster);
    AddOnMaster updateAddOn(Long id, AddOnMaster addOnMasterDetails);
    void deleteAddOn(Long id);
}
