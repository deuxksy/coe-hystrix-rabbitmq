package hystrix.amqp.service.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Processor {
    @Output("messageOutput")
    MessageChannel anOutPut();
}
