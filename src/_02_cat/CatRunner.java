package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat cat = new Cat("bob");
	cat.meow();
	cat.printName();
	for (int i = 0; i<11;i++) {
		cat.kill();
	}
}
}
