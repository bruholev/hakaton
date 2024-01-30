package bot.amazon.Controller;

import bot.amazon.Dao.JsonRequest;
import bot.amazon.Dao.TextMysteryGuess;
import bot.amazon.Service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.*;

@RestController
@Slf4j
public class ControllerMessage {

    ExecutorService service = Executors.newCachedThreadPool();
    @Autowired
    MessageService messageService;



    @PostMapping("/proxy")
    public String postRequest(@RequestParam (value = "stageUserOrderMystery",required = false) String stageUserOrderMystery,
                                   @RequestParam (value = "answer",required = false) String answer,
                                   @RequestParam (value = "status",required = false) String status) {
        try {
            Callable<String> call = () -> {
                log.info(" ControllerMessage postRequest body " + stageUserOrderMystery);
                String response = messageService.request( answer);
                log.info(" ControllerMessage shoot response " + response);
                return response;
            };
            return service.submit(call).get(10,TimeUnit.SECONDS);
        } catch (Exception e) {
            log.info("Ошибка ControllerMessage");
            return "index";
        }
    }
}
