package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements PlayerInterface {

    CasinoAccount sp = getArcadeAccount();

    public SlotsPlayer() {
    }

    public void transferMoney(double wager) {
        sp.addMoneys(wager);
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        return sp;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}