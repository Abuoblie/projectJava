import java.util.Random;

public class Pen {
	
	 
	 String mmmodel;
     String model;
	 String color;
	 float penTip;
	 int ink;
	 boolean covered;
	
	//after put it 
	void status() {
		System.out.println("I have one " + this .color + " pen, with "+ inkStatus()+"% of ink");
		System.out.println("the  model is "+ this.model +" and pen tip is "+ this.penTip);
		System.out.println("and this pen is "+ coverStatus()+" then ");
	}


	// constructor method 
	public Pen() {
		
	}
	
	// constructor method with parametes
		public Pen(String newColor,String newModel) {
			color = newColor;
			model=newModel;
			
		}

	private String coverStatus() {
		 String penCover;
		 Random r = new Random();
		 covered = r.nextBoolean();
		 if(this.covered == true) {
			 penCover ="covered" ;
		 }else {
			 penCover="uncover";
		 } 
	  return penCover;
	}
		
	//method
	void write() {
		if(this.covered == true) {
			System.out.println("sorry I can't write because the pen is covered");
		}else {
			System.out.println("I am writing something soon");
		}
		
	}
	
	
	private int inkStatus() {
		 
		Random random = new Random();
		ink = random.nextInt((100 - 0) +1)+ 0;
		
		return ink;
	}

	
	
	void cover() {
		//"this" is the name of the object that called
		this.covered = true;
	}
	
	void uncovered() {
		this.covered = false;
		
	}





}
