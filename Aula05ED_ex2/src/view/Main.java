package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Main {

	public static void main(String[] args) {
		ConverteController c = new ConverteController();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		JOptionPane.showMessageDialog(null, "N�mero em bin�rio: " + c.decToBin(numero));
	}

}
