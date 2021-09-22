package com.simha.SpringJPADemoForQueryResults;

@FunctionalInterface
public interface TestFunctionalInterface {

	void m4();

	default void m1() {
		System.out.println("default m1 method");
	}

	default void m2() {
		System.out.println("default m2 method");
	}

	static void m3() {
		System.out.println("static m3 method");
	}

}
