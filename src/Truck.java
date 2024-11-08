public class Truck extends Transports implements Serviceable, EngineCheckable {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}