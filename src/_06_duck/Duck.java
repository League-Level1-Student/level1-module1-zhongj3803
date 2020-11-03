package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
int numberOfFriends;
String favoriteFood;

void quack() {
	System.out.println("Duck goes quack!");
}

void waddle() {
	System.out.println("Duck waddles away");
}

Duck(String favoriteFood, int numberOfFriends) {
    this.favoriteFood = favoriteFood;
    this.numberOfFriends = numberOfFriends;
}



}
