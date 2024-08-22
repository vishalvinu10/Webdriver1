package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
	
	@Parameters({"b"})
	@Test

	public static void main(String v) {

       System.out.println("The value is "+ v);

	}

}
