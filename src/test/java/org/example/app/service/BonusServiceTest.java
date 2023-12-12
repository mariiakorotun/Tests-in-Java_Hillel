package org.example.app.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class BonusServiceTest {
    private BonusService serv;
    private static final double DOUBLE = 0.01; // Точність для порівняння double

    @Before
    public void setUp() {
        serv = new BonusService();
    }

    @DisplayName("Bonus Service Test Right Answer1 calcBonus()")
    @Test
    public void test_BonusService_Right1(){
        assertEquals(15, serv.calcBonus(150),DOUBLE);
    }

    @DisplayName("Bonus Service Test Right Answer2 getRes()")
    @Test
    public void test_BonusService_Right2(){
        assertEquals("Incorrect value!",serv.getRes(-2));
    }

    @DisplayName("Bonus Service Test Wrong Answer1 calcBonus()")
    @Test
    public void test_BonusService_Wrong1(){
        assertNotEquals(1.5,serv.calcBonus(150),DOUBLE);
    }

    @DisplayName("Bonus Service Test Wrong Answer2 calcBonus()")
    @Test
    public void test_BonusService_Wrong2(){
        assertEquals(2,serv.calcBonus(200),DOUBLE);
    }
    @After
    public void tearDown(){
        serv = null;
    }
}