package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;

public class Enemy extends GameObject implements EntityB {
	
	
	
	Random r = new Random();
	private Game game;
	private Controller c;
	
	private int speed  = r.nextInt(3)+1;
	
	private Textures tex ;	
	
	public Enemy(double x, double y,Textures tex,Controller c, Game game) {
		super(x, y);
		this.tex = tex;
		this.c = c;
		this.game = game;
	}
	
	public void tick() {
		
		y += speed;
		
		if (y > (Game.HE�GHT * Game.SCALE)) {
			speed  = r.nextInt(3)+1;
			x = r.nextInt(640);
			y = -10;
			
		}
		
		for (int i = 0; i < game.ea.size(); i++) 
		{
			
			EntityA tempEnt = game.ea.get(i);		
		
		if(Physics.Collision(this,tempEnt)) 
			{
			c.removeEntity(tempEnt);
			c.removeEntity(this);
			game.setEnemy_killed(game.getEnemy_killed()+1);			
			}
		}
		
	}

	public void render(Graphics g) {		
		g.drawImage(tex.enemy,(int)x,(int)y,null);		
	}
	
	public Rectangle getBounds() {		
		return new Rectangle((int)x, (int) y, 32, 32);		
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	
	public double getX() {		
		return x;
	}
	

}
