package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Ball {
	int global_pontop1;
	int global_pontop2;
		public double x,y;//double por causa da inteligencia artificial
		public int width,height;
		
		public double dx,dy;
		public double speed = 2;
		
		public Ball(int x,int y) {//metodo construtor
			this.x = x;
			this.y = y;
			this.width = 4;//setando valores
			this.height = 4;
			
			int angle = new Random().nextInt(120 - 45) + 45 + 1;// calculando angulos se der nunmero baixo sempre vai somar 45
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
		}
		
		public void tick() {

			if(x+(dx*speed) + width >= Game.WIDTH ) { //logica de colisao na parede
				dx*=-1;
			}else if(x+(dx*speed) < 0) {
				dx*=-1;
			}
			
			if(y >= Game.HEIGHT)
			{
				//Ponto do inimigo.
				System.out.println("Ponto player 2 ");
				new Game();
				return;
			}else if(y < 0) {
				//Ponto do jogador.
				System.out.println("Ponto player 1 ");
				new Game();
				return;
			}
			// biblioteca de colisao
			
			Rectangle bounds = new Rectangle((int)(x+(dx*speed)),(int)(y+(dy*speed)),width,height);
			
			Rectangle boundsPlayer = new Rectangle(Game.player.x,Game.player.y,Game.player.width,Game.player.height);
			//Rectangle boundsPlayer2 = new Rectangle(Game.player2.x,Game.player2.y,Game.player2.width,Game.player2.height);
			Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x,(int)Game.enemy.y,Game.enemy.width,Game.enemy.height);
			
			
			if(bounds.intersects(boundsPlayer)) {
				int angle = new Random().nextInt(120 - 45) + 45 + 1; //calculando angulos se der nunmero baixo sempre vai somar 45
				dx = Math.cos(Math.toRadians(angle));
				dy = Math.sin(Math.toRadians(angle));
				if(dy > 0)
					dy*=-1;
		/*	}else if(bounds.intersects(boundsPlayer2)) {
				int angle = new Random().nextInt(120 - 45) + 45 + 1;
				dx = Math.cos(Math.toRadians(angle));
				dy = Math.sin(Math.toRadians(angle));
				if(dy < 0)
				dy*=-1;
		*/	
			}else if(bounds.intersects(boundsEnemy)) {
				int angle = new Random().nextInt(120 - 45) + 45 + 1;
				dx = Math.cos(Math.toRadians(angle));
				dy = Math.sin(Math.toRadians(angle));
				if(dy < 0)
					dy*=-1;
	
			}
			x+=dx*speed;
			y+=dy*speed;
			
			
			
		}
		
		public void render(Graphics g) {// renderizando na tela a bola
			g.setColor(Color.yellow);// setando cor
			g.fillRect((int)x,(int)y,width,height);// posição inicial os 2 ultimos valores sao referentes as dimensões
		}
}
