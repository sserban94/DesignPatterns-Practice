package com.serbanscorteanu.singleton.classes;

public class SingletonSolvedEarlyThreadSafe {
    private static SingletonSolvedEarlyThreadSafe connection = new SingletonSolvedEarlyThreadSafe();

    private SingletonSolvedEarlyThreadSafe(){

    }

    public static SingletonSolvedEarlyThreadSafe getInstance(){
        return connection;
    }
}
