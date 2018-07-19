package WorkWithStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEditor {

    private static final String SENTENCE_REGEX = "[.|!|?]";
    private String inputString;

    Pattern pattern = Pattern.compile(SENTENCE_REGEX);
    String[] sentence = pattern.split(inputString);

    void textConvertation(String replacementString, int necessaryWordLength){

        final String WORDS_REGEX = "\\s+\\w"+"{"+necessaryWordLength +"}+\\s";
        Pattern wordPattern = Pattern.compile(WORDS_REGEX);
        String result = "";
        for(String words:sentence){
            Matcher m = wordPattern.matcher(words);
            if(m.find()){
                result = inputString.replaceAll(WORDS_REGEX, " " + replacementString + " ");
            }
        }
        System.out.println(result);
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
}
