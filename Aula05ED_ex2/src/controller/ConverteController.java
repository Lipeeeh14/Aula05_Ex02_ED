package controller;

import br.edu.fateczl.lipe.PilhaInt.Pilha;

public class ConverteController {
	
	public ConverteController() {}
	
	public String decToBin(int numDecimal) {
		int resto;
		String result = "";
		Pilha pilha = new Pilha();
		
		while(numDecimal > 0) {
			resto = numDecimal % 2;
			pilha.push(resto);
			numDecimal /= 2;
		}
		while(!pilha.isEmpty()) {
			try {
				result += Integer.toString(pilha.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
}
