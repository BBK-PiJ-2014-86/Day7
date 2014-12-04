package day7;

public class Spy {

	static int spyCount = 0;
	int id;
	
	
	public Spy(int id) {
		spyCount +=1;
		this.id = id;
		System.out.println("This is spy number "+ spyCount + ", ID: " +id);
	}
	
	public void die (Spy name) {
		spyCount-=1;		
	}
	
	public int SpyCount () {
		System.out.println(spyCount);
		return spyCount;
	}
	
	public String toString()
	{
		return "This is spy " + this.id;		
	}
	
	public static void main(String[] args)
	{
		Spy s1 = new Spy(1);
		Spy s2 = new Spy(2);
		Spy s3 = new Spy(3);
		s3.die(s3);
		s1.SpyCount();
	}
	
}