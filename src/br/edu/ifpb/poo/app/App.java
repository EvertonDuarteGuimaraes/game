package br.edu.ifpb.poo.app;

import javax.swing.JOptionPane;

import br.edu.ifpb.poo.itens.Dice;

public class App {

	public static void main(String[] args) {
		
		// test1
		/*Dice dice = new Dice();
		dice.diceGenerate(6);
		for(int i = 0; i < 9; i++) {
			System.out.println(dice.rollTheDice());			
		}*/

		//test2
		//JOptionPane.showConfirmDialog(null, "Rolar dado");
		
		//test3
		//System.out.println(JOptionPane.showConfirmDialog(null, " " ));
		
		Table table = new Table();
		
		table.setNames();
		table.selectObjectivLine();
		table.diceSize();
		table.startGame();
	}

}