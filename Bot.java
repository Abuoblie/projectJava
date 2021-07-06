import java.util.*;

public class Bot {
        //Field
        private String name;
        private String typeofRobot;
        private String[] orientation = {"North", "South", "East", "West"};
        private String[] status={"Active","out of use", "getting ready"};
        private int x,y;
        private String direction;
        private String state ;
        private Random rand = new Random();

        //encapsulation
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }

        public String getTypeofRobot() {
                return typeofRobot;
        }
        public void setTypeofRobot(String typeofRobot) {
                this.typeofRobot = typeofRobot;
        }
        public String getState() {
                return state;
        }
        public void setState(String state) {
                this.state = state;
        }
        public String getDirection() {
                return direction;
        }
        public void setDirection(String direction) {
                this.direction = direction;
        }

        public Bot(String name, String type) {
                this.name = name;
                this.typeofRobot = type;
                this.x =rand.nextInt(101);
                this.y =rand.nextInt(101);
                this.state=status[rand.nextInt(3)];
        }

        public void orient(){
                /*this function sets the orientation*/
                
                this.direction = this.orientation[rand.nextInt(4)];
        }
        
        public void turn(){
                //this function changes the orientation
                
                boolean directionChange =  false;

                while(!directionChange){

                        String newdirection = this.orientation[rand.nextInt(4)];

                        if(newdirection != this.direction){
                                this.direction = newdirection;
                                directionChange = true;
                        }  
                }
        }

        public void advance(){
                //this function sets the position by adding a random distance [0-10] as along as it doesn't exceed the limits"""
               
               
                x = rand.nextInt(11);
                y = rand.nextInt(11);
                
                if (this.direction == "South"){
                        if(this.y + y > 100){
                                System.out.println(this.name+ "has attain maximum distance in this direction try reverse to move in the opposite direction"); 
                        }       
                        else{
                                System.out.println(this.name+" advanced by "+y+" direction South"); 
                                this.y +=y;
                        }      
                }       
                else if(this.direction == "East"){
                        if(this.x + x > 100){
                                System.out.println(this.name+" has attain maximum distance in this direction please try reverse to move in the opposite direction"); 
                        }       
                        else{
                                System.out.println(this.name+" advanced by "+x+ " direction west"); 
                                this.x +=x;
                        }  
                }      
                else{
                        System.out.println(this.name+" robot can't advance in this direction please try reverse to move in the opposite direction");
                        
                }     
                                
        }        
                
        public void reverse(){
                //this function sets the position by subtracting a random distance [0-10] if it is withing limits"""
                
        
                x = rand.nextInt(11);
                y = rand.nextInt(11);
                
                if(this.direction == "North"){
                        if (this.y - y < 0){
                                System.out.println(this.name+" has attain maximum distance in this direction try advance to move in the opposite direction"); 
                        }       
                        else{
                                System.out.println(this.name+" reversed by "+y+" direction North");
                                this.y -= y;
                                
                        } 
                }      
                else if(this.direction == "West"){
                        if(this.x - x < 0){
                                System.out.println(this.name+" has attain maximum distance in this direction"); 
                        }
                        else{
                                System.out.println(this.name+" reversed by "+ x +" direction East");
                                this.x -= x;
                        }
                }
                else{
                        System.out.println(this.name +" can not reverse in this direction please try advance to move in the opposite direction");
                        
                }
        }

        @Override
        public String toString(){
                return "name of Robot :"+ this.name +"| type : "+this.typeofRobot+"| state :"+ this.state +" | direction :"+ this.direction+ "| position x :" +this.x+ " |position y :" +this.y;
        }
        
}
