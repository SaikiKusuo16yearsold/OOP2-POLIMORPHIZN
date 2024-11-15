import Interfaces.Serviceable;
import Transports.Transports;


public class ServiceStation implements Serviceable {
    public void check(Transports transport) {
        service(transport);
    }
}