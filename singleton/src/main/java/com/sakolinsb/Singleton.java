package com.sakolinsb;

public class Singleton {
    
    private static Singleton instance;
    public String value;

    private Singleton(String Value){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = Value;
    }

    public static Singleton getInstance(String Value){
        if(instance == null){
            instance = new Singleton(Value); 
        };
        return instance;
    }


}
