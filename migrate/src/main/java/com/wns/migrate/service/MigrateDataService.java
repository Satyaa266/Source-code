package com.wns.migrate.service;

import java.util.List;

import com.wns.migrate.entity.FinalCritExt;

/**
 * Interface MigrateDataService
 * @author Satya
 *
 */
public interface MigrateDataService {
	
	/**
	 * Method to retrieve all data 
	 * from FinalCritExt entity
	 * @return
	 */
	public List<FinalCritExt> exportDataInCsv();

}
