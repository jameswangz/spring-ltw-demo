package com.example.ltw.demo;

import com.example.ltw.demo.models.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LtwDemoApplicationTests {

	@Test
	void contextLoads() {
		Foo foo = new Foo();
		assertEquals("hello", foo.sayHello());
	}

}
