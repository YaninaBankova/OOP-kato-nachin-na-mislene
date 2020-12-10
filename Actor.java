package edu.smg;

import java.util.ArrayList;

public class Actor {
	public String name;
	public ArrayList <Series> series;
	public ArrayList <Characters> characters;
	
	public Actor(){
		characters = new ArrayList <Characters>();
		series = new ArrayList <Series>();
	}
	
}
