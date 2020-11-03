package _05_vault;

public class Vault {
	int num=3563; 
	boolean tryCode(int number) {
		if (number == num) {
			return true;
		}
		return false;
	}
	Vault(int number) {
		num=number;
	}
}