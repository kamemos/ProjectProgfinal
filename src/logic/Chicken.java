package logic;

public class Chicken extends GrillableFood {
	public int timeOfStage2;
	public Chicken(){
		super();
		this.timeOfStage1 = 360;
		this.timeOfStage2 = 720;
		this.timeOfStage3 = 1080;
		this.timeOfStage4 = Integer.MAX_VALUE;
		
	}
	
	public void draw(){
		
	}
	
	public void update(){
		
	}
}
