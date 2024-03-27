package com.coding_dojo.displaydate.controllers;

import org.springframework.stereotype.Controller;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	Date date = new Date();
	// class definition and imports here...
    @RequestMapping("/")
    public String index() {
    
    	// Your code here! Add values to the view model to be rendered
    	
    
        return "index.jsp";
    }
    
    @RequestMapping("/date")
    public String date(Model model) {
        
    	// Your code here! Add values to the view model to be rendered
        DateFormat outputFormatter = new SimpleDateFormat("EEEEEEEEEEEE, MMM dd yyyy");
        String output = outputFormatter.format(date);
        model.addAttribute("date", output);

    
        return "date.jsp";
    }
    
    @RequestMapping("/time")
    public String time(Model model) {
        
    	// Your code here! Add values to the view model to be rendered
    	DateFormat outputFormatter = new SimpleDateFormat("h:mm a");
        String output = outputFormatter.format(date);
        model.addAttribute("time", output);
    
        return "time.jsp";
    }
    //...
    

}