package result;

import org.testng.Assert;

import org.testng.annotations.Test;
public class test {
	
	public void testPass() {
	Assert.assertEquals(app.display(55), "pass");
	}
	@Test
	public void testFail() {
	Assert.assertEquals(app.display(35), "fail");
	}
	@Test
	public void testInvalid() {
	Assert.assertEquals(app.display(-5), "invalid");
	}
	}

