public class Pig  extends Animal {
        
    
    public Pig (){
        this("Masyanya",null,null, false);
    }
    public Pig (String animal, String ownerName, String diagnosis, Boolean isVaccinated){
        super( animal, ownerName,diagnosis,  isVaccinated);
        
    }
    private static void grunt (){
        System.out.println("Поросенок хрюкает");
    }
    private static void run(){
        System.out.println("Поросенок бегает");
    }
    
   public static void live(){
    
    grunt(); 
    run ();
   
   
   }


}


