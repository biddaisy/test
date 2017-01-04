package com.mr.gof.visitor;

import java.util.List;

/**
 * Created by Ramanovich on 12/30/2016.
 */
public class SuperBoss extends Boss {

    private int optionBonus;

    public int getOptionBonus() {
        return optionBonus;
    }

    public void setOptionBonus(int optionBonus) {
        this.optionBonus = optionBonus;
    }

    @Override
    public void accept (Visitor visitor){
        visitor.visit(this);
        acceptChildren(visitor);
    }
}
