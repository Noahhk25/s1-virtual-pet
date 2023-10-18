/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void die(){
        face.setImage("dead");
    }

    public void annoyed(){
        face.setImage("annoyed");
    }

    public void angry(){
        face.setImage("angry");
    }

    public void depressed(){
        face.setImage("depressed");
    }
    public void enraged(){
        face.setImage("enraged");
    }

    public void love(){
        face.setImage("love");
    }

    public void happy(){
        face.setImage("ecstatic");
    }
    public void skeleton(){
        face.setImage("skeleton");
    }
    public void flower(){
        face.setImage("pushingdaisies");
    }
    public void optimusPrime(){
        face.setImage("optimusprime");
    }
    public void dieScreen(){
        face.setImage("dieScreen");
    }
    public void starving(){
        face.setImage("starving");
    }
} // end Virtual Pet
