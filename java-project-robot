/**
 * Robot
 */
import java.util.*;
public class Robot {

        
        /** 
         * @param args
         */
        public static void main(String[] args) {
                ArrayList<Bot> robot = new ArrayList<Bot>();
                robot.add(new Bot("kolbot","techbot"));
                robot.add(new Bot("Cybot","techbot"));
                robot.add(new Bot("Lobot","techbot"));
                robot.add(new Bot("Cobot","techbot"));

               for (Bot bot : robot) {
                        String state = bot.getState();
        
                        if (state == "Active"){
        
                                System.out.println(bot.getName()+" is " + state);
                                bot.orient();
                                System.out.println(bot.getName()+" oriented " + bot.getDirection());
                                bot.turn();
                                System.out.println(bot.getName()+" turn to " + bot.getDirection());  
                                
                                if (bot.getDirection() == "South" || bot.getDirection()  == "East") {
                                        bot.advance();        
                                }
                                else{
                                        bot.reverse();
                                }
                                System.out.println(bot);
                                System.out.println("*****************************************************************************************************");
        
                        }
                        else {
                                System.out.println(bot.getName()+" "+state); 
                                System.out.println("*****************************************************************************************************");
                        }
               
               }        
               
        }
}