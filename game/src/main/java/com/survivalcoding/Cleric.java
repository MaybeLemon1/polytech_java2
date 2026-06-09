package com.survivalcoding;

public class Cleric {
    String name;

    int hp;
    static final int maxHp = 50;
    int mp;
    static final int maxMp = 10;
    static final int selfAidMpCost = 5;

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    void status() {
        System.out.println(name);
        System.out.println(hp + "/" + maxHp);
        System.out.println(mp + "/" + maxMp);
    }

    void selfAid() {
        if (mp >= selfAidMpCost) {
            mp -= selfAidMpCost;
            hp = maxHp;
        }
    }

    public int pray(int sec) {

        int beforeMp = mp;

        int mpRecovery = (int) (Math.random() * 3) + sec;

        mp += mpRecovery;
        if (mp >= maxMp) {
            mp = maxMp;
        }

        return mp - beforeMp;
    }
}
