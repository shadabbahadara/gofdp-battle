package com.khan.creational.singleton;

import java.io.Serializable;

/*
ViolationCases:
1. Threading
2. Reflection
3. Serialization
4. Cloning
 */
public class MySingleton implements Serializable {
//    eager initialization
//    private static volatile MySingleton instance = new MySingleton();
    private static volatile MySingleton instance = null;

    private MySingleton() {
        if(instance != null) {
            throw new IllegalStateException("instance already created! safeguard from reflection.");
        }
    }
    public static MySingleton getInstance() {
        if(instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
