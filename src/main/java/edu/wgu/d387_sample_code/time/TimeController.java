package edu.wgu.d387_sample_code.time;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TimeController {
    private TimeConvert timeConvert;

    @GetMapping("/Zone")
    public String getConversionTime(){
        String timeString = "Join us for an online live presentation held" +
                " at the London Hotel at " + TimeConvert.getConversion();
        return timeString;
    }
}
