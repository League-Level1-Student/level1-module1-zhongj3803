package _06_duck;

public class Monkey {
int height;
int age;

void scream() {
	System.out.println("Monkey screams");
}

void jump() {
	System.out.println("Monkey jumps");
}

Monkey(int height, int age){
	this.height = height;
	this.age = age;
}
}
