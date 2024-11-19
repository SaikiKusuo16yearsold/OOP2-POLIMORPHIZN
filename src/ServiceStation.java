import Interfaces.Serviceable;
import Transports.Transports;


public class ServiceStation implements Serviceable {
    public void service(Transports transport) {
        transport.service(transport);
    }
}