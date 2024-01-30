        package bot.amazon.Service;

        import bot.amazon.Dao.JsonRequest;
        import bot.amazon.Dao.TextMysteryGuess;
        import lombok.extern.slf4j.Slf4j;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.stereotype.Service;

        import java.util.concurrent.CopyOnWriteArrayList;


        @Slf4j
        @Service
        public class MessageService {
        public   static CopyOnWriteArrayList<TextMysteryGuess> cluesList;
                String requestBody = "{\n" +
                        "  \"model\": \"gpt-3.5-turbo-16k-0613\",\n" +
                        "  \"messages\": [\n" +
                        "    {\n" +
                        "      \"role\": \"user\",\n" +
                        "      \"content\": \"\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"role\": \"assistant\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"role\": \"user\",\n" +
                        "      \"content\": \"напиши загадку о красной шапочке\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"temperature\": 1,\n" +
                        "  \"max_tokens\": 256,\n" +
                        "  \"top_p\": 1,\n" +
                        "  \"frequency_penalty\": 0,\n" +
                        "  \"presence_penalty\": 0\n" +
                        "}";
        @Autowired
        WebClientService webClientService;

        @Value("${proxy.timeout}")
        private int proxyTimeout;


        public String request(  String body ) {
        try {String response ;
        response="new JsonRequest()";//webClientService.sendPostRequest( requestBody);
            log.info("response "+response);
        return response;

        } catch (Exception e) {
        log.info("Ошибка в MessageService ");
        e.printStackTrace();  return "new JsonRequest()";        }

        }
        }
