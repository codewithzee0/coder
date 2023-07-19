package inharitence;

public class Mobiles {
	String name;
	String colour;
	String ram;
	public Mobiles(String name, String colour, String  ram ) {
		this.name =name;
		this.colour=colour;
		this.ram=ram;
		
		}

	
	public String getname() {
		return name;
	}
	
	public String setname() {
		return this.name=name;
	}
	
	public String getcolour() {
		return colour;
	}
	
	public String setcolour() {
		return this.colour=colour;
	}
	
	public String getram() {
		return ram;
	}
	public String setram() {
		return this.ram=ram;
	}
	
 static class Samesung extends Mobiles {

	public Samesung(String name, String colour, String ram) {
		super(name, colour, ram);
			
}
	
	static class Nokia extends Mobiles {
		public Nokia ( String colour, String ram) {
			super(colour,ram, ram);
		}
	}

	public static void main(String[] args) {
		Samesung s = new Samesung ("NOT 10", "Black", "8 GB");
		System.out.println("Samesung Mobile detail");
		System.out.println(s.getname());
	   System.out.println(s.getcolour());
	   System.out.println(s.getram());
	}

}
}
