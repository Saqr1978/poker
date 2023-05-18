package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
  
  @GetMapping("")
  public String errorMessage() {
    return "No endpoint sollicitated";
  }

}
