package com.survivalcoding;

public class Cleric {
    String name;

    int hp;
    final int maxHp = 50;
    int mp;
    final int maxMp = 10;

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    void status() {
        System.out.println(name);
        System.out.println(hp / maxHp);
        System.out.println(mp / maxMp);
    }
}
