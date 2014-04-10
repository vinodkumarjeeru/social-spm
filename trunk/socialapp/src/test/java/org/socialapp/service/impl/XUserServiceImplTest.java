package org.socialapp.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.socialapp.service.XUserService;
import org.socialapp.test.SocialTestCase;

public class XUserServiceImplTest extends SocialTestCase {

	private XUserService xUserService;

	@Before
	public void setUp() {
		xUserService = new XUserServiceImpl();
	}

	@Test
	public void testFindBy() {
		assertNotNull(xUserService.findBy("zarvis.a@gmail.com"));

	}

}
