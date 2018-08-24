package WorkWithStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {

    private int necessaryStrLength = 15;

    private final String SUBSTRING_REGEX = "(?<=\\G.{"+ necessaryStrLength +"})";

    private String testText = "Hi, I'm Tiffany. I am from California and I am here " +
            "to meet new people and visit some places.";

    String formattedText = String.format("%-" + necessaryStrLength + "s%n", testText);

    Pattern pattern = Pattern.compile(SUBSTRING_REGEX);
    String[] subStr = pattern.split(formattedText);

    public String getReNewStr(){
        String respacedText = "";
        for(String word:subStr){
            Pattern spaceReplacer = Pattern.compile("$(?<=\\s)");
            Matcher replacer = spaceReplacer.matcher(word);
            if(replacer.find()){
                respacedText = word.replace(" ", "\\n");
            }
        }
        return respacedText;
    }

    public void setNecessaryStrLength(int necessaryStrLength) {
        this.necessaryStrLength = necessaryStrLength;
    }

    public static void main(String[] args) {
        TextFormatter tx = new TextFormatter();
        System.out.println(tx.getReNewStr());
    }
}
