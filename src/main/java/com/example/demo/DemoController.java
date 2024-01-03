package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// URL에 따르 요청을 처리하는 메서드를 담아두는
// 클래스임을 나타낸다.
@Controller
public class DemoController {
    // DemoController는 HelloComponent를 사용한다.
    // Composition : 구성
    private HelloComponent component; //  = new HelloComponent(); 없으면 localhost:8080/home 들어가면 오류남

    public DemoController(HelloComponent component){ // 생성자
        this.component = component;
    }

    // @RequestMapping
    // 어떤 URL 요청에 대하여 실행되는 메서드임을
    // 나타낸다.
    @RequestMapping("home")
    public String home(){
        component.sayHello();
        return "home.html";
    }

    // /profile로 요청이 들어올때
    // profile.html을 응답하고 싶다.
    @RequestMapping("profile")
    public String profile(){
        return "profile.html";
    }

    // /hobbies로 요청이 들어오면
    // hobbies.html로 응답한다.
    @RequestMapping("hobbies")
    public String hobbies(){
        return "hobbies.html";
    }


}
