package br.edu.ifpb.poo.itens;

import java.util.Random;

public class Dice {
	
	private int faces;
	
	Random roll = new Random();
	
	public void diceGenerate(int number) {
		this.faces = number;
	}
	
	public int rollTheDice() {
		return roll.nextInt(faces+1);
	}
}
