package com.game.src.main;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.game.src.main.Game.STATE;

public class MouseInput implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		int mx = e.getX();
		int my = e.getY();
		
		/*
		public Rectangle playButton = new Rectangle(Game.WÝDTH/2+120,150,100,50);
		public Rectangle helpButton = new Rectangle(Game.WÝDTH/2+120,250,100,50);
		public Rectangle quitButton = new Rectangle(Game.WÝDTH/2+120,350,100,50);*/
		
		//PlayButton
		if(mx >= Game.WÝDTH/2+120 && mx <= Game.WÝDTH/2+220) {			
			if(my>=150 && my<=200) {				
				//Pressed Play Button
				Game.State = Game.STATE.GAME;				
			}			
		}
		
		//QuitButton
				if(mx >= Game.WÝDTH/2+120 && mx <= Game.WÝDTH/2+220) {			
					if(my>=350 && my<=400) {				
						//Pressed Quit Button
						System.exit(1);			
					}			
				}
			
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
