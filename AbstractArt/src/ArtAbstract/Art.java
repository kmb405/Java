package ArtAbstract;

import java.util.ArrayList;
import java.util.*;

public abstract class Art {
	private String title;
	private String author;
	private String description;
	private static ArrayList<Art> museum = new ArrayList<Art>();
	
	
	
	
	public static ArrayList<Art> getMuseum() {
		return museum;
	}



	public static void setMuseum(Art museum) {
		Art.museum.add(museum);
	}

	public static void getArt() {
		Collections.shuffle(museum);
		for (Art item : museum) {
			System.out.printf("%s, %s, %s%n", item.title, item.author, item.description);
		}
	}

	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
		
	}

	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public abstract void viewArt();
}
