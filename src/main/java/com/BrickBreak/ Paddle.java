//rima k
//1/2/2026
////the paddle is a rectangle that moves left n right to bounce the ball back up

package com.BrickBreak;

import java.awt.Color;
import java.awt.Graphics;
class Paddle {


	//your code here
	
	//don't forget you need instance variables:
	private int Px;
	private int Py;
	private int Pheight;
	private int Pwidth;
	private int Pvelocity;
	//constructor(s):
	public Paddle(int x, int y, int height, int width, int velocity){
		Px = x;
		Py = y;
		Pheight = height;
		Pwidth = width;
		Pvelocity = velocity;

	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillRect(Px,Py, Pwidth, Pheight);
	}
	public void move(){
		Px += Pvelocity;
		if (Px<0){
			Px = 0;
		}
		if (Px + Pwidth > 682){
			Px = 682 -Pwidth;
		}
	}


////so all the things that begin with get is just returning the values of the paddles variables to use in the game
public int getX(){
	return Px;
}
public int getY(){
	return Py;
}
public int getWidth(){
	return Pwidth;
}
public int getHeight(){
	return Pheight;
}
public int getVelocity(){
	return Pvelocity;
}
//// similar thing is happening in the set stuff except its setting the values of the variables
public void setVelocity(int v){
	Pvelocity = v;
}
public void addVelocity(int v){
	Pvelocity += v;
}
public void setX(int x){
	Px = x;
}
public void setY(int y){
	Py = y;
}
}
