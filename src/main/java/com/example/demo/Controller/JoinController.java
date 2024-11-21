package com.example.demo.Controller;

import Dto.JoinDto;
import com.example.demo.Service.JoinService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @GetMapping("/join")
    public String joinP(){

        return "join";
    }

    @PostMapping("/joinProc")
    public String joinProcess(JoinDto joinDto){
        System.out.println(joinDto.getUsername());
        joinService.joinProcess(joinDto);
        return "redirect:/login";
    }


}
