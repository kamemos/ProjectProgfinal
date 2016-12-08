package logic;

public class Critic extends Customer {
	public Critic(GrillableFood wantedFood){
		super(wantedFood);
		this.wantedFood = wantedFood;
		this.isDisappear = false;
		this.faceTick = 0;
		this.currentFace = happyFace;
	}
	
	public int score(){
		if(this.getFood == this.wantedFood){
			if(this.currentFace == happyFace){
				if(this.getFood instanceof Pork){
					if(this.getFood.getcurrentFace1Stage()==3&&this.getFood.getcurrentFace2Stage()==3){
						return 50;
					}else return -40;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.getcurrentFace1Stage()==1&&this.getFood.getcurrentFace2Stage()==1){
						return 50;
					}else return -40;
				}else{
					if(this.getFood.getcurrentFace1Stage()==2&&this.getFood.getcurrentFace2Stage()==2){
						return 50;
					}else return -40;
				}
			}else if(this.currentFace == normalFace){
				if(this.getFood instanceof Pork){
					if(this.getFood.getcurrentFace1Stage()==3&&this.getFood.getcurrentFace2Stage()==3){
						return 10;
					}else return -60;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.getcurrentFace1Stage()==1&&this.getFood.getcurrentFace2Stage()==1){
						return 10;
					}else return -60;
				}else{
					if(this.getFood.getcurrentFace1Stage()==2&&this.getFood.getcurrentFace2Stage()==2){
						return 10;
					}else return -60;
				}
			}else{
				if(this.getFood instanceof Pork){
					if(this.getFood.getcurrentFace1Stage()==3&&this.getFood.getcurrentFace2Stage()==3){
						return -20;
					}else return -80;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.getcurrentFace1Stage()==1&&this.getFood.getcurrentFace2Stage()==1){
						return -20;
					}else return -80;
				}else{
					if(this.getFood.getcurrentFace1Stage()==2&&this.getFood.getcurrentFace2Stage()==2){
						return -20;
					}else return -80;
				}
			}
		}else return -40;
	}
	
	public void draw(){
		
	}
	
	public void update(){
		
	}
}
