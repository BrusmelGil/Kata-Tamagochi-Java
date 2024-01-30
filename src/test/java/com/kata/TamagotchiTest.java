package com.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


public class TamagotchiTest {
    
    @Test
    public void testEat() {

        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.eat();

        int currentHungrines = tamagotchi.getHungriness();

        assertEquals(3, currentHungrines);
    
}

@Test
public void testPlay() {
    Tamagotchi tamagotchi = new Tamagotchi();

    tamagotchi.play();

    assertEquals(7, tamagotchi.getHappiness());
    
}

@Test
public void testPutToBed() {
    Tamagotchi tamagotchi = new Tamagotchi();

    tamagotchi.putToBed();

    assertEquals(0, tamagotchi.getTiredness());
}

@Test
    public void testPoop() {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.poop();
        assertEquals(3, tamagotchi.getFullness());
    }

}
