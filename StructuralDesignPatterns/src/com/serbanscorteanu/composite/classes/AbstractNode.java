package com.serbanscorteanu.composite.classes;

public abstract class AbstractNode {
    // specific to the leaves
    public abstract String getName();
    public abstract float getPrice();

    // not specific to leaves
    public String getInfo(){
        return this.getName() + this.getPrice();
    }

    public void addNode(AbstractNode element) throws Exception {
        throw new Exception();
    }

    public void removeNode(AbstractNode element) throws Exception {
        throw new Exception();
    }

    public AbstractNode getNode(int index) throws Exception {
        throw new Exception();
    }


}
