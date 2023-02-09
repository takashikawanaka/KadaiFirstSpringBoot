package com.techacademy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable String val) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date = LocalDate.parse(val, formatter);
        String week = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return week;
    }

    @GetMapping("plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        Integer res = 0;
        res = val1 + val2;
        return res.toString();
    }

    @GetMapping("minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        Integer res = 0;
        res = val1 - val2;
        return res.toString();
    }

    @GetMapping("times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        Integer res = 0;
        res = val1 * val2;
        return res.toString();
    }

    @GetMapping("divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        Integer res = 0;
        res = val1 / val2;
        return res.toString();
    }

}
