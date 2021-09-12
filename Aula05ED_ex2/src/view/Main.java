package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Main {

	public static void main(String[] args) {
		ConverteController c = new ConverteController();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		JOptionPane.showMessageDialog(null, "Número em binário: " + c.decToBin(numero));
	}

}
