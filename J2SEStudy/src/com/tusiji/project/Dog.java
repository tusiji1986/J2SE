package com.tusiji.project;

public class Dog extends Animal{
	
	public void dogEat() {
		eat();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.dogEat();

	}

}
