package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.GenericData;
import generic.Generic_class;
import pom.Pom;

public class SampleTest1 extends Generic_class {

	@Test
	public void test()
	{
		String u_name = GenericData.GetData("Sheet1", 0, 0);
		String password = GenericData.GetData("Sheet1", 0, 1);
		Pom p=new Pom(driver);
		p.un(u_name);
		p.pwd(password);
		//Assert.fail();
		p.btn();
		
		
	}
}
