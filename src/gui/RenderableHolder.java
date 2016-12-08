package gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.scene.image.Image;
import logic.IRenderable;



public class RenderableHolder {
	
	private List<IRenderable> entities;
	private Image[] customerFace;
	private Image[] foodIconImage;
	private Image[] porkImage;
	private Image[] chickenImage;
	private Image[] fishImage;
	private Comparator<IRenderable> comparator;
	public static final RenderableHolder instance = new RenderableHolder();
	
	
	public RenderableHolder() {
		this.entities = new ArrayList<IRenderable>();
		this.customerFace = new Image[3];
		this.fishImage = new Image[3];
		this.chickenImage = new Image[4];
		this.porkImage = new Image[5];
	
		
		this.comparator = (IRenderable ob1,IRenderable ob2) -> {
	    	if (ob1.getZ() >= ob2.getZ()){
	    		return 1;
	    	}
	    	return -1;
	    }; 
	    
	}
	
	public synchronized void add(IRenderable entity){
		entities.add(entity);
		Collections.sort(entities,comparator);
	}
	
	public void loadResources() {
		this.customerFace[0] = new Image(ClassLoader.getSystemResource("sadFace.png").toString());
		this.customerFace[1] = new Image(ClassLoader.getSystemResource("normalFace.png").toString());
		this.customerFace[2] = new Image(ClassLoader.getSystemResource("happyFace.png").toString());
		
		this.foodIconImage[0] = new Image(ClassLoader.getSystemResource("pig.png").toString());
		this.foodIconImage[1] = new Image(ClassLoader.getSystemResource("chicken.png").toString());
		this.foodIconImage[2] = new Image(ClassLoader.getSystemResource("fish.png").toString());

		this.fishImage[0] = new Image(ClassLoader.getSystemResource("fish0.png").toString());
		this.fishImage[1] = new Image(ClassLoader.getSystemResource("fish1.png").toString());
		this.fishImage[2] = new Image(ClassLoader.getSystemResource("fish2.png").toString());
		
		this.chickenImage[0] = new Image(ClassLoader.getSystemResource("chicken0.png").toString());
		this.chickenImage[1] = new Image(ClassLoader.getSystemResource("chicken1.png").toString());
		this.chickenImage[2] = new Image(ClassLoader.getSystemResource("chicken2.png").toString());
		this.chickenImage[3] = new Image(ClassLoader.getSystemResource("chicken3.png").toString());
		
		this.porkImage[0] = new Image(ClassLoader.getSystemResource("pig0.png").toString());
		this.porkImage[1] = new Image(ClassLoader.getSystemResource("pig1.png").toString()); 
		this.porkImage[2] = new Image(ClassLoader.getSystemResource("pig2.png").toString()); 
		this.porkImage[3] = new Image(ClassLoader.getSystemResource("pig3.png").toString()); 
		
	}
	
	
}
