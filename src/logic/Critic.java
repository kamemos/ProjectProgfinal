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
					if(this.getFood.face1IsOnStage3()&&this.getFood.face2IsOnStage3()){
						return 50;
					}else return -40;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.face1IsOnStage1()&&this.getFood.face2IsOnStage1()){
						return 50;
					}else return -40;
				}else{
					if(this.getFood.face1IsOnStage2()&&this.getFood.face2IsOnStage2()){
						return 50;
					}else return -40;
				}
			}else if(this.currentFace == normalFace){
				if(this.getFood instanceof Pork){
					if(this.getFood.face1IsOnStage3()&&this.getFood.face2IsOnStage3()){
						return 10;
					}else return -60;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.face1IsOnStage1()&&this.getFood.face2IsOnStage1()){
						return 10;
					}else return -60;
				}else{
					if(this.getFood.face1IsOnStage2()&&this.getFood.face2IsOnStage2()){
						return 10;
					}else return -60;
				}
			}else{
				if(this.getFood instanceof Pork){
					if(this.getFood.face1IsOnStage3()&&this.getFood.face2IsOnStage3()){
						return -20;
					}else return -80;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.face1IsOnStage1()&&this.getFood.face2IsOnStage1()){
						return -20;
					}else return -80;
				}else{
					if(this.getFood.face1IsOnStage2()&&this.getFood.face2IsOnStage2()){
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
