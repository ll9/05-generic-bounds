package de.fhro.inf.prg3.a05.tests.models;

import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.model.Flower;
import de.fhro.inf.prg3.a05.model.PlantBed;
import de.fhro.inf.prg3.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantBedTest {
    PlantBed<Flower> plantBed = new PlantBed<>();
    Flower[] flowers = {
            new Flower(1.1, "family", "name", PlantColor.RED),
            new Flower(1.2, "family", "name", PlantColor.RED),
            new Flower(1.3, "family", "name", PlantColor.RED),
            new Flower(1.4, "family", "name", PlantColor.RED),
            new Flower(1.4, "family", "name", PlantColor.BLUE),
            new Flower(1.4, "family", "name", PlantColor.YELLOW),
            new Flower(1.4, "family", "name", PlantColor.YELLOW)
    };

    @Test
    void getPlantsByColor() {
        for (Flower flower: flowers)
            plantBed.add(flower);

        SimpleList<Flower> redFlowers = plantBed.getPlantsByColor(PlantColor.RED);
        for (int i = 0; i < 4; i++)
            assertTrue(redFlowers.contains(flowers[i]));

        assertFalse(redFlowers.contains(flowers[4]));
    }

}