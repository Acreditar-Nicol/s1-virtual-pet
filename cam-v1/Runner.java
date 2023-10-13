import javax.swing.*;


public class Runner{
 
    public Runner(){
        VirtualPet p2 = new VirtualPet();
    }
 public String getResponse(String q){
    String s = (String)JOptionPane.showInputDialog(
        new JFrame(),
        q,
        "Get a response",
        //"Your Title",
        JOptionPane.PLAIN_MESSAGE
);
//if(s.equals(“Yes”) ….
return s;
}

    public void takeABeat(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        } catch(Exception e){

        }
    }

    public static void main(String[] args){
        VirtualPet p1 = new VirtualPet();
        
    }


}