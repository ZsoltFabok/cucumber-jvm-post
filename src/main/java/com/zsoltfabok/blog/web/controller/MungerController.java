package com.zsoltfabok.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zsoltfabok.blog.SimpleTextMunger;

@Controller
public class MungerController {

  @Autowired
  private SimpleTextMunger munger;

  @RequestMapping("/")
  public String show() {
    return "index";
  }

  @RequestMapping(value = "/munge", method=RequestMethod.POST)
  public String munge(@RequestParam("text") String text, Model model) {
    model.addAttribute("munged", munger.execute(text));
    model.addAttribute("original", text);
    return "index";
  }
}