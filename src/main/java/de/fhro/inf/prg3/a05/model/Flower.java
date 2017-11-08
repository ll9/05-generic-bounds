package de.fhro.inf.prg3.a05.model;

public class Flower extends Plant {
    private PlantColor color;

    public Flower(double height, String family, String name, PlantColor color) throws IllegalArgumentException {
        super(height, family, name);
        this.color = color;

        if (color == PlantColor.GREEN)
            throw new IllegalArgumentException("A flower may be any color but green");
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }
}
