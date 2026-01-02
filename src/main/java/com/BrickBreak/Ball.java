//rima k
//1/2/2026
////the ball is a circle that moves around based on how it hits the paddle and the bricks
package com.BrickBreak;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int ballx;
	private int bally;
	private int ballradius;
	private int ballXvelocity;
	private int ballYvelocity;
	
	//constructor(s):
	public Ball(int x,int y,int radius, int xvelocity, int yvelocity){
		ballx = x;
		bally = y;
		ballradius = radius;
		ballXvelocity = xvelocity;
		ballYvelocity = yvelocity;

	}
	//methods:
	public void draw(Graphics g){
	g.setColor(Color.cyan);
	g.fillOval(ballx,bally,ballradius,ballradius);
	}
	public void move(){
		ballx += ballXvelocity;
		bally += ballYvelocity;
	}
////// all the things that begin with get is just returning the values of the paddles variables to use in the game
public int getXpos(){
	return ballx;
}
public int getYpos(){
	return bally;
}
public int getSize(){
	return ballradius;
}
public int getXVelocity(){
	return ballXvelocity;
}
public int getYVelocity(){
	return ballYvelocity;
}
//// similar thing is happening in the set stuff except its setting the values of the variables
public void setX(int x){
	ballx = x;
}
public void setY(int y){
	bally = y;
}
public void setXVelocity(int v){
	ballXvelocity = v;
}
public void setYVelocity(int v){
	ballYvelocity = v;
}
public void reverseX(){
	ballXvelocity = -ballXvelocity;
}
public void reverseY(){
	ballYvelocity = -ballYvelocity;
}
}
