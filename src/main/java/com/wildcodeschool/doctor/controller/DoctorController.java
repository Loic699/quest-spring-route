package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    Doctor doctor(@PathVariable int number) {
if(number == 13){
	 return new Doctor(13, "Jodie  Whittaker");
} else if (number > 0 && number <= 12){
	 throw new ResponseStatusException(HttpStatus.SEE_OTHER, "code 303 ");
}else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "IMPOSSIBLE de recuperer l'incarnation" + number);
        
    }
 
    
}
