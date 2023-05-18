package main.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.services.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {
  
  @Autowired
  private CardService cardService;
  
  @CrossOrigin("*")
  @GetMapping("/hand")
  public Object[] hand() {
    return cardService.hand();
  }
}
