package WorkWithStrings;

public class Main {

    public static void main(String[] args) {
        String testText = "Hi, I'm Tiffany. I am from California and I am here " +
                "to meet new people and visit some places.";
        //**  VARIANT A  TASK 19    **//

        StringEditor stringEditor = new StringEditor();
        stringEditor.setInputString(testText);
        stringEditor.textConvertation("бе-бе-бе-бе", 3);

        //** VARIANT B   TASK 16    **//
        WordConverter wordConverter = new WordConverter();
        wordConverter.setInputString(testText);
        wordConverter.convertation();

        //**  VARIANT C   TASK 8     **//


    }

}
