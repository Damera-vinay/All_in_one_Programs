package com.nit.blc;




public class Animalnames {
	public  Animal() {
		System.out.println("Animal is eating");
	}
}
class Mammal extends Animalnames{
	public void walk() {
		System.out.println("Mammal is walking");	
	}
}
 class Dog extends Mammal{
	public void bark() {
		System.out.println("Dog is barking");	
	}
}

