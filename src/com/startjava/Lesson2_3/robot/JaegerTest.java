package com.startjava.Lesson2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger coyoteTango = new Jaeger();

		coyoteTango.setMark("Mark-1");
		coyoteTango.setStatus("Destroyed");
		coyoteTango.setOrigin("Japan");
		coyoteTango.setHeight(85.3f);
		coyoteTango.setWeight(2000.312);
		coyoteTango.setSpeed(5);

		System.out.println(coyoteTango.getMark());
		System.out.println(coyoteTango.getStatus());
		System.out.println(coyoteTango.getOrigin());
		System.out.println(coyoteTango.getHeight());
		System.out.println(coyoteTango.getWeight());
		System.out.println(coyoteTango.getSpeed());

		coyoteTango.shoot();
		coyoteTango.go();

		Jaeger obsidianFury = new Jaeger();

		obsidianFury.setMark("Mark-5");
		obsidianFury.setStatus("Destroyed");
		obsidianFury.setOrigin("Australia");
		obsidianFury.setHeight(76.2f);
		obsidianFury.setWeight(1000.850);
		obsidianFury.setSpeed(10);

		System.out.println(obsidianFury.getMark());
		System.out.println(obsidianFury.getStatus());
		System.out.println(obsidianFury.getOrigin());
		System.out.println(obsidianFury.getHeight());
		System.out.println(obsidianFury.getWeight());
		System.out.println(obsidianFury.getSpeed());

		obsidianFury.shoot();
		obsidianFury.go();
	}
}