package com.kata;

public class Tamagotchi {
    
   /*  int mood = 4;
    int hunger = 4;
    int energy = 4; */


    private int hungriness;
    private int fullness;
    private int happiness;
    private int tiredness;
    private int energy;

    public Tamagotchi() {
        this.hungriness = 5;
        this.fullness = 5;
        this.happiness = 5;
        this.tiredness = 3;
        this.energy = 4;
    }

    public int getHungriness() {
        return hungriness;
    }

    public void setHungriness(int hungriness) {
        this.hungriness = hungriness;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void eat() {
        hungriness -= 2;
        fullness += 2;
    }

    public void play() {
        happiness += 2;
        tiredness += 2;
    }

    public void putToBed() {
        tiredness -= 3;
    }

    public void poop() {
        fullness -= 2;
    }



}
