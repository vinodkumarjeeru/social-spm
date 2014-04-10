package org.socialapp.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.socialapp.domain.sub.XUser;
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
		assertNotNull(xUserService.findBy("aaa@gmail.com"));
	}

	@Test
	public void testGetAll() {
		assertNull(xUserService.getAll());
	}

	@Test
	public void testAuthenticate() {
		assertNotNull(xUserService.authenticate("aaa@gmail.com", "aaa"));
	}

	@Test
	public void testGetPassword() {
		String password = xUserService.getPassword("aaa@gmail.com",
				"What was your dream job as a child?", "Software Engineer");
		assertEquals(password, xUserService.getPassword("aaa@gmail.com",
				"What was your dream job as a child?", "Software Engineer"));
	}

}
