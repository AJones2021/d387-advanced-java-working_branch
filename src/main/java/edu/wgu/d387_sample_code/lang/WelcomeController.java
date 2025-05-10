package edu.wgu.d387_sample_code.lang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Autowired
    private DisplayMessage displayMessage;

    //////////
    public WelcomeController(DisplayMessage displayMessage){
        this.displayMessage = displayMessage;;
    }

    @GetMapping("/Enwelcome")
   // public String getMessageEn (Locale locale){
    public String getMessageEn ( ){
    //locale = Locale.US;
        String welcomeMessage = displayMessage.getMessage(Locale.US);
        return welcomeMessage;
    }


    @GetMapping("/Frwelcome")
    public String getMessageFr (){

      //  locale = Locale.CANADA_FRENCH;
        String welcomeMessage = displayMessage.getMessage(Locale.CANADA_FRENCH);
        return welcomeMessage;
    }
}
