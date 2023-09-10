package com.TestProject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TestProjectApplicationTests {

private Calculator c = new Calculator();
	@Test
	void contextLoads() {
		int expectedValue = 11;
		int actualResult = c.sum(2,4,6);
		assertThat(actualResult).isEqualTo(expectedValue);
	}




}
