package com.example.demo.Services;

import com.example.demo.entities.Hub_Master;
import com.example.demo.repositories.HubMasterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class HubMasterImpl implements HubMasterManager {
 @Autowired
	    private HubMasterRepository hubMasterRepository;
	    public void addHubMaster(Hub_Master hubMaster) {
			// TODO Auto-generated method stub
			hubMasterRepository.save(hubMaster);
			
		}

		public List<Hub_Master> getAllHubs() {
			// TODO Auto-generated method stub
			return hubMasterRepository.findAll();
		}

		public Optional<Hub_Master> getHubById(int id) {
			// TODO Auto-generated method stub
			return hubMasterRepository.findById(id);
		}

		public void deleteHub(int id) {
			// TODO Auto-generated method stub
			hubMasterRepository.deleteById(id);
		}

		public Hub_Master updateHub(int id, Hub_Master hubMaster) {
			// TODO Auto-generated method stub
			if (!hubMasterRepository.existsById(id)) {
	            throw new RuntimeException("HubMaster not found with id " + id);
	        }
	        //hubMaster.setId(id);
	        return hubMasterRepository.save(hubMaster);
		}
       
	   
	    
	}

	

	

	

