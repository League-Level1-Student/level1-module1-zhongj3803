package _05_vault;

import javax.swing.JOptionPane;

public class JamesBond {
int findCode(Vault v) {
	for (int i = 1; i<1000001;i++) {
		v.tryCode(i);
	if (v.tryCode(i)) {
		return i;
	}
	}
	return -1;
}
}
