package hystrix.amqp.service.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @HystrixCommand
    public void hystrixService() throws Exception {
    }
}
