package Interfaces;

public interface Serviceable {
    String getModelName();

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}