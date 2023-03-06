package pro.sky.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String helloWorld() {
        return "Приложение запущено";
    }

//    @GetMapping("/info")
//    public String info() {
//        return """
//                Имя ученика: Тимур Ахмедов.
//                Название проекта: myApp.
//                Дата создания проекта: 07.03.2023 00:12.
//                Описание: тест работы веб-приложения, дальше будет создано приложения для сайта рецептов!""";
//    }
}
