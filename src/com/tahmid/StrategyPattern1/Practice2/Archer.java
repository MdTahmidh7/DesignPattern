package com.tahmid.StrategyPattern1.Practice2;

public class Archer extends Hero{
public Archer(){
    attackingType = new AttackWithWater();
}
}
