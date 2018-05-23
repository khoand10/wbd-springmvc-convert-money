package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home/")
public class HelloController {
    @RequestMapping("")
    public String loadIndex(){
        return "index";
    }

    @RequestMapping(value = "convert",method = RequestMethod.GET)
    @ResponseBody
    public String convertMoney(
            @RequestParam("keyword")int moyney
    ){
        return "result "+moyney*21+"000 VNĐ";
    }
}
