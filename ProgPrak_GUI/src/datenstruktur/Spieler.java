package datenstruktur;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spieler {
	private int xPos, yPos;
	private Image image; 
	
	public Spieler(String url) {
		this.xPos = 0;
		this.yPos = 0;
		try {
			this.image =  ImageIO.read(new File("img//spieler.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
	
	
	
	public void hoch() {
		yPos--;
	}
	public void runter() {
		yPos++;
	}
	public void rechts() {
		xPos++;
	}
	public void links() {
		xPos--;
	}

}
