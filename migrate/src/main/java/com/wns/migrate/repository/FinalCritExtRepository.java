package com.wns.migrate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wns.migrate.entity.FinalCritExt;

/**
 * Repository class for FinalCritExt Entity
 * @author user
 *
 */
@Repository
public interface FinalCritExtRepository extends JpaRepository<FinalCritExt, String> {
	
}
