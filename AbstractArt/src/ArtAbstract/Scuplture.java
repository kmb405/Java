package ArtAbstract;

public class Scuplture extends Art {
	private String material;

	public Scuplture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
		// TODO Auto-generated constructor stub
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void viewArt() {
		
	}
	
	
}
