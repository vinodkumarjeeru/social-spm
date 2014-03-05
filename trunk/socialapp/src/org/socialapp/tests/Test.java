package org.socialapp.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.socialapp.domain.sub.District;
import org.socialapp.service.DistrictService;
import org.socialapp.service.impl.DistrictServiceImpl;

public class Test {

	private static final Logger LOG = Logger.getLogger(Test.class);

	public static void main(String[] args) {

		DistrictService districtService = new DistrictServiceImpl();
		District district = districtService.findBy("Krishna");

		System.out.println(district.getDistrictName() + "\t"
				+ district.getDistrictCapital());
		// System.out.println(districtService.getAll());

		// District district = new District();
		// district.setId(1L);
		// district.setDistrictId(1L);
		// district.setDistrictName("Krishna");
		// district.setDistrictCapital("MTM");
		// district.setState("AP");
		// district.setCreatedOn(new java.util.Date());
		// district.setCreatedBy(1L);
		// district.setModifiedOn(new java.util.Date());
		// district.setModifiedBy(1L);
		// district.setActive(1L);
		//
		// InputStream inputStream = null;
		// try {
		// inputStream = new FileInputStream(new File("D:/Tulips.jpg"));
		// byte[] bytes = new byte[inputStream.available()];
		// inputStream.read(bytes);
		// district.setDistrictMap(bytes);
		//
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// } finally {
		// if (inputStream != null) {
		// try {
		// inputStream.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		// }
		//
		// districtService.create(district);

	}

}
