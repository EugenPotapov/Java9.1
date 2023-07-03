package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setNumberRadioStation() {
        Radio set = new Radio();
        set.setNumberRadioStation(5);
        int expected = 5;
        int actually = set.getNumberRadioStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void setBelowMinNumberRadioStation() {
        Radio belowMin = new Radio();
        belowMin.setNumberRadioStation(-1);
        int expected = 0;
        int actually = belowMin.getNumberRadioStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void setAboveMaxNumberRadioStation() {
        Radio aboveMax = new Radio();
        aboveMax.setNumberRadioStation(10);
        int expected = 9;
        int actually = aboveMax.getNumberRadioStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void next8() {
        Radio next8 = new Radio();
        next8.setNumberRadioStation(8);
        next8.nextRadioStation();
        int expected = 9;
        int actually = next8.getNumberRadioStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void next9() {
        Radio next = new Radio();
        next.setNumberRadioStation(9);
        next.nextRadioStation();
        int expected = 0;
        int actually = next.getNumberRadioStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void prev0() {
        Radio prev = new Radio();
        prev.setNumberRadioStation(0);
        prev.prevRadioStation();
        int expected = 9;
        int actually = prev.getNumberRadioStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void prev1() {
        Radio prev1 = new Radio();
        prev1.setNumberRadioStation(1);
        prev1.prevRadioStation();
        int expected = 0;
        int actually = prev1.getNumberRadioStation();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void enterVolume() {
        Radio enter = new Radio();
        enter.setVolume(50);
        int expected = 50;
        int actually = enter.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void enterBelowMinVolume() {
        Radio belowMin = new Radio();
        belowMin.setVolume(-1);
        int expected = 0;
        int actually = belowMin.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void enterAboveMaxVolume() {
        Radio aboveMax = new Radio();
        aboveMax.setVolume(101);
        int expected = 100;
        int actually = aboveMax.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void increaseVolume50() {
        Radio increaseVolume50 = new Radio();
        increaseVolume50.setVolume(50);
        increaseVolume50.increaseVolume();
        int expected = 51;
        int actually = increaseVolume50.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void increaseVolume100() {
        Radio increaseVolume = new Radio();
        increaseVolume.setVolume(100);
        increaseVolume.increaseVolume();
        int expected = 100;
        int actually = increaseVolume.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void decreaseVolume0() {
        Radio decreaseVolume = new Radio();
        decreaseVolume.setVolume(0);
        decreaseVolume.decreaseVolume();
        int expected = 0;
        int actually = decreaseVolume.getVolume();
        Assertions.assertEquals(expected, actually);
    }

    @Test
    public void decreaseVolume50() {
        Radio decreaseVolume50 = new Radio();
        decreaseVolume50.setVolume(50);
        decreaseVolume50.decreaseVolume();
        int expected = 49;
        int actually = decreaseVolume50.getVolume();
        Assertions.assertEquals(expected, actually);
    }
}