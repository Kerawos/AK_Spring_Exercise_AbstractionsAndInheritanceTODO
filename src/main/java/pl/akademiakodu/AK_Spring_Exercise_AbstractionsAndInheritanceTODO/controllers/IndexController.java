package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.Inheritance;
import pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.UserInputModel;


@Controller
public class IndexController {

    private Inheritance inheritance = new Inheritance();


    @GetMapping("/") public String getGOTInheritance(Model model){
        model.addAttribute("list", inheritance.getHeroesNames());
        model.addAttribute("userInputModel", new UserInputModel());
        return "gotInheritance";
    }

    @PostMapping("/") public String postGOTInheritance(@ModelAttribute UserInputModel userInputModel, Model model){
        model.addAttribute("list", inheritance.getHeroesNames());
        model.addAttribute("message", inheritance.isDescendant(userInputModel.getAncestor(), userInputModel.getDescendant()));
        if (inheritance.bonusTest()){
            model.addAttribute("bonus", "Congratulations, you done exercise correct! you can go to the page '../bonus' ");
        }
        return "gotInheritance";
    }

    @GetMapping("/desc") public String getGOTDesc(){
        return "gotDesc";
    }

    @GetMapping("/bonus") public String getGOTThink(){
        return "gotThink";
    }


}
