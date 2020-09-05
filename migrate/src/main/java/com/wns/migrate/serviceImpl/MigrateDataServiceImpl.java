package com.wns.migrate.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wns.migrate.entity.FinalCritExt;
import com.wns.migrate.repository.FinalCritExtRepository;
import com.wns.migrate.service.MigrateDataService;

/**
 * Service class MigrateDataServiceImpl
 * @author Satya
 *
 */
@Service
public class MigrateDataServiceImpl implements MigrateDataService {
	
	@Autowired
	FinalCritExtRepository finalCritExtRepository;

	/**
	 * Method to retrieve all data 
	 * from FinalCritExt entity
	 */
	@Override
	public List<FinalCritExt> exportDataInCsv() {
		return finalCritExtRepository.findAll();
	}
	
	
	
	

}
