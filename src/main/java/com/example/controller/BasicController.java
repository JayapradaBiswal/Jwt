package com.example.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController
{

@RequestMapping({ "/hello" })

public String firstPage() {

return "Hello World";

}
}
