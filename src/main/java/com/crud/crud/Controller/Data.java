package com.crud.crud.Controller;
import com.crud.crud.Model.UserData;
import com.crud.crud.Service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Data {

@Autowired
private UserDataService userDataService;

    @GetMapping("/")
    public String viewData(Model model){
        model.addAttribute("dataList",userDataService.getAllUsers());
        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        UserData userData=new UserData();
        model.addAttribute("userData",userData);
        return "new_user";
    }


    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("userData") UserData userData){
        userDataService.saveUser(userData);
        return "redirect:/";
    }

    @GetMapping("/updateForm/{id}")
    public String UpdateForm(@PathVariable("id") int id,Model model){
        UserData userData=userDataService.getUserById(id);
        model.addAttribute("userData",userData);
        return "update";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
       this.userDataService.deleteUser(id);
        return "redirect:/";
    }
}
