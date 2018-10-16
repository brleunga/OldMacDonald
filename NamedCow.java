class NamedCow extends Cow
{
	private String myType;
    private String mySound;
	private String myName;
	public Cow(String type, String sound, String name) {
		myType = type;
		mySound = sound;
		myName = name;
	}
	public String getName() {return myName;}
}