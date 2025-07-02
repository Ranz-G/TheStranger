import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        int health = 50;
        int stranger = 50;
        int PlyDMG;
        int EnyDMG;
        String command = "";
        int room = 1;
        boolean hasCarkey = false;
        boolean hasHammer = false;
        boolean hasScrewdriver = false;
        
        Scanner inp = new Scanner(System.in);
        Random rng = new Random();
        
        while(true){
            
            if(room==1){
                
                System.out.println("You are enjoying a normal day at your home when suddenly you heard a scream outside.");
                System.out.println("You looked out the window when suddenly a stranger burst to your door and started running after you.");
                System.out.println("You ran around until you lock yourself in the garage.");
                System.out.println("You can see a Hammer, Screwdriver, and your car.\n");
                System.out.println("What should you do?\n");
                System.out.println("> Get the hammer.");
                System.out.println("> Get the screwdriver.");
                System.out.println("> Go to the car.");
                
            }
            else if(room==2){
                System.out.println("_______________________________________________________________________");
                System.out.println("You went back inside and saw the stranger and it started running towards you.");
                System.out.println("What should you do?\n");
                System.out.println("> Attack with the hammer.");
                System.out.println("> Attack with the screwdriver.");
                System.out.println("> Attack with bare hands.");
                System.out.println("> Go back to the garage.");
            }
            else if(room==3){
                System.out.println("You Grab the key to your car and start heading to it.");
                System.out.println("You start your car and drove away to your house.");
                System.out.println("Finished Chapter 1 | Congratulation!");
                System.out.println("_______________________________________________________________________");
                System.out.println("Chapter 2...");
            }
            
            System.out.println("Inventory: ");
            if(hasHammer){
                System.out.print("Hammer|");
            }
             if(hasScrewdriver){
                System.out.print("Screwdriver|");
            }
            System.out.println();
            System.out.println("Health:" + health + "/100");
            System.out.println ("Strager Health:" + stranger + "/50");
            
            System.out.print(">");
            command = inp.nextLine();
            
            if (room==1){
                
                if(command.equals("Get the hammer") || command.equals("Get hammer") || command.equals("Get the hammer.") || command.equals("Get hammer.")){
                    System.out.println("_______________________________________________________________________");
                    System.out.println("You got the hammer");
                    System.out.println("What should I do now?");
                    System.out.println("_______________________________________________________________________");
                    health +=10;
                    hasHammer = true;
                }
                else if(command.equals("Get the screwdriver") || command.equals("Get the screwdriver.") || command.equals("Get screwdriver") || command.equals("Get screwdriver.")){
                    System.out.println("_______________________________________________________________________");
                    System.out.println("You got the screwdriver.");
                    System.out.println("What should I do now?");
                    System.out.println("_______________________________________________________________________");
                    health +=10;
                    hasScrewdriver = true;
                }
                else if(command.equals("Go to the car") || command.equals("Go to the car.")){
                    System.out.println("_______________________________________________________________________");
                    System.out.println("The car is lock. I need to get the key inside.");
                    System.out.println("Going back inside to fight the stranger.");
                    health +=10;
                    room = 2;
                }
                else{
                    System.out.println("_______________________________________________________________________");
                    System.out.println("What was I thinking again?");
                    System.out.println("_______________________________________________________________________");
                }
                
            }
            else if(room==2){
                
                if(command.equals("Attack with the hammer") || command.equals("Attack with the hammer.") || command.equals("Attack with hammer") || command.equals("Attack with hammer.")){
                    
                    if(stranger <= 0){
                    System.out.println("_______________________________________________________________________");
                    System.out.println("The strager fell to the ground and stop moving.");
                    System.out.println("_______________________________________________________________________");
                    room = 3;
                    }
                     else if(health <= 0){
                    System.out.println("_______________________________________________________________________");
                    System.out.println("You tried your best to fight back but you cannot do it. You got eaten.");
                    System.out.println("GAME OVER!");
                    System.out.println("_______________________________________________________________________");
                    break;
                    }
                    
                    else if (hasHammer){
                        System.out.println("_______________________________________________________________________");
                        System.out.println("You hit the stranger with a hammer!!!");
                        System.out.println("_______________________________________________________________________");
                        System.out.println("The stranger hit you back!!!");
                        System.out.println("_______________________________________________________________________");
                        PlyDMG = rng.nextInt(15) + 5;
                        EnyDMG = rng.nextInt(6) + 1;
                        stranger -= PlyDMG;
                        health -= EnyDMG;
                    }
                    else{
                        System.out.println("_______________________________________________________________________");
                        System.out.println("You dont have this item.");
                        System.out.println("_______________________________________________________________________");
                    }
                    }
                
                else if(command.equals("Attack with the screwdriver") || command.equals("Attack with the screwdriver.") || command.equals("Attack with screwdriver") || command.equals("Attack with screwdriver.")){
                    if (hasScrewdriver){
                        System.out.println("_______________________________________________________________________");
                        System.out.println("You hit the stranger with a srewdriver!!!");
                        System.out.println("_______________________________________________________________________");
                        System.out.println("The stranger hit you back!!!");
                        System.out.println("_______________________________________________________________________");
                        PlyDMG = rng.nextInt(11) + 5;
                        EnyDMG = rng.nextInt(6) + 1;
                        stranger -= PlyDMG;
                        health -= EnyDMG;
                    }
                    else{
                        System.out.println("_______________________________________________________________________");
                        System.out.println("You dont have this item.");
                        System.out.println("_______________________________________________________________________");
                    }
                }
                
                else if(command.equals("Attack with bare hands") || command.equals("Attack with bare hands.") || command.equals("Attack with hands") || command.equals("Attack with hands.")){
                        System.out.println("_______________________________________________________________________");
                        System.out.println("You punch the stranger!!!");
                        System.out.println("_______________________________________________________________________");
                        System.out.println("The stranger hit you back!!!");
                        System.out.println("_______________________________________________________________________");
                        PlyDMG = rng.nextInt(6) + 1;
                        EnyDMG = rng.nextInt(6) + 1;
                        stranger -= PlyDMG;
                        health -= EnyDMG;
                }
                else if(command.equals("Go back to the garage") || command.equals("Go back to the garage.")){
                    System.out.println("_______________________________________________________________________");
                    System.out.println("You tried to go back inside the garage but he got to you first and started biting you.");
                    System.out.println("GAME OVER!");
                    System.out.println("_______________________________________________________________________");
                    }
              
                else{
                    System.out.println("_______________________________________________________________________");
                    System.out.println("What was I thinking again?");
                    System.out.println("_______________________________________________________________________");
                }
            }
                
        }
    } 
}
