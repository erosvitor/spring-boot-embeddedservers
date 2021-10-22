package com.ctseducare.embeddedservers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmbeddedServerController {

  @GetMapping("/")
  String status() {
    return "I am up!";
  }
  
}
