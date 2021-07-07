package com.collections;

import java.util.Objects;

public class Bicycle implements Comparable {
    private String color;
    private Integer speed;

    public Bicycle(String color, Integer speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Bicycle[" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return Objects.equals(color, bicycle.color) && Objects.equals(speed, bicycle.speed);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((speed == null) ? 0 : speed.hashCode());
        return result;
    }

    @Override
    // compareTo: expects return values:
    //  - negative if this instance is considered to be before the other
    //  - positive if this instance is considered to be after the other
    //  - zero if considered equal
    // This is what people call "natural ordering", ie. what does compareTo() return?
    public int compareTo(Object other) {
        Bicycle otherBicycle = (Bicycle) other;
        return this.color.compareTo(otherBicycle.color);
    }
}
