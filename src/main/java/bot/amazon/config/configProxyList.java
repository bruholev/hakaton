package bot.amazon.config;

import bot.amazon.Dao.TextMysteryGuess;
import bot.amazon.Service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
@Service
public class configProxyList {
    @Bean
    public List<TextMysteryGuess> fillList() {

        MessageService.cluesList =  new CopyOnWriteArrayList<>();
        List<String> clues= new ArrayList<>();
        /*MessageService.cluesList.add(new TextMysteryGuess(111, "Жила была Красная шапочка   и однажды она пошла в FOREST(ЛЕС) к своей бабушке  и встретила серого Волка," +
                "Волк будет задавать Красной Шапочке загадки с ENGLISH(АНГЛИЙСКИМИ) словами , некоторые WORDS(СЛОВА) будут на английском LANGUAGE(ЯЗЫКЕ), отгадай их и SAVE(СПАСИ) Красную Шапочку", "",clues,true));
        */MessageService.cluesList.add(new TextMysteryGuess(111, "Привет Я RED(КРАСНАЯ) шапочка!\n" +
                "Моя MOTHER(МАМА) приготовила пирожки, сегодня нам нужно отнести их моей GRANDMOTHER(БАБУШКЕ)!\n" +
                "Ты должен мне помочь!\n" +
                "Она живёт в большом HOUSE(ДОМЕ) в лесу!\n" +
                "\n" +
                "Чтобы начать наше путешествие, отгадай эти загадки!"+
                "Слева мои помощники Енот Кролик и Попугай нажми на них если хочешь подсказку", "",clues,true));

        clues.clear();
        clues.add("что то со стрелками");
        clues.add("висят на стене");
        clues.add("тик так тик так");
            MessageService.cluesList.add(new TextMysteryGuess(221, "В объятьях её, тепло и ласка,\n" +
                    "Варенье варит, заботится, как фея в сказке.\n" +
                    "Будто SUN(СОЛНЦЕ) светит, в доме всегда май,\n" +
                    "Кто эта WONDERFULL(ЧУДЕСНАЯ), в мире неповторимая?", "мама",clues,true));
        clues.clear();

        clues.add("они звенят");
        clues.add("они круглые ");
        clues.add("где есть орел и решка?");
        MessageService.cluesList.add(new TextMysteryGuess(511, "Выбери HOUSE  на картинках", "1",clues,true));
        clues.clear();



        return MessageService.cluesList;

    }
}
