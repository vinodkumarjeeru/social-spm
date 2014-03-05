package org.socialapp.tests;

import org.socialapp.domain.sub.District;
import org.socialapp.service.DistrictService;
import org.socialapp.service.impl.DistrictServiceImpl;

public class Test {

	public static void main(String[] args) {

		DistrictService districtService = new DistrictServiceImpl();

		District district = new District();
		district.setDistrictId(1L);
		district.setDistrictName("Krishna");
		district.setDistrictCapital("MTM");
		district.setState("AP");
		district.setCreatedOn(new java.util.Date());
		district.setCreatedBy(1L);
		district.setModifiedOn(new java.util.Date());
		district.setModifiedBy(1L);
		district.setActive(1L);

		districtService.create(district);

	}

}
