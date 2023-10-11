public class Runner {
    public Runner() {
        VirtualPet v = new VirtualPet();


        v.exercise();
        takeABeat(1000);
        v.sleep();
        
        
        
        // String ans = getAnswer("How are you?");
        // if(ans.equalsIgnoreCase("Good")){
        //     v.respondPositively();
        // }
    }
    
    
    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
        
        }

    }
    public static void main(String[] args) {
        new Runner();
    }
}