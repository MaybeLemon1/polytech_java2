package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    void status() {
        final Cleric cleric = new Cleric("클레릭", 20, 5);

        cleric.status();

        assertEquals(20, cleric.hp);
        assertEquals(50, cleric.maxHp);
        assertEquals(5, cleric.mp);
        assertEquals(10, cleric.maxMp);

        cleric.selfAid();

        assertEquals(50, cleric.hp);
        assertEquals(0, cleric.mp);
    }
}