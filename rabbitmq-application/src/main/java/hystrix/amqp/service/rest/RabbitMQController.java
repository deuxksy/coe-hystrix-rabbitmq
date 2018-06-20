package hystrix.amqp.service.rest;


import hystrix.amqp.service.message.Sender;
import hystrix.amqp.service.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {

    @Autowired
    RabbitMQService rabbitMQService;

    @Autowired
    Sender sender;

    @GetMapping("/")
    public void hystrixTest() throws Exception{
        rabbitMQService.hystrixService();
    }

    @GetMapping("/message")
    public void messageTest() {
        sender.send("this is message");
    }
}
