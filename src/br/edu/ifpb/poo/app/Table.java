package br.edu.ifpb.poo.app;

import javax.swing.JOptionPane;

import br.edu.ifpb.poo.itens.Dice;
import br.edu.ifpb.poo.players.Player;

public class Table {

	private Player playerOne = new Player();
	private Player playerTwo = new Player();
	// Line means what score the players should reach for.
	private int line;
	private Dice dice;

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	// first step
	public void setNames() {
		playerOne.setName(JOptionPane.showInputDialog("Insert Player one name"));
		playerTwo.setName(JOptionPane.showInputDialog("Insert Player two name"));
	}

	// second one
	public void selectObjectivLine() {
		this.setLine(Integer.parseInt(
				JOptionPane.showInputDialog("Select a line the players should get close or reach for win the game")));
	}

	// third
	public void diceSize() {
		dice.diceGenerate(Integer.parseInt(JOptionPane.showInputDialog("Select dice size(Number of faces)")));
	}

	// GO!
	public void startGame() {
		int playerOneOline = 0;
		int playerTwoOline = 0;
		do {
			if (playerOneOline == 0) {

				playerOneOline = JOptionPane.showConfirmDialog(null, "Do " + playerOne.getName() + "wanna roll?");
				playerOne.setScore(dice.rollTheDice());
				JOptionPane.showMessageDialog(null, playerOne.toString());

				if (playerOne.getScore() == this.line) {
					JOptionPane.showMessageDialog(null, "Player one win");
				} else if (playerOne.getScore() > this.line) {
					JOptionPane.showMessageDialog(null, "Player one lose");
				}
			}
			if (playerTwoOline == 0) {
				playerTwoOline = JOptionPane.showConfirmDialog(null, "Do " + playerTwo.getName() + "wanna roll?");
				playerTwo.setScore(dice.rollTheDice());
				JOptionPane.showMessageDialog(null, playerTwo.toString());

				if (playerTwo.getScore() == this.line) {
					JOptionPane.showMessageDialog(null, "Player two win");
				} else if (playerTwo.getScore() > this.line) {
					JOptionPane.showMessageDialog(null, "Player two lose");
				}
			}
		} while (playerOneOline == 0 || playerTwoOline == 0);

	}
}
