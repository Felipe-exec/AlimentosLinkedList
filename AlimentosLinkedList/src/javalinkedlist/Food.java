package javalinkedlist;
//import java.lang.Comparable;

public class Food implements Comparable<Food> {

    private String name;
    private float fat;
    private float energeticValue;
    private int nutrition;

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public int getNutrition() {
        return nutrition;
    }

    public void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }

    public float getEnergeticValue() {
        return energeticValue;
    }

    public void setEnergeticValue(float energeticValue) {
        this.energeticValue = energeticValue;
    }

    public float getFat() {
        return this.fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    @Override
    public int compareTo(Food Food2) {
        return this.getName().compareTo(Food2.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Food alimentos = (Food) o;

        return this.name != null ? (alimentos.name).equals(this.name) : alimentos.name == null;
    }

    @Override
    public String toString() {
        return getName() + ": " + getFat() + " - " + getNutrition() + " - " + getEnergeticValue();
    }// fim toString

}
