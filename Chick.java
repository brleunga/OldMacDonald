class Chick implements Animal
{     
    private String myType;
    private String mySound;
    private int mystery;
    public Chick(String type, String sound, String sound2) {
    	myType = type;
        mystery = (int)(Math.random()*2)+1;
        if (mystery == 1) {
            mySound = sound;
        }
    	else {
            mySound = sound2;
        }
    }
    public Chick() {
    	myType = "unknown";
    	mySound = "unknown";
    }
    public String getSound() {return mySound;}
    public String getType() {return myType;}
}
