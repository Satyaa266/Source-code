package com.wns.migrate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

/**
 * Entity class for FINAL_CRIT_EXT table
 * @author Satya
 *
 */
@Entity
@Table (name = "FINAL_CRIT_EXT", schema = "wns")
@Data
public class FinalCritExt {
	
	@CsvBindByName(column = "ADDMOD")
	@Column(name = "ADDMOD")
	private String addMod;
	
	@CsvBindByName(column = "NVIC")
	@Id
	@Column(name = "NVIC")
	private String nvic;
	
	@CsvBindByName(column = "VEHCAT")
	@Column(name = "VEHCAT")
	private String vechat;
	
	@CsvBindByName(column = "COMPANY")
	@Column(name = "COMPANY")
	private String company;
	
	@CsvBindByName(column = "EFFECTIVE START DATE")
	@Column(name = "EFFECTIVEDATE")
	private String effectiveDate;
	
	@CsvBindByName(column = "EFFECTIVE STRART TIME")
	@Column(name = "CHANGETIMESTAMP")
	private String changeTimeStramp;
	
	@CsvBindByName(column = "EFFECTIVE END DATE")
	@Column(name = "EFFECTIVEENDDATE")
	private String effectiveEndDate;
	
	@CsvBindByName(column = "EFFECTIVE END TIME")
	@Column(name = "ENDDATETIMESTAMP")
	private String endDateTimeStramp;
	
	@CsvBindByName(column = "ACCEPTCRIT")
	@Column(name = "ACCEPTCRIT")
	private String acceptCrit;
	
	@CsvBindByName(column = "INTERNETJEP")
	@Column(name = "INTERNETJEP")
	private String internetJep;
	

}
