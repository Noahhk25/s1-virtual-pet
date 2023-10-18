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
            takeABeat(1000);
        }else{
            v.happy();
        }if(n == 0){
            getResponse("so what're you gonna do with your " + a.substring(a.indexOf(" ") + 1));
            takeABeat(1000);
            v.love();
            takeABeat(1000);
        }
        String g = getOption("lets do something fun!", new Object[]{"Sure!", "Maybe", "accidentally slap him"});
        if(g.equals("Sure!")){
            v.optimusPrime();
        }   else{
            v.annoyed();
            takeABeat(1000);
            v.depressed();
            takeABeat(1000);
            v.die();
            takeABeat(1000);
            v.optimusPrime();
            takeABeat(500);
            
        }   
            if(g.equals("accidentally slap him")){
            v.die();
            takeABeat(1000);
            v.skeleton();
            takeABeat(1000);
            v.optimusPrime();
            takeABeat(1000);
        
        }       int b = getOptio("What are you going to do now? I am Optimus Prime");
                if(b == 0){
                v.dieScreen();
                }       else{
                    v.happy();
                    takeABeat(1000);
                    v.starving();
                    takeABeat(1000);
                    v.depressed();
                    takeABeat(1000);

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
    Object[] options = {"Spare him", "accidentally punch him in the face"};
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

public String getOption(String question, Object[] possibilities){
    String s = (String) JOptionPane.showInputDialog(
        new JFrame(),
        question,
        "Customized dialog",
        JOptionPane.PLAIN_MESSAGE,
        null,
        possibilities,
        "ham"
    );
    return s;
}
public int getOptio(String question){
    Object[] options = {"Fight", "Run", "ask to go to the bathroom"};
    int n = JOptionPane.showOptionDialog(
        new JFrame(),
        question,
        "A silly quetin",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[2]
    );
    return n;
}


    public static void main(String[] args) {
        new Runner();
    }
}