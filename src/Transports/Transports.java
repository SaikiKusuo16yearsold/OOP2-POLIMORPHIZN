package Transports;

import Interfaces.Serviceable;


public abstract class Transports implements Serviceable {
    private String modelName;
    private int wheelsCount;

    public Transports(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void service(Transports transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}