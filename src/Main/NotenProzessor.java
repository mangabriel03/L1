package Main;

//package com.example.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotenProzessor {


    public int[] nichtAusreichendeNoten(int[] note) {

        if (note.length == 0)
            throw new RuntimeException();

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) < 40) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }

    public int round(int note) {
        if (note <= 0)
            throw new RuntimeException();
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        if (original.length == 0 || newElement <= 0)
            throw new RuntimeException();
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public int Durchschnittswert  (int[] note){
        if (note.length == 0)
            throw new RuntimeException();
        int sum = 0;
        for (int i = 0; i < note.length; i ++){
            sum = sum + note[i];
        }
        return sum/note.length;
    }

    public int[] abgerundeteNote (int [] note) {
        if (note.length == 0)
            throw new RuntimeException();
        int[] abgerundeteNoten = new int[note.length];

        for (int i = 0; i < note.length; i++) {
            abgerundeteNoten[i] = round(note[i]);
        }

        return abgerundeteNoten;
    }

    public int Maximale (int[] note){
        if (note.length == 0)
            throw new RuntimeException();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < note.length; i++)
            if (note[i] > max)
                max = note[i];

        return max;
    }




}

