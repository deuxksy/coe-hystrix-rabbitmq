package hystrix.amqp.service;

import hystrix.amqp.service.message.Processor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
@EnableBinding(Processor.class)
public class RabbitMQApplication {
	public static void main(String[] args) {
		SpringApplication.run(RabbitMQApplication.class, args);
	}
}
