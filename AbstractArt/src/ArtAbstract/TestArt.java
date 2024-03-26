package ArtAbstract;

public class TestArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting painting1 = new Painting("paint1", "me", "colorful", "watercolors");
		Painting painting2 = new Painting("paint2", "you", "bright", "oil");
		Painting painting3 = new Painting("paint3", "us", "dull", "acrylic");
		
		Scuplture scuplture1 = new Scuplture("sculpt1", "me", "person", "clay");
		Scuplture scuplture2 = new Scuplture("sculpt2", "you", "shiny", "metal");
		
		Art.setMuseum(painting1);
		Art.setMuseum(painting2);
		Art.setMuseum(painting3);
		Art.setMuseum(scuplture1);
		Art.setMuseum(scuplture2);
		
		Art.getArt();
	}

}
