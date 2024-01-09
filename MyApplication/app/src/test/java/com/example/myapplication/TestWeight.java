package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeight {
    @Test
    public void convertEUSmallNUmber() {
        assertEquals(0.064, Weight.convertToEU(0.14f), 0.001);
    }

    @Test
    public void convertEUZero() {
        assertEquals(0.0f, Weight.convertToEU(0.0f), 0.001);
    }

    @Test
    public void convertEUNumber() {
        assertEquals(10.043f, Weight.convertToEU(22.14f), 0.001);
    }

    @Test
    public void convertUSSmallNUmber() {
        assertEquals(0.309, Weight.convertToUs(0.14f), 0.001);
    }

    @Test
    public void convertUSZero() {
        assertEquals(0.0f, Weight.convertToUs(0.0f), 0.001);
    }

    @Test
    public void convertUSNumber() {
        assertEquals(48.81f, Weight.convertToUs(22.14f), 0.001);
    }
}
