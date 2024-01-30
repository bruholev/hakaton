package bot.amazon.Service;

import bot.amazon.Dao.JsonRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class WebClientService {
    private static final String API_URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_KEY = "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"; // Замените на ваш ключ API


    public WebClient createWebClient( ) {
        WebClient webClient = WebClient.builder()
                .baseUrl(API_URL)
                .defaultHeader("Authorization", "Bearer " + API_KEY)
                .defaultHeader("Content-Type", "application/json")
                .build();

        return webClient;
    }

    public  String sendGetRequest(String url, JsonRequest proxyServer) {
        try {

        String response = createWebClient( ).get().uri(url).retrieve().bodyToMono(String.class).block();
            log.info("WebClientService sendGetRequest response "+response);

        return response;}
    catch (Exception e){e.printStackTrace();}
        return "response";
    }

    public  String sendPostRequest(  String body ) {

        String response = createWebClient( ).post( ).bodyValue(body)
                .retrieve()
                .bodyToMono(String.class).block();
        log.info("WebClientService postGetRequest response "+response);
        return response;
    }

}
