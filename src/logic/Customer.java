package logic;

public class Customer {
	public int currentFace;
	public int faceTick;
	public GrillableFood wantedFood;
	public GrillableFood getFood;
	public boolean isDisappear;
	protected static final int happyFace = 2;
	protected static final int normalFace = 1;
	protected static final int sadFace = 0;
	
	public Customer(GrillableFood wantedFood){
		this.wantedFood = wantedFood;
		this.isDisappear = false;
		this.faceTick = 0;
		this.currentFace = happyFace;
	}
	
	public int getCurrentFace() {
		return currentFace;
	}


	public boolean isDisappear() {
		return isDisappear;
	}

	public void setDisappear(boolean isDisappear) {
		this.isDisappear = isDisappear;
	}
	
	public void changeToNormal(){
		if(this.faceTick == 1200){
			this.currentFace = normalFace;
		}
	}
	public void changeToSad(){
		if(this.faceTick == 2400){
			this.currentFace = sadFace;
		}
	}
	
	public int score(){
		if(this.getFood == this.wantedFood){
			if(this.currentFace == happyFace){
				if(this.getFood instanceof Pork){
					if(this.getFood.getcurrentFace1Stage()==3&&this.getFood.getcurrentFace2Stage()==3){
						return 10;
					}else return -10;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.getcurrentFace1Stage()==1&&this.getFood.getcurrentFace2Stage()==1){
						return 10;
					}else return -10;
				}else{
					if(this.getFood.getcurrentFace1Stage()==2&&this.getFood.getcurrentFace2Stage()==2){
						return 10;
					}else return -10;
				}
			}else if(this.currentFace == normalFace){
				if(this.getFood instanceof Pork){
					if(this.getFood.getcurrentFace1Stage()==3&&this.getFood.getcurrentFace2Stage()==3){
						return 5;
					}else return -15;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.getcurrentFace1Stage()==1&&this.getFood.getcurrentFace2Stage()==1){
						return 5;
					}else return -15;
				}else{
					if(this.getFood.getcurrentFace1Stage()==2&&this.getFood.getcurrentFace2Stage()==2){
						return 5;
					}else return -15;
				}
			}else{
				if(this.getFood instanceof Pork){
					if(this.getFood.getcurrentFace1Stage()==3&&this.getFood.getcurrentFace2Stage()==3){
						return -5;
					}else return -25;
				}else if (this.getFood instanceof Fish){
					if(this.getFood.getcurrentFace1Stage()==1&&this.getFood.getcurrentFace2Stage()==1){
						return -5;
					}else return -25;
				}else{
					if(this.getFood.getcurrentFace1Stage()==2&&this.getFood.getcurrentFace2Stage()==2){
						return -5;
					}else return -25;
				}
			}
		}else return -20;
	}
	public void draw(){
		
	}
	
	public void update(){
		this.faceTick++;
	}
}