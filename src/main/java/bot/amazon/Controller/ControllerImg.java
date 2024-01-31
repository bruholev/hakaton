package bot.amazon.Controller;

import bot.amazon.Dao.TextMysteryGuess;
import bot.amazon.Service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
@Slf4j
public class ControllerImg {

    @GetMapping("/")
    public String epizod(Model model ){
         TextMysteryGuess result= MessageService.cluesList.stream().filter(e-> e.getStageUserOrderMystery()==111).findFirst().orElse(new TextMysteryGuess());
        model.addAttribute("description", result.getMystery());

        return "epizod";    }

    @GetMapping("/epizod2")
    public String epizod2(Model model){
        TextMysteryGuess result= MessageService.cluesList.stream().filter(e-> e.getStageUserOrderMystery()==221).findFirst().orElse(new TextMysteryGuess());
        model.addAttribute("wolf", result.getMystery());

        return "epizod2";    }

    @GetMapping("/epizod3")
    public String epizod3(@RequestParam(value = "answer",required = false) String answer,Model model){

        TextMysteryGuess result= MessageService.cluesList.stream().filter(e-> e.getStageUserOrderMystery()==221).findFirst().orElse(new TextMysteryGuess());
        String  response =answer.toLowerCase().equals( result.getGuess())?"epizod3":"error";
        model.addAttribute("wolf",answer.toLowerCase().equals( result.getGuess())?"Правильно это МАМА!":"Неправильный ответ!");
        return response;    }
    @GetMapping("/epizod4")
    public String epizod4(Model model){
        model.addAttribute("redhat", "Привет бабушка!");

        return "epizod4";    }
    @GetMapping("/epizod5")
    public String epizod5(Model model){
        TextMysteryGuess result= MessageService.cluesList.stream().filter(e-> e.getStageUserOrderMystery()==511).findFirst().orElse(new TextMysteryGuess());
        model.addAttribute("grandma", result.getMystery());
        return "epizod5";    }

    @GetMapping("/epizod6")
    public String epizod6(@RequestParam(value = "answer",required = false) String answer,Model model){

        TextMysteryGuess result= MessageService.cluesList.stream().filter(e-> e.getStageUserOrderMystery()==511).findFirst().orElse(new TextMysteryGuess());
        String  response =answer.toLowerCase().equals( result.getGuess())?"epizod6":"errorgrma";
        model.addAttribute("grandma",answer.toLowerCase().equals( result.getGuess())?"Правильно!":"Неправильный ответ!");
        return response;    }

    @GetMapping("/epizod7")
    public String epizod7(Model model){
        model.addAttribute("description", "Спасибо за внимание!!");

        return "epizod7";    }

}
