package com.serbanscorteanu.singleton.classes;

public class SingletonSolvedLazyThreadSafe {
    private SingletonSolvedLazyThreadSafe connection = null;

    private SingletonSolvedLazyThreadSafe(){

    }

    // now this one explained
    // first check if connection is null, but keep in mind that the initialization could be taking a while
    // so two threads could check this at the same time
    // if we synchronized this each thread would have to wait for each other
    // so by checking it twice it will only block the threads at first, but after the connection is made
    // it will speed up the process
    public SingletonSolvedLazyThreadSafe getConnection(){
        if (connection == null){
            // remember to use the class - it's static, so it would be wrong to use the object
            synchronized (SingletonSolvedLazyThreadSafe.class){
                if (connection == null){
                    connection = new SingletonSolvedLazyThreadSafe();
                }
            }
        }
        return connection;
    }
}
