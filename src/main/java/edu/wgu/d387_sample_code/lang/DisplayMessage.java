package edu.wgu.d387_sample_code.lang;

import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.ResourceBundle;

@Component
public class DisplayMessage {

    public String getMessage(Locale locale){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("translation", locale);
        return resourceBundle.getString("welcome");
    }
}
