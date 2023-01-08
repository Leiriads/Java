package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player2 {

	
	public boolean right,left;
	
	public int x,y;// x é na horizontal , y é na vertical
	
	public int width,height;// variavis para passar no render
	
	public Player2(int x, int y) { // quando for instanciar o jogador ja da pra dizer em qual posição ele começa
		this.x = x;
		this.y = y;
		this.width = 40;// setando valores do player
		this.height = 5;// setando valores do player
	}
	
	public void tick(){// toda lógica do jogo
		if(right)
		{
			x++;
		}
		else if(left){
			x--;
		}
		
		if(x+width > Game.WIDTH) // se x + width(tamanho do player) ultrapassar a largura da tela Game.WIDTH um diminui o outro
		{
			x = Game.WIDTH - width;
		}
		
		else if(x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g){// manipular os graficos
		g.setColor(Color.green);// setando cor
		g.fillRect(x,y,width,height);// posição inicial os 2 ultimos valores sao referentes as dimensões
	}
	
}
