package indie;

public class Player extends SensibleDummy{

	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Player(int fatique, int atack, int defense, char faceTo) {
		super();
		this.fatique = fatique;
		this.atack = atack;
		this.defense = defense;
		this.faceTo = faceTo;
	}



	private int fatique;
	private int atack;
	private int defense;
	private char faceTo;
	


	
	public static void pass(){
		
	}
	
	public static void shoot(){
		
	}
	
}
