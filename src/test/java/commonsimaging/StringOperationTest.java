package commonsimaging;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringOperationTest {
	 
	/**
	 * Test StringOperation
	 */
	@Test
	 public void testStringPrint(){
		 final String testString = "hello";
		 final StringOperation sp = new StringOperation();
		 Assert.assertEquals("HELLO", sp.convertToUpperCase(testString), "StringPrint.convertToUpperCase is not working properly");
	 }
}
