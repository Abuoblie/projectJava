
public class WorkshopPart2 {

	public static void main(String[] args) {
		// new Pen() is the default constructor if there is no another he will use the default 
		//Pen is class and pen is object
		//Pen pen = new Pen("red","bic");
		Pen pen = new Pen();
		pen.model="BIC";
		pen.color = "Red";
		pen.penTip= 0.5f;		
		pen.status();
		pen.write();
		

	}

}
