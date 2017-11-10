package de.fhro.inf.prg3.a05.model;

import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;

public class PlantBedUtility {

    public <R extends Plant, T extends Plant> void splitBedByColor(PlantBed<T> bed) {
        SimpleList<R> colorList = new SimpleListImpl<R>();
        for (PlantColor color: PlantColor.values()) {
            SimpleList<R> colorEntry = bed.getPlantsByColor(color);
        }
    }
}
