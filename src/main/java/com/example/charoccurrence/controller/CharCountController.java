package com.example.charoccurrence.controller;

import com.example.charoccurrence.util.StringProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharCountController {

    @GetMapping("/test/{s}")
    public String getSortedDistinctByValueAsStringCharOccurrences(@PathVariable(name = "s") final String s) {
        try {
            return StringProcessor.getSortedDistinctByValueAsStringCharOccurrences(s);
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
    }
}
