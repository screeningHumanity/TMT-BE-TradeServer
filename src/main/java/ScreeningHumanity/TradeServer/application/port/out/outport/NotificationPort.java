package ScreeningHumanity.TradeServer.application.port.out.outport;

import java.util.concurrent.CompletableFuture;
import org.springframework.kafka.support.SendResult;

public interface NotificationPort {

    CompletableFuture<SendResult<String, String>> send(String receiver, Object data);
}
