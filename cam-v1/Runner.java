import javax.swing.*;


public class Runner {
    public Runner() {
        VirtualPet v = new VirtualPet();

        getResponse("whats your name?");
        v.love();
        takeABeat(2000);
        String a = getResponse("What is that");
        takeABeat(2000);
        
        int n = getOptions("What will you choose to do with your " + a.substring(a.indexOf(" ") + 1));
        if(n == 1){
            v.die();
            takeABeat(1000);
            v.skeleton();
            takeABeat(1000);
            v.flower();
        }else{
            v.happy();
        }if(n == 0){
            getResponse("so what're you gonna do with your " + a.substring(a.indexOf(" ") + 1));
            takeABeat(1000);
            v.love();
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
public int getOptions(String question){
    Object[] options = {"Spare him", "kill him"};
    int n = JOptionPane.showOptionDialog(
        new JFrame(),
        question,
        "A silly quetin",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]
    );
    return n;
}


    public static void main(String[] args) {
        new Runner();
    }
}