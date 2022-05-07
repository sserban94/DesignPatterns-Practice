package com.serbanscorteanu.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Structure extends AbstractNode{
    // non leaf elem class
    private List<AbstractNode> list = new ArrayList<>();
    String nameStructure;

    @Override
    public String getName() {
        return this.nameStructure;
    }

    @Override
    public float getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        String info="";
        for(AbstractNode node:list){
            info+="\n " + node.getInfo();
        }
        return info;
    }

    @Override
    public void addNode(AbstractNode element) throws Exception {
        list.add(element);
    }

    @Override
    public void removeNode(AbstractNode element) throws Exception {
        list.remove(element);
    }

    @Override
    public AbstractNode getNode(int index) throws Exception {
        return list.get(index);
    }

    public Structure(String nameStructure) {
        this.nameStructure = nameStructure;
    }
}















