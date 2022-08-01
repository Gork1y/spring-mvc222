package web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/cars")
public interface CarApi {
    @GetMapping
    String index(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model);
}
