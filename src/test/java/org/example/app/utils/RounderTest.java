package org.example.app.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.Assert.*;

public class RounderTest {
    private Rounder round;

    @Before
    public void setUp() {
        round = new Rounder();
    }

    @DisplayName("Rounder Test Right Answer")
    @Test
    public void test_Rounder_Right() {
        double inputValue = 5.678;
        String result = round.roundValue(inputValue);
        assertEquals("5,68", result);
    }

    @DisplayName("Rounder Test Wrong Answer 1")
    @Test
    public void test_Rounder_Wrong1(){
        assertEquals("5,67", round.roundValue(5.678));
    }

    @DisplayName("Rounder Test Wrong Answer 2")
    @Test
    public void test_Rounder_Wrong2(){
        assertNotEquals("3,1", round.roundValue(5.678));
    }

    @After
    public void tearDown(){
        round = null;
    }
}