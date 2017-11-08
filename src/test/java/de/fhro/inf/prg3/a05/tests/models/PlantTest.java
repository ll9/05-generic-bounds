package de.fhro.inf.prg3.a05.tests.models;

import de.fhro.inf.prg3.a05.model.Flower;
import de.fhro.inf.prg3.a05.model.PlantColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {
    Flower flower = new Flower(1.5, "Rose", "Rose", PlantColor.RED);

    @BeforeEach
    void setUp() {
    }

    @Test
    void getHeight() {
        assertEquals(1.5, flower.getHeight(), 0.001);
    }

    @Test
    void getFamily() {
    }

    @Test
    void getName() {
    }

    @Test
    void getColor() {
        assertThrows(IllegalArgumentException.class, () -> new Flower(1.5, "Rose", "Rose", PlantColor.GREEN));
    }

}