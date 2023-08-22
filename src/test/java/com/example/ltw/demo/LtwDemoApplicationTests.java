package com.example.ltw.demo;

import com.example.ltw.demo.models.Foo;
import com.example.ltw.demo.services.FooService;
import com.example.ltw.demo.services.FooServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LtwDemoApplicationTests {

	@Autowired
	private FooService fooService;

	@Test
	public void profilingAspect() {
		FooService fooService = new FooServiceImpl();
		fooService.sayHello();
	}

	@Test
	void ltw() {
		Foo foo = new Foo();
		assertEquals("hello", foo.sayHello());
	}




}
