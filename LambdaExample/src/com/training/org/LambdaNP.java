package com.training.org;

@FunctionalInterface
interface Statement {
	public String greet();
}

public class LambdaNP {
	public static void main(String[] args) {
		Statement s = () -> {
			return "Hello World. Welcome to lambda.";
		};
		System.out.println(s.greet());
	}
}