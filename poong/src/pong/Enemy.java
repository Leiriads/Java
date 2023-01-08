package pong;

import java.awt.Color;
import java.awt.Graphics;



public class Enemy {

	public double x,y;// double por causa da inteligencia artificial
	public int width,height;
	
	public Enemy(int x,int y) {// metodo construtor
		this.x = x;
		this.y = y;
		this.width = 40;// setando valores
		this.height = 5;
	}
	
	public void tick() {// logica do enemy
		x+= (Game.ball.x - x - 6) * 0.10;
	}
	
	public void render(Graphics g) {// renderizando na tela mesmas configs do player
		g.setColor(Color.red);// setando cor
		g.fillRect((int)x,(int)y,width,height);// posição inicial os 2 ultimos valores sao referentes as dimensões
	}
	
}
