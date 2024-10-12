package t_prueba_springcloud.prueba_service_logistica.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "prueba-service-ventas")

public interface ServiceDetalleClient {

    @GetMapping("/detalle")
    String consultarDetalle();

}
