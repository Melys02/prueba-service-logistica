package t_prueba_springcloud.prueba_service_logistica.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import t_prueba_springcloud.prueba_service_logistica.remoteservice.ServiceDetalleClient;
import t_prueba_springcloud.prueba_service_logistica.remoteservice.ServiceOrdenClient;

@RequiredArgsConstructor
@RestController
public class LogisticaController {
    private final ServiceDetalleClient serviceDetalleClient;
    private final ServiceOrdenClient serviceOrdenClient;
    @GetMapping("/envios")
    public String consultarEnvios() {
        return "Obtener Respuesta Del servicio LOgistica - Envios";
    }
    @GetMapping("/inventario")
    public String consultarInventario() {
        return "Obtener Respuesta Del servicio LOgistica - Clientes";

    }
    @GetMapping("/envios-detalle")
    public String consultarDetalleEnvio() {
        return serviceDetalleClient.consultarDetalle();
    }

    @GetMapping("/envios-orden")
    public String consultarOrden() {
        return serviceOrdenClient.consultarOrden();
    }
}
