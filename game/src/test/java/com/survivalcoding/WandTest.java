package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WandTest {

    @Test
    @DisplayName("Wand Name Getter / Setter")
    void getName() {
        Wand wand = new Wand();

        wand.setName("기다란완드");

        assertEquals("기다란완드", wand.getName());
    }

    @Test
    @DisplayName("Wand Power Getter / Setter")
    void getPower() {
        Wand wand = new Wand();

        wand.setPower(5.0);

        assertEquals(5.0, wand.getPower());
    }
}