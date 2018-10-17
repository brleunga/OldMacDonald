class Farm 
{     
   private Animal[] aBunchofAnimals = new Animal[3];
   public Farm() {
   	aBunchofAnimals[0] = new NamedCow("cow", "moo", "Elsie");
   	aBunchofAnimals[1] = new Pig("pig", "oink");
   	aBunchofAnimals[2] = new Chick("chick", "cheep", "cluck");
   }
   public void animalSounds() {
   	for (int i = 0; i < aBunchofAnimals.length; i++) {
   		System.out.println(aBunchofAnimals[i].getType() + " goes " + aBunchofAnimals[i].getSound());
   	}
      System.out.println("The cow is known as " + ((NamedCow)aBunchofAnimals[0]).getName());
   }
}
