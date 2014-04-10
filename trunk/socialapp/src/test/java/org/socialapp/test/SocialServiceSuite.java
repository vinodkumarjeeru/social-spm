package org.socialapp.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.socialapp.service.impl.DistrictServiceImplTest;
import org.socialapp.service.impl.XUserServiceImplTest;

@RunWith(Suite.class)
@SuiteClasses({ XUserServiceImplTest.class, DistrictServiceImplTest.class })
public class SocialServiceSuite {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(SocialServiceSuite.class);
		List<Failure> failureList = result.getFailures();
		for (Failure fail : failureList) {
			System.out.println(fail.toString());
		}

	}

}
