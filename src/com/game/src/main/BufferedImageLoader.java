/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.src.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author PC
 */
public class BufferedImageLoader {
    
    private BufferedImage image;  
    
    public BufferedImage loadImage(String path) throws IOException {
    
        image = ImageIO.read(getClass().getResource(path));
        
        return image;
        
        
    }
    
    
    
}
