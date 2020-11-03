package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		String time = JOptionPane.showInputDialog("How long would you like to microwave your popcorn for?");
		int timeAsInt = Integer.parseInt(time);
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(timeAsInt);
		microwave.startMicrowave(); 
	}
}
