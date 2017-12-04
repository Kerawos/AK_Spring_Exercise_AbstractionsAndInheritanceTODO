package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.Inheritance;
import pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.UserInputModel;

/**
 * Manage web page controls, requests
 */
@Controller
public class IndexController {

    @Autowired
    private Inheritance inheritance;

    /**
     * Get request from index page
     * @param model given user input model to store user inputs
     * @return user inputs after hitting confirmation button
     */
    @GetMapping("/") public String getGOTInheritance(Model model){
        model.addAttribute("list", inheritance.getHeroesNames());
        model.addAttribute("userInputModel", new UserInputModel());
        return "gotInheritance";
    }

    /**
     * Inform user about corrected answers
     * @param userInputModel stored users inputs as model class
     * @param model used here to display message as string to user
     * @return exercise result
     */
    @PostMapping("/") public String postGOTInheritance(@ModelAttribute UserInputModel userInputModel, Model model){
        model.addAttribute("list", inheritance.getHeroesNames());
        model.addAttribute("message", inheritance.isDescendant(userInputModel.getAncestor(), userInputModel.getDescendant()));
        if (inheritance.bonusTest()){
            model.addAttribute("bonus", "Congratulations, you done exercise correct! you can go to the page '../bonus' ");
        }
        return "gotInheritance";
    }

    /**
     * Description page
     * @return page with image with description of exercise
     */
    @GetMapping("/desc") public String getGOTDesc(){
        return "gotDesc";
    }

    /**
     * Bonus page will be available after resolving exercise by user
     * @return bonus page with some extra info
     */
    @GetMapping("/bonus") public String getGOTThink(){
        return "gotThink";
    }


}
