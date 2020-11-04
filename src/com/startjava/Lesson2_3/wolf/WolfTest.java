package com.startjava.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setGender("Male wolf");
		System.out.println(wolf.getGender());
		wolf.setNickname("Shram");
		System.out.println(wolf.getNickname());
		wolf.setWeight(19);
		System.out.println(wolf.getWeight());
		wolf.setAge(10);
		System.out.println(wolf.getAge());
		wolf.setColor("White");
		System.out.println(wolf.getColor());

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.wail();
		wolf.hunt();
	}
}