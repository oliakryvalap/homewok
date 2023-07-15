public class Sparrow  extends Animal {
        
    
    public Sparrow (){
        this("Pop",null,null, false);
    }
    public Sparrow (String animal, String ownerName, String diagnosis, Boolean isVaccinated){
        super( animal, ownerName,diagnosis,  isVaccinated);
        
    }
    private static void jumping (){
        System.out.println("Воробей прыгает");
    }
   
    
   public static void live_Sparrow(){
    
    jumping();
    
   
   
   }


}


