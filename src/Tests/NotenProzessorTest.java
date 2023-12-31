package Tests;
//package com.example.test;
import Main.NotenProzessor;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class NotenProzessorTest {

    private NotenProzessor notenProzessor;

    @BeforeEach
    public void setUp() {
        notenProzessor = new NotenProzessor();
    }

    @Test
    public void testNichtAusreichendeNotenThrowsException() {
        int[] testNoten = {};
        assertThrows(RuntimeException.class, () -> notenProzessor.nichtAusreichendeNoten(testNoten));
    }

    @Test
    public void testRoundThrowsException() {
        int testNote = -5;
        assertThrows(RuntimeException.class, () -> notenProzessor.round(testNote));
    }

    @Test
    public void testAddToArrayThrowsException() {
        int[] originalArray = {10, 20, 30};
        int newElement = -5;
        assertThrows(RuntimeException.class, () -> notenProzessor.addToArray(originalArray, newElement));
    }
    @Test
    public void testDurchschnittswertException(){
        int[] note = {};
        assertThrows(RuntimeException.class, () ->notenProzessor.Durchschnittswert(note));
    }

    @Test
    public void testAbgerundeteException(){
        int[] note = {};
        assertThrows(RuntimeException.class, () ->notenProzessor.abgerundeteNote(note));
    }

    @Test
    public void testMaximaleException(){
        int[] note = {};
        assertThrows(RuntimeException.class, () ->notenProzessor.Maximale(note));
    }


    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    public void addToArrayTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30 };
        int newElement = 50;

        int[] result = notenProzessor.addToArray(noten, newElement);

        assert noten[0] == result[0] : SHOULD_BE_EQUAL;
        assert noten[2] == result[1] : SHOULD_BE_EQUAL;
        assert noten[2] == result[2] : SHOULD_BE_EQUAL;
        assert result[3] == newElement : SHOULD_BE_EQUAL;

    }

    public void DurchschnittswertTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int [] noten = new int[] {10,40,50,60};
        int sum = 0;
        sum = 40 + 50 + 60;
        int result = notenProzessor.Durchschnittswert(noten);
        assert sum/noten.length == result;
    }

    public void abgerundeteNotenTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] note = new int[] {10, 45, 53, 67};
        int[] abgerundete = notenProzessor.abgerundeteNote(note);

        int[] expectedAbgerundete = new int[] {10, 45, 55, 70};

        // Verificați dacă array-ul rezultat este identic cu array-ul așteptat
        assert abgerundete == expectedAbgerundete;
    }

    public void MaximaleTest() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] note = new int[] {10, 35, 56, 20};
        int max = notenProzessor.Maximale(note);
        assert max == 60;
    }

}