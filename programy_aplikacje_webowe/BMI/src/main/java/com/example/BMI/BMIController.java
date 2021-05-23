package com.example.BMI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BMIController {

    @PostMapping("/calculated")
    public void bmi(Model model,
                      @RequestParam(name= "weight") float weight,
                      @RequestParam(name = "height") float height) {
        model.addAttribute("weight", weight);
        model.addAttribute("height", height);
        float bmi = Calc.bmi(weight, height);
        String nadwaga = "Nadwaga!";
        if(bmi<18.5){
            nadwaga = "Niedowaga!";
        }else if(bmi>18.5 && bmi < 24.9){
            nadwaga = "Twoje BMI jest w normie";
        }else if(bmi>25 && bmi<29.9){
            nadwaga = "Nadwaga!";
        }else if(bmi>30){
            nadwaga = "DUŻA OTYLOŚĆ!!!";
        }
        model.addAttribute("bmi", bmi);
        model.addAttribute("nadwaga", nadwaga);
        //return "calculated";
    }
}
