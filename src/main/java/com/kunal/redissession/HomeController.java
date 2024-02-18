package com.kunal.redissession;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @PostMapping("/clicked")
    private Map<String, Integer> clicked(){
        var map = new HashMap<String,Integer>();
                map.put("kunal",1);
                map.put("hello",2);
        return map;
    }
    private final String HOME_VIEW_COUNT = "HOME_VIEW_COUNT";
    @GetMapping("/")
    public String my( HttpSession session){
        incrementcount(session,HOME_VIEW_COUNT);
        return "hello ";}

    @GetMapping("/admin")
    public String admin(){

        return "hello admin";}

    @GetMapping("/seller")
    public String seller(){

        return "hello seller";}

    @GetMapping("/count")
    private String count(HttpSession session){
        return HOME_VIEW_COUNT + " = "+session.getAttribute(HOME_VIEW_COUNT);
    }

    private void incrementcount(HttpSession session, String homeViewCount) {
        int count = session.getAttribute(homeViewCount)==null?0:(Integer)session.getAttribute(homeViewCount);
        session.setAttribute(HOME_VIEW_COUNT,count+=1);

    }
}
