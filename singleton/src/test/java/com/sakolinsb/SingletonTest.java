package com.sakolinsb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {
    
    @Test
    void getInstance_Equal_OneSingleton() {
        String expected = "Test";
        Singleton singleton = Singleton.getInstance(expected);
        assertEquals(expected, singleton.value);
    }
    @Test
    void getInstance_Equal_TwoSingleton() {
        String expected = "Test";
        Singleton singleton = Singleton.getInstance(expected);
        String SecondValue = singleton.value + " Toto";
        Singleton SecondSingleton = Singleton.getInstance(SecondValue);
        assertEquals(expected, SecondSingleton.value);
    }
    @Test
    void getInstance_TwoSingletonAreEqual() {
        String expected = "Test";
        String SecondValue = "Toto";
        Singleton singleton = Singleton.getInstance(expected);
        Singleton SecondSingleton = Singleton.getInstance(SecondValue);
        assertEquals(singleton.value, SecondSingleton.value);
    }
}
