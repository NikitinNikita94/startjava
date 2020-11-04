package com.startjava.variable;

public class Variable {
    public static void main(String[] args) {
       	byte windows = 10;
       	short typeSystem = 64;
       	int version = 1709;
       	float cpu = 2.00f;
       	double ram = 4.0000;
       	boolean windowsTrue = windows == 10;
       	char nameComputer = 'H';
       	long codeDevices = 1_254_687_578L;

       	System.out.println("Установлена операционная система Windows = " + windows);
       	System.out.println("Тип системы = " + typeSystem +"bit");
       	System.out.println("Версия = " + version);
       	System.out.println("Код устройства = " + codeDevices);
       	System.out.println("Процессор = " + cpu);
       	System.out.println("Оперативная память = " + ram);
       	System.out.println("На ПК точно установлена Windows 10 = " + windowsTrue);
       	System.out.println("Имя компьютера = " + nameComputer);
    }
}