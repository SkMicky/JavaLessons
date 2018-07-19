package WorkWithStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordConverter {

    private static final String REGEX = "\\p{P}|[0-9]";

    private String inputString;

    private Pattern pattern = Pattern.compile("\\s");
    private String[] words = pattern.split(inputString);
    private Pattern pattern1 = Pattern.compile(REGEX);

    void convertation(){
        for(String word:words){
            Matcher m = pattern1.matcher(word);
            char[] chars = word.toCharArray();
            if(m.find()){
                chars[0] = Character.toLowerCase(chars[0]);
            }else{
                chars[0] = Character.toUpperCase(chars[0]);
            }
            System.out.print(new String(chars) + " ");
        }
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    /*public static void main(String[] args) {
        WordConverter wordConverter = new WordConverter();
        wordConverter.setInputString(testText);
        wordConverter.convertation();
    }*/
}