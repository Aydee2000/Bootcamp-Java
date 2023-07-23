package javabootcamp.Codigo_Morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/transform-into-morse-code/{text}")
    public String transformIntoMorse(@PathVariable String text){


         String transformedCode = "";
         for (int i = 0; i < text.length(); i++){
             String letters = "" + text.charAt(i);

             transformedCode = convertLettersToMorseCode(transformedCode, letters);
         }
         return transformedCode;
    }

    private static String convertLettersToMorseCode(String transformedCode, String letters) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " "};
        String[] codeMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};

        for (int q = 0; q< alphabet.length; q++){
            String texts = alphabet[q];
            if (texts.equalsIgnoreCase(letters)){
                String morseCodeCharacters = codeMorse[q];
                transformedCode += "   " + morseCodeCharacters;
            }
        }
        return transformedCode;
    }

}
