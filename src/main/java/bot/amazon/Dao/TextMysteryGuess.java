package bot.amazon.Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TextMysteryGuess {

    private Integer stageUserOrderMystery;
    private String mystery;
    private String guess;
    private List<String> clues;
    private Boolean status;

}
