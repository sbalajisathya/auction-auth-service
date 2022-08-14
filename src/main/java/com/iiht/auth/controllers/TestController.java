/*
package com.iiht.auth.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

  @GetMapping("/seller")
  @PreAuthorize("hasRole('SELLER')")
  public String moderatorAccess() {
    return "Seller Board.";
  }

  @GetMapping("/buyer")
  @PreAuthorize("hasRole('BUYER')")
  public String adminAccess() {
    return "Buyer Board.";
  }
}
*/
