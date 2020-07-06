interface Pet{

    public abstract void play();
}

interface HouseAnimal{

    public abstract void space();
}

abstract class Animal{

    String name;

    public void setName(String name){

        this.name = name;
    }

    public abstract void sound();
}

class Dog extends Animal implements Pet, HouseAnimal{

    public void sound(){

        System.out.println("¸Û¸Û");
    }

    public void play(){

        System.out.println("°ø ¹°¾î¿À±â");
    }

    public void space(){

        System.out.println("°Å½Ç");
    }
}

class Cat extends Animal implements Pet, HouseAnimal{

    public void sound(){

        System.out.println("¾ß¿Ë");
    }

    public void play(){

        System.out.println("Ä¹ Å¸¿ö");
    }

    public void space(){

        System.out.println("¾È¹æ");
    }
}

public class AnimalTest1{

    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.sound();
        cat.play();
        cat.space();

        dog.sound();
        dog.play();
        dog.space();
    }
}