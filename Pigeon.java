
    public class Pigeon  extends Animal {
        
    
    public Pigeon (){
        this("Sem",null,null, false);
    }
    public Pigeon (String animal, String ownerName, String diagnosis, Boolean isVaccinated){
        super( animal, ownerName,diagnosis,  isVaccinated);
        
    }
    private static void flies (){
        System.out.println("Голубь летает");
    }
    private static void packs(){
        System.out.println("Голубь клюет");
    }
    
   public static void live_Pigeon(){
    
    flies(); 
    packs();
   
   
   }


}



