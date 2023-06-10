package com.vnkt.rama;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class RamaApplicationTests {

	static Logger logger = LoggerFactory.getLogger(RamaApplicationTests.class);

	@Test
	void contextLoads() {

		logger.info("Test Case Executing....");


		assertEquals(true, true);


	}

}
