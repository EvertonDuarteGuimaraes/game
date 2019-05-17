package br.edu.ifpb.poo.players;

public class Player {

	private String name;
	private int score = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "player [name=" + name + ", score=" + score + "]";
	}
}
