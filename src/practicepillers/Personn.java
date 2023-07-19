package practicepillers;

public class Personn {
	private String name;
	private int age;
	private String accupation;
	
		public  Personn (String name, int age, String accpation) {
			this.name= name;
			this.age=age;
			this.accupation = accupation;
			}
		public String getname() {
		return name;
		}
		public void setname() {
			this.name=name;
		}
		
		public int getage() {
			return age;
		}
		public void setage() {
			this.age = age;
		}
		
		public String getaccupation() {
			return accupation;
		}
		public void setaccupation() {
			this.accupation=accupation;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personn person = new Personn ("zeeshan", 22 , "junier java developer");
		String nameas = person.getname();
		int ages = person.getage();
		String acc = person.getaccupation();
		//System.out.println("person name is : " + nameas + "\n person age is : " + ages + "\n person accupation is  " + acc);
		System.out.println(" Name :"+ person.getname() + "\n Age : "+ person.getage() + "\n accupation :"+ person.getaccupation());

	}

}
