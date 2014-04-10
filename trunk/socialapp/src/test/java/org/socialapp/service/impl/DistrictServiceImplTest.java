package org.socialapp.service.impl;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.socialapp.domain.sub.District;
import org.socialapp.service.DistrictService;

public class DistrictServiceImplTest {

	private DistrictService districtService;

	@Before
	public void setUp() {
		districtService = new DistrictServiceImpl();
	}

	@Test
	public void testGetAll() {
		List<District> districtsList = districtService.getAll();
		assertEquals(districtsList.size(), districtService.getAll().size());
	}

	@Test
	public void testFindByDistrict() {
		assertNotNull(districtService.findBy("Adilabad"));
	}
}
