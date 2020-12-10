package edu.smg;

import java.util.ArrayList;

public class Series {
	public String title;
	public ArrayList <Actor> actors;
	public ArrayList <Characters> characters;
	public ArrayList <Seasons> seasons;
	
	public Series() {
		actors = new ArrayList <Actor>();
		characters = new ArrayList <Characters>();
		seasons = new ArrayList <Seasons>();
	}
}
