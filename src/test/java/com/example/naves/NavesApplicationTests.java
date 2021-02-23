package com.example.naves;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@SpringBootTest
class NavesApplicationTests {

	@Test
	void contextLoads() {
		boolean a;
        if(2<3) {
        	a=false;
		}
		Assert.assertTrue(a);
	}

}
