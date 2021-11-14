package com.sakolinsb;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        //Init instance of singleton class
        Singleton mySingleton = Singleton.getInstance("HelloWorld");
        //Should return HelloWorld
        System.out.println(mySingleton.value);


        //Init second instance of singleton class 
        Singleton mySecondSingleton = Singleton.getInstance("GoodByeWorld");
        //Should also return HelloWorld
        System.out.println(mySecondSingleton.value);


        
    }
}
