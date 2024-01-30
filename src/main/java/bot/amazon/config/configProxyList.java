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
        MessageService.cluesList.add(new TextMysteryGuess(111, "Жила была Красная шапочка   и однажды она пошла в FOREST(ЛЕС) к своей бабушке  и встретила серого Волка," +
                "Волк будет задавать Красной Шапочке загадки с ENGLISH(АНГЛИЙСКИМИ) словами , некоторые WORDS(СЛОВА) будут на английском LANGUAGE(ЯЗЫКЕ), отгадай их и SAVE(СПАСИ) Красную Шапочку", "",clues,true));
        clues.clear();
        clues.add("что то со стрелками");
        clues.add("висят на стене");
        clues.add("тик так тик так");
            MessageService.cluesList.add(new TextMysteryGuess(221, "WHAT(ЧТО) всегда двигается но не сдвигается со своего PLACE(МЕСТА)", "часы",clues,true));
        clues.clear();

        clues.add("они звенят");
        clues.add("они круглые ");
        clues.add("где есть орел и решка?");
        MessageService.cluesList.add(new TextMysteryGuess(511, "Что означает THIS(ЭТИ) цифры 1,3,5,10?", "монета",clues,true));
        clues.clear();

        clues.add("какие состояния воды бывают?");
        clues.add("что с водой будет зимой?");
        clues.add("что более мокрое вода или лед?");
        MessageService.cluesList.add(new TextMysteryGuess(313, "На одном берегу стоит охотник на другом его собака как ей перейти к охотнику не замочив ног, и не пользуясь никаким транспортом?",
                "по льду",clues,true));
        clues.clear();

        clues.add("куда записан Гарри Потер?");
        clues.add("что такое учебник?");
        clues.add("они лежат в библиотеке");
        MessageService.cluesList.add(new TextMysteryGuess(414, "Оно не живое но дает рост Не дышит но оживляет Не говорит но может сообщать что это?",
                "книга",clues,true));
        clues.clear();

        clues.add("что он делает со временем?");
        clues.add("В какое время он может перенести?");
        clues.add("Время с телевизором бежит не заметно?");
        MessageService.cluesList.add(new TextMysteryGuess(115, "посмотри на телевизор через призму времени получится что?" , "поедатель времени,машина времени",clues,true));


        return MessageService.cluesList;

    }
}
