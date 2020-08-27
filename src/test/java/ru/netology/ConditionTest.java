package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {
    @Test
    public void currentTemperatureInRangeIncr() {
        Condition condition = new Condition();
        condition.setMinTemperature(15);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(20);
        condition.increaseCurrentTemperature();
        assertEquals(21, condition.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureInRangeDecr() {
        Condition condition = new Condition();
        condition.setMinTemperature(15);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(29);
        condition.decreasedCurrentTemperature();
        assertEquals(28, condition.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOnLimitDecr() {
        Condition condition = new Condition();
        condition.setMinTemperature(15);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(30);
        condition.decreasedCurrentTemperature();
        assertEquals(29, condition.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOnLimitIncr() {
        Condition condition = new Condition();
        condition.setMinTemperature(15);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(15);
        condition.increaseCurrentTemperature();
        assertEquals(16, condition.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOverLimitMin() {
        Condition condition = new Condition();
        condition.setMinTemperature(15);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(-10);
        assertEquals(0, condition.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOverLimitMax() {
        Condition condition = new Condition();
        condition.setMinTemperature(15);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(100);
        assertEquals(0, condition.getCurrentTemperature());
    }
}