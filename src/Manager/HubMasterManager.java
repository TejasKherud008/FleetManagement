package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Hub_Master;

public interface HubMasterManager {
	public void addHubMaster(Hub_Master hubMaster);
	public List<Hub_Master> getAllHubs(); 
	public Optional<Hub_Master> getHubById(int id);
	public void deleteHub(int id);
	public Hub_Master updateHub(int id, Hub_Master hubMaster);
}
