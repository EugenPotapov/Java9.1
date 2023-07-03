package ru.netology.services;

public class Radio {
    public int currentVolume;
    public int numberRadioStation;

    public void setNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < 0) {
            newNumberRadioStation = 0;
        }
        if (newNumberRadioStation > 9) {
            newNumberRadioStation = 9;
        }
        numberRadioStation = newNumberRadioStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public int nextRadioStation() {
        numberRadioStation = numberRadioStation + 1;
        if (numberRadioStation > 9) {
            numberRadioStation = 0;
        }
        return numberRadioStation;
    }

    public int prevRadioStation() {
        numberRadioStation = numberRadioStation - 1;
        if (numberRadioStation < 0) {
            numberRadioStation = 9;
        }
        return numberRadioStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 100) {
            newVolume = 100;
        }
        currentVolume = newVolume;
    }

    public int getVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }
    public int decreaseVolume() {
        currentVolume = currentVolume - 1;
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }
}