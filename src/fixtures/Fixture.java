package fixtures;

public class Fixture 
{
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture()
	{
		//System.out.println("No argument constructor called.");
	}
	
	public Fixture(String name, String shortDescription, String longDescription)
	{
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		/*System.out.println(name);
		System.out.println(shortDescription);
		System.out.println(longDescription);*/
	}
}
