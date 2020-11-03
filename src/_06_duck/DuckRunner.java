package _06_duck;

public class DuckRunner {
public static void main(String[] args) {
	Duck daffy = new Duck("donuts",5);
	Monkey bob = new Monkey(45,7);
	daffy.quack();
	daffy.waddle();
	bob.scream();
	bob.jump();
}
}
