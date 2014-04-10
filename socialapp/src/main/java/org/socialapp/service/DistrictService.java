/**
 * 
 */
package org.socialapp.service;

import java.util.List;

import org.socialapp.domain.sub.District;

/**
 * @author Sudarsan
 *
 */
public interface DistrictService {

	void createOrUpdate(District district);
	
	List<District> getAll();
	
	District findBy(String districtName);
	
}
