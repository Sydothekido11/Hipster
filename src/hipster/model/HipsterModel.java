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
		hipsterPhrases[2] = "That is so mainstream.";
		hipsterPhrases[3] = "Bob Dylaaaannnn";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}




	
	
}
