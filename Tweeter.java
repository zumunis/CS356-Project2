package miniTwitter;

import java.util.ArrayList;

public abstract class Tweeter {
	
	private int id;
	private String name;
	ArrayList<Integer> followers;
	ArrayList<String> tweets;
	ArrayList<Integer> mygroups;
	ArrayList<String> newsfeed;
	
	public Tweeter(int id, String name)
	{
		this.id = id;
		this.name = name;
	}


}
