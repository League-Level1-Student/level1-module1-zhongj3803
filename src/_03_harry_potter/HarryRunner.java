package _03_harry_potter;

public class HarryRunner {
public static void main(String[] args) {
	HarryPotter HarryPotter = new HarryPotter();
	HarryPotter.setInvisible(true);
	HarryPotter.spyOnSnape();
	HarryPotter.setInvisible(false);
	HarryPotter.castSpell("something");
}
}
