package com.company;

import java.util.Random;

public class YatzyEvaluator {

    int getRollSum() {
        Random rand = new Random();

        int dice1 = rand.nextInt(50);
        int dice2 = rand.nextInt(50);
        int dice3 = rand.nextInt(50);
        int dice4 = rand.nextInt(50);
        int dice5 = rand.nextInt(50);
        int dicesum = dice1 + dice2 + dice3 + dice4 + dice5;
        System.out.println(dicesum);
        return dicesum;
    }

    boolean isYatzy() {
return true;
    }

    boolean isBigStraight() {
        boolean wrong = true;
        return wrong;
    }

    boolean isSmallStraight() {
        boolean wrong = true;
        return wrong;
    }

    boolean isFullHouse() {
        boolean wrong = true;
        return wrong;
    }

    boolean isFourOfAKind() {
        boolean wrong = true;
        return wrong;
    }
}
