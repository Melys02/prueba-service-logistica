package t_prueba_springcloud.prueba_service_logistica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class PruebaServiceLogisticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaServiceLogisticaApplication.class, args);
	}

}
