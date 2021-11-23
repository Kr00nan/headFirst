package exercises;

class DogTestDrive {
    public static void main(String[] args){
        // dog test code goes here
        Dog scout = new Dog();
        scout.size = 40;
        scout.bark();

        // test driving DogList
        MyDogList myList = new MyDogList();
        myList.addDog(new Dog());
        myList.addDog(new Dog());
        myList.addDog(new Dog());
        myList.addDog(new Dog());
        myList.addDog(new Dog());
        myList.addDog(new Dog());
        myList.addDog(new Dog());

        // test driving AnimalList
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
        list.add(d);
        list.add(c);

    }
}
