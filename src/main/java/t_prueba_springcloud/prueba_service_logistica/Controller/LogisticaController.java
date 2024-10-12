package t_prueba_springcloud.prueba_service_logistica.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import t_prueba_springcloud.prueba_service_logistica.remoteservice.ServiceDetalleClient;
import t_prueba_springcloud.prueba_service_logistica.remoteservice.ServiceOrdenClient;

@RequiredArgsConstructor
@RestController
public class LogisticaController {
    @GetMapping("/envios")
    public String consultarEnvios() {
        return "Obtener Respuesta Del servicio LOgistica - Envios";
    }
    @GetMapping("/inventario")
    public String consultarInventario() {
        return "Obtener Respuesta Del servicio LOgistica - Clientes";

    }

}
