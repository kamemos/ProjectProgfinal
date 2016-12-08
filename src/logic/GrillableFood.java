package logic;

public abstract class GrillableFood {
	public int timeOfStage0;
	public int timeOfStage1;
	public int timeOfStage2;
	public int timeOfStage3;
	public int timeOfStage4;
	private boolean isFace1;
	public int currentTimeFace1;
	public int currentTimeFace2;
	
	public GrillableFood(int timeOfStage0,int timeOfStage1){
		this.isFace1 = true;
		this.currentTimeFace1 = 0;
		this.currentTimeFace2 = 0;
		this.timeOfStage0 = timeOfStage0;
		this.timeOfStage1 = timeOfStage1;
	}

	public boolean isFace1() {
		return isFace1;
	}

	public void setFace1(boolean isFace1) {
		this.isFace1 = isFace1;
	}

	
	public boolean face1IsOnStage1(){
		if(currentTimeFace1 >= timeOfStage1 && currentTimeFace1 < timeOfStage2){
			return true;
		}else return false;
	}
	
	public boolean face2IsOnStage1(){
		if(currentTimeFace2 >= timeOfStage1 && currentTimeFace2 < timeOfStage2){
			return true;
		}else return false;
	}
	
	public boolean face1IsOnStage2(){
		if(currentTimeFace1 >= timeOfStage2 && this.currentTimeFace1 < timeOfStage3){
			return true;
		}else return false;
	}
	
	public boolean face2IsOnStage2(){
		if(currentTimeFace2 >= timeOfStage2 && this.currentTimeFace1 < timeOfStage3){
			return true;
		}else return false;
	}
	public boolean face1IsOnStage3(){
		if(this.currentTimeFace1 >= timeOfStage3 && this.currentTimeFace1 < timeOfStage4){
			return true;
		}else return false;
	}
	
	public boolean face2IsOnStage3(){
		if(this.currentTimeFace2 >= timeOfStage3 && this.currentTimeFace2 < timeOfStage4){
			return true;
		}else return false;
	}
	
	public boolean face1IsOnStage4(){
		if(this.currentTimeFace1 >= timeOfStage4){
			return true;
		}else return false;
	}
	
	public boolean face2IsOnStage4(){
		if(this.currentTimeFace2 >= timeOfStage4){
			return true;
		}else return false;
	}
	
	public void toggleFood(){
		this.isFace1 = !isFace1;
	}
	
	public abstract void update();
	public abstract void draw();
}
