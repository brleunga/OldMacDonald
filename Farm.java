class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];
   public Farm() {
   	aBunchofAnimals[0] = new Cow("cow", "moo");
   	aBunchofAnimals[1] = new Pig("pig", "oink");
   	aBunchofAnimals[2] = new Chick("chick", "cluck");
   }
   public void animalSounds() {
   	for (int i = 0; i < aBunchofAnimals.length; i++) {
   		System.out.println(aBunchofAnimals.getType + " goes " + aBunchofAnimals.getSound);
   	}
   }
}
