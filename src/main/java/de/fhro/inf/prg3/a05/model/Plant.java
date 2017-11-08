package de.fhro.inf.prg3.a05.model;

public abstract class Plant {
    private double height;
    private String family;
    private String name;

    public Plant(double height, String family, String name) {
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;
        if (this.getColor() != plant.getColor()) return false;
        if (Double.compare(plant.height, height) != 0) return false;
        if (family != null ? !family.equals(plant.family) : plant.family != null) return false;
        return name != null ? name.equals(plant.name) : plant.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
