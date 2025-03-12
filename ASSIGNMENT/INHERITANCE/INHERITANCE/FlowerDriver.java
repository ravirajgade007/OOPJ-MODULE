class Flower
{
	String name;
	String color;
	boolean hasFragrance;
	
	/*Create Constructor*/
	Flower(String name, String color, boolean hasFragrance)
	{
		this.name = name;
		this.color = color;
		this.hasFragrance = hasFragrance;
	}
	
	public void displayFlowerDetails()
	{
		System.out.println("Flower Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Has Fragrance: " + (hasFragrance ? "Yes" : "No"));
		
	}
}

class Rose extends Flower 
{
	boolean hasThorns;
	
	/*Create Constructor*/
	Rose(String color, boolean hasFragrance, boolean hasThorns)
	{
		super("Rose",color,hasFragrance);
		this.hasThorns = hasThorns;
	}
	
	public void displayRoseDetails()
	{
		super.displayFlowerDetails();
		System.out.println("Has Thorns: " + (hasThorns ? "Yes" : "No"));
	}
}

class Lily extends Flower
{
	boolean isWaterPlant;
	
	/*Create Constructor*/
	Lily(String color, boolean hasFragrance, boolean isWaterPlant)
	{
		super("Lily", color,hasFragrance);
		this.isWaterPlant = isWaterPlant;
	}
	
	public void displayLilyDetails()
	{
        super.displayFlowerDetails();
		System.out.println("Grows in Water: " + (isWaterPlant ? "Yes" : "No"));
	}
}

class FlowerDriver
{
	public static void main(String args[])
	{
		Rose rose = new Rose("Red", true, true);
		
		Lily lily = new Lily("White", true, true);
		
		System.out.println("---- Rose Details ----");
		rose.displayRoseDetails();
		
		System.out.println();
		
		System.out.println("---- Lily Details ----");		
		lily.displayLilyDetails();
	}
}