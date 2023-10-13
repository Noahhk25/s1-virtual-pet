import javax.swing.*;


public class Runner {
    public Runner() {
        VirtualPet v = new VirtualPet();

        getResponse("whats your name?");
        v.love();
        takeABeat(2000);
        getResponse("What is that");
        takeABeat(2000);
        String Answer = getResponse("what will you choose to do");
        if(Answer.equals("spare")){
            v.happy();
        }else{
            v.die();
        }
        
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
// String s = (String)JOptionPane.showInputDialog(
//          new JFrame(),
//          "How many laps should I run?",
//          "Question?",
//          JOptionPane.PLAIN_MESSAGE
//        );
// int x = Integer.parseInt(s);
public String getResponse(String q){
    String s = (String)JOptionPane.showInputDialog(
                        new JFrame(),
                        q,
                        "Your Title",
                        JOptionPane.PLAIN_MESSAGE
    );
    return s;
    
    }




    public static void main(String[] args) {
        new Runner();
    }
}