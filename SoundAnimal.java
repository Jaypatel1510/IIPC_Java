package pack;


abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void makeSound();
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
	@Override
	void makeSound() {
		System.out.println(name +"-->bark!");
	}
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name +"--->meows!");
    }
}

public class SoundAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 3);
        Cat cat = new Cat("kitty", 5);

        dog.makeSound();
        cat.makeSound();
    }
}