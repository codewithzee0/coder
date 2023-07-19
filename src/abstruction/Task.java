package abstruction;

public class Task {
	public int getInfo() {
		return 2;
	}
	
	
	
	
	public static void main(String[] args)throws java.lang.Exception {
		Task task = new Task();
		Task.Work work = task.new Work();
//		Work work = new Work();
		
		System.out.println(task.getInfo());
		System.out.println(task.getInfo());


	}
	
	public class Work   {
		
		public int getInfo() {
			return 3;
		}
	}

}


