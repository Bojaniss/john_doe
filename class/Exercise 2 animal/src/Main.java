public class Main {
    public static void main(String[] args) {

        Animal[] animalArray = new Animal[4];

        animalArray [0] =new Dog(name:"Simba");
        animalArray [1] =new Lion(name:"Simka");
        animalArray [2] =new Frog(name:"Sanchez");
        animalArray [3] =new SaraMountainDog(name:"Sara");
        //animalArray [4] =new Animal();


        for(Animal animal: animalArray){
            animal.onomatopoeia();

            if(animal instanceof SaraMountainDog){
                ((SaraMountainDog)animal)
            }
        }

