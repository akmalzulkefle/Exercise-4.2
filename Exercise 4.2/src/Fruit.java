
public class Fruit {
	
	private String name;
	
  public Fruit(String name) {
	  
	  this.name = name;
    System.out.println("Fruit constructor is invoked");
    
  }
  
  public String getname() {
	  return name;
  }
}


class Apple extends Fruit {
	
	private String colour;
	
  public Apple(String name, String colour) {
	  
	  super(name);
	  this.colour = colour;
	  
	  System.out.println("Apple constructor is invoked");
	  
  }
  
  public String getcolour() {
	  return colour;
  }
}


class RedApple extends Apple{
	
	private double weight;
	
	public RedApple(String name, String colour, double weight) {
		
		super(name, colour);
		this.weight = weight;
	
	}
	
	public double getweight() {
		  return weight;
	  }
}


class GreenApple extends RedApple{
	
	private String taste;
	
	public GreenApple(String name, String colour, double weight, String taste) {
		
		super(name, colour, weight);
		this.taste = taste;
		
	}
	
	public String gettaste() {
		  return taste;
	  }
}


class Blackberries extends Fruit {
	
	private String colour, taste;
	private double weight;
	
	public Blackberries(String name, String colour, double weight, String taste) {
		
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.taste = taste;
		
		System.out.println("Blackberries constructor is invoked");
		
	}
	
	public String getcolour() {
		  return colour;
	  }
	
	public String gettaste() {
		  return taste;
	  }
	
	public double getweight() {
		  return weight;
	  }
	
}


class Blackcurrant extends Blackberries {
	
	private String seed;
	
	public Blackcurrant(String name, String colour, double weight, String taste, String seed) {
		
		super(name, colour, weight, taste);
		this.seed = seed;
		
	}

	public String getseed() {
		  return seed;
	  }
	
}


class Main{
	
	public static void main(String[]args) {

		Apple a = new Apple("Apple","Red");
		System.out.println("Type : " + a.getname());
		System.out.println("Colour : " + a.getcolour());
		
		System.out.println();
		
		RedApple b = new RedApple("Red Apple", "Red", 200);
		System.out.println("Type : " + b.getname());
		System.out.println("Colour : " + b.getcolour());
		System.out.println("Weight : " + b.getweight() + "g");
		
		System.out.println();
		
		GreenApple c = new GreenApple("Green Apple", "Green", 250, "Sour");
		System.out.println("Type : " + c.getname());
		System.out.println("Colour : " + c.getcolour());
		System.out.println("Weight : " + c.getweight() + "g");
		System.out.println("Taste : " + c.gettaste());
		
		System.out.println();
		
		Blackberries d = new Blackberries("Blackberries", "Black", 100, "Sweet");
		System.out.println("Type : " + d.getname());
		System.out.println("Colour : " + d.getcolour());
		System.out.println("Weight : " + d.getweight() + "g");
		System.out.println("Taste : " + d.gettaste());
		
		System.out.println();
		
		Blackcurrant e = new Blackcurrant("Blackcurrant", "Black", 120, "Sweet and Sour", "Edible");
		System.out.println("Type : " + e.getname());
		System.out.println("Colour : " + e.getcolour());
		System.out.println("Weight : " + e.getweight() + "g");
		System.out.println("Taste : " + e.gettaste());
		System.out.println("Seed : " + e.getseed());
	}
}
