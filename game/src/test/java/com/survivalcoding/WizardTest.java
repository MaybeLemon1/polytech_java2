package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class WizardTest {

    @Test
    @DisplayName("Heal은 지팡이의 power 계수만큼 회복")
    void heal() {
        Wizard wizard = new Wizard();

        Wand wand = new Wand();
        wand.setName("기다란완드");
        wand.setPower(1.0);

        wizard.setWand(wand);

        Hero hero = new Hero();
        hero.setHp(30);

        wizard.heal(hero);

        assertEquals(40, hero.getHp());
    }

    @Test
    @DisplayName("Wizard Hp Getter / Setter")
    void getHp() {
        Wizard wizard = new Wizard();

        wizard.setHp(30);

        assertEquals(30, wizard.getHp());
    }

    @Test
    @DisplayName("Wizard Mp Getter / Setter")
    void getMp() {
        Wizard wizard = new Wizard();

        wizard.setMp(5);

        assertEquals(5, wizard.getMp());
    }

    @Test
    @DisplayName("Wizard Name")
    void getName() {
        Wizard wizard = new Wizard();

        wizard.setName("마법사");

        assertEquals("마법사", wizard.getName());
    }


    @Test
    @DisplayName("Wand 상세정보")
    void getWand() {
        Wizard wizard = new Wizard();

        Wand wand = new Wand();
        wand.setName("기다란완드");
        wand.setPower(2.0);

        wizard.setWand(wand);

        assertSame(wand, wizard.getWand());
    }

}