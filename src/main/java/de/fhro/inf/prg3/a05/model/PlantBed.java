package de.fhro.inf.prg3.a05.model;

import de.fhro.inf.prg3.a05.collections.SimpleFilter;
import de.fhro.inf.prg3.a05.collections.SimpleList;

public class PlantBed<T extends Plant> {
    private SimpleList<T> plants;

    public void add(T plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return plants.filter(t -> t.getColor() == color);
    }
}
