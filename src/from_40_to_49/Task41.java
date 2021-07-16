package from_40_to_49;

/*
Complete the Singleton class in your editor which contains the following components:

    -> A private Singleton non parameterized constructor.
    -> A public String instance variable named .
    -> Write a static method named getSingleInstance that returns the single instance of the Singleton class.
 */

public class Task41 {
}

class Singleton{
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }
    public String str;

    static Singleton getSingleInstance(){
        return INSTANCE;
    }
}
