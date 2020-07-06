abstract class Animal{

    String name;

    void setName(String name){

        this.name = name;
    }

    public abstract void sound();
}

class Dog extends Animal{

    public void sound(){

        System.out.println("港港");

    }
}

class Cat extends Animal{

    public void sound(){

        System.out.println("具克");

    }
}

public class AnimalTest{

    public static void main(String[] args){

    Animal ani[] = new Animal[2];

    ani[0] = new Dog();
    ani[1] = new Cat();

    for(int i = 0; i < 2; i++)
        ani[i].sound();
    }
}