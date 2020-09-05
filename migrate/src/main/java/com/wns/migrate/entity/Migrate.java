package com.wns.migrate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Entity class for MIGRATE_TEST table
 * @author Satya
 *
 */
@Entity
@Table(name = "MIGRATE_TEST")
@Data
public class Migrate {
	
	@Id
	private int id;
	
	@Column
	private String NVIC;
	
	@Column
	private String VEHCAT;
	
	@Column
	private String AMPACPT;
	
	@Column
	private String AAMACPT;
	
	@Column
	private String APIACPT;
	
	@Column
	private String GIOACPT;
	
	@Column
	private String SUNACPT;
	
	@Column
	private String SHNACPT;
	
	@Column
	private String GIOCIACPT;
	
	@Column
	private String JCIACPT;
	
	@Column
	private String BINGLEACPT;
	
	@Column
	private String ESSACPT;
	
	@Column
	private String V03ACPT;
	
	@Column
	private String V05ACPT;
	
	@Column
	private String AAMRULE;
	
	@Column
	private String AMPRULE;
	
	@Column
	private String APIRULE;
	
	@Column
	private String GIORULE;
	
	@Column
	private String SUNRULE;
	
	@Column
	private String SHNRULE;
	
	@Column
	private String ESSRULE;
	
	@Column
	private String V03RULE;
	
	@Column
	private String V05RULE;
	
	@Column
	private String JCIRULE;
	
	@Column
	private String GIOCIRULE;
	
	@Column
	private String BINGLERULE;
	
	@Column
	private String IMRACPT;
	
	@Column
	private String IMRRULE;

}
