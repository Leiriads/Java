package pong;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
// ativar player 2 62 , 59
public class Game extends Canvas implements Runnable,KeyListener{
	
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 160;// definindo constantes
	public static int HEIGHT = 120;// definindo constantes
	public static int SCALE = 3;
	
	public BufferedImage layer = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	// Cria uma layer e a mesma vai ser onde vou renderizar os graficos
	public static Player player;// deixando tudo estatico para poder utilizar dentro da classe ball
	public static Player2 player2;
	public static Enemy enemy;
	public static Ball ball;// deixando statico para poder acessar pelo inimigo

	
	public Game() {// metodo construtor
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));// setando as dimençoes
		this.addKeyListener(this);// propria classe adiciona a biblioteka keylistener
		player = new Player(100,HEIGHT-5);// aqui eu digito a posição inicial do player
		player2 = new Player2(100,0);
		enemy = new Enemy(100,0);
		ball = new Ball(100,HEIGHT/2 - 1);// spawnar a bola no meio
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame("Pong");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.pack();
		frame.setLocationRelativeTo(null);// deixar no centro da tela
		frame.setVisible(true);

		new Thread(game).start();
	}
	
	public void tick() {
		player.tick();// instanciando jogador
		//player2.tick(); 
		enemy.tick();// instanciando jogador
		ball.tick();// instanciando jogador
		
	}
	
	public void render() {// bufferStrategy é onde renderiza tudo do jogo
		BufferStrategy bs = this.getBufferStrategy();// ctrl + shift + o ; pro eclips importar as bibliotecas
		if(bs == null){// se nao existe cria um bufferstrategy 3 , recomendado para rodar jogos
			this.createBufferStrategy(3);
			return;// precisa do return
		}
		
		Graphics g = layer.getGraphics();
		g.setColor(Color.black);// limpando o frame
		g.fillRect(0, 0, WIDTH, HEIGHT);// limpando o frame
		player.render(g);// renderizando
		//player2.render(g);
		enemy.render(g);// renderizando
		ball.render(g);// renderizando
		
		// depois de renderizar tudo dentro da imagem preciso trocar o meu grafico
		g = bs.getDrawGraphics();
		g.drawImage(layer, 0, 0, WIDTH*SCALE,HEIGHT*SCALE,null);
		
		bs.show(); // depois de renderizar , ele mostra na tela / JFrame nao foi feito para renderizar
	}
	
	@Override   
	public void run() { 
		while(true) { // fazendo game loop
			tick(); //chamando o metodo tick
			render();//chamando o metodo render
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override // evento de pressionar o botão
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) { //Eventos a parte da logica do jogo /nao se movimenta o player por aqui
			player.left = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			player2.right = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) { //Eventos a parte da logica do jogo /nao se movimenta o player por aqui
			player2.left = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) { // evento de soltar o botão
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {//Eventos a parte da logica do jogo  /nao se movimenta o player por aqui
			player.left = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			player2.right = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			player2.left = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
