package com.startjava.Lesson1.conditional;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if(age > 20) {
			System.out.println("Относително взрослый человек");
		}

		boolean manGender = true;
		if(manGender) {
			System.out.println("Мужчина");
		}
		if(!manGender) {
			System.out.println("Женщина");
		}

		float height = 1.75f;
		if(height < 1.80) {
			System.out.println("Средний рост");
		} else {
			System.out.println("Высокий рост");
		}

		char firstNameLetter = 'M';
		if(firstNameLetter == 'M') {
			System.out.println("Имя начинается с буквы M");
		} else if(firstNameLetter == 'I') {
			System.out.println("Имя начинается с буквы I");
		} else {
			System.out.println("Любая другая буква");
		}
	}
}