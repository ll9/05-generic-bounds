package de.fhro.inf.prg3.a05.model;

import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;

import java.util.HashMap;
import java.util.Map;

public class PlantBedUtility {

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> plantBed) {
        Map<PlantColor, SimpleList<T>> map = new HashMap<>();
        for (PlantColor color: PlantColor.values()) {
            map.put(color, plantBed.getPlantsByColor(color));
        }

        return map;
    }
}
