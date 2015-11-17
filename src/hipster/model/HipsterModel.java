package hipster.model;

public class HipsterModel
{
	private String name;
	private String [] hipsterPhrases;
	//private Book [] hipsterBooks;
	
	public HipsterModel()
	{
		this.name = "";
		this.hipsterPhrases = new String [4];
		//this.hipsterBooks = new Book[3];
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "Coachellaaaaa.";
		hipsterPhrases[1] = "I work at a record store";
		hipsterPhrases[2] = "I spend most of my time thinking about free the nipple.";
		hipsterPhrases[3] = "Bob Dylaaaannnn";
	}
	
	
}
