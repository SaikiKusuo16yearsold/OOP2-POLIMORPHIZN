package Interfaces;

public interface Serviceable {

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}