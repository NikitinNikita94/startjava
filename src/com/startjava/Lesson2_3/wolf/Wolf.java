package com.startjava.Lesson2_3.wolf;

public class Wolf {

	private String gender = "Male";
	private String nickname = "White";
	private int weight = 23;
	private int age = 7;
	private String color = "Black";

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void go() {
		System.out.println("Wolf go");
	}

	void sit() {
		System.out.println("Wolf sit down");
	}

	void run() {
		System.out.println("Wolf running");
	}

	void wail() {
		System.out.println("Wolf wail");
	}

	void hunt() {
		System.out.println("Wolf hunter");
	}
}