package logic;

public abstract class GrillableFood {
	public int timeOfStage1;
	public int timeOfStage2;
	public int timeOfStage3;
	public int timeOfStage4;
	private boolean isFace1;
	public int currentTimeFace1;
	public int currentTimeFace2;
	
	public GrillableFood(){
		this.isFace1 = true;
		this.currentTimeFace1 = 0;
		this.currentTimeFace2 = 0;
	}

	public boolean isFace1() {
		return isFace1;
	}

	public void setFace1(boolean isFace1) {
		this.isFace1 = isFace1;
	}

	public int getcurrentFace1Stage(){
		if(this.currentTimeFace2 < timeOfStage1){
			return 0;
		}else if(this.currentTimeFace1 >= timeOfStage1 && currentTimeFace1 < timeOfStage2){
			return 1;
		}else if(this.currentTimeFace1 >= timeOfStage2 && this.currentTimeFace1 < timeOfStage3){
			return 2;
		}else if(this.currentTimeFace1 >= timeOfStage3 && this.currentTimeFace1 < timeOfStage4){
			return 3;
		}else{
			return 4;
		}
	}
	
	public int getcurrentFace2Stage(){
		if(this.currentTimeFace2 < timeOfStage1){
			return 0;
		}else if(this.currentTimeFace2 >= timeOfStage1 && currentTimeFace2 < timeOfStage2){
			return 1;
		}else if(this.currentTimeFace2 >= timeOfStage2 && this.currentTimeFace2 < timeOfStage3){
			return 2;
		}else if(this.currentTimeFace2 >= timeOfStage3 && this.currentTimeFace2 < timeOfStage4){
			return 3;
		}else{
			return 4;
		}
	}
	
	
	public void toggleFood(){
		this.isFace1 = !isFace1;
	}
	
	public abstract void update();
	public abstract void draw();
}
