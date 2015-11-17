package hipster.controller;

import hipster.model.HipsterModel;
import hipster.view.HipsterFrame;

public class HipsterController
{
	private HipsterModel firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterController()
	{
		firstHipster = new HipsterModel();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name?");
		firstHipster.setName(MyName);
		baseFrame.setTitle(myName + "'s Hipster Project!");
		
	}
	
	public HipsterModel getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}


	
	
	
}
