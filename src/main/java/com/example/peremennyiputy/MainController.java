package com.example.peremennyiputy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {

    @RequestMapping("/home/{color}/{username}") //Чтобы определить переменную пути нужно присвоить ей имя и вставить это имя в путь, заключив в фигурные скобки
    public String home(@PathVariable String color, @PathVariable String username,  Model page){ //Параметр, который должен принимать переменную пути, нужно отметить аннотацией @PathVariable. Имя параметра должно совпадать с именем переменной пути
        page.addAttribute("username", username);
        page.addAttribute("color", color); //Значение из пути полуает тот параметр метода действия,
                                                       // который сопровождяется аннотацией @PathVariable, а его имя совпадает с именем переменной пути.
        return "home.html";
    }
}

//  Для отправки переменной пути в действие контроллера достаточно добавить
//  в путь имя этой переменной, заключенное в фигурные скобки (как показано в листинге 8.4). Затем с помощью аннотации @PathVariable мы отметим
//  параметр действия контроллера, в котором будет передаваться значение
//  переменной пути. В листинге 8.4 показано, как нужно изменить действие
//  контроллера, чтобы получить значение цвета из переменной пути (остальной
//  код примера не отличается от проекта sq-ch8-ex2, рассмотренного в подразделе 8.1.1).
