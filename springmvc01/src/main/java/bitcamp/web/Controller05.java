package bitcamp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller05")
public class Controller05 {
  
  @RequestMapping(method=RequestMethod.GET)
  public String hello() {
    return "/hello.jsp";
  }
  
  @RequestMapping(method=RequestMethod.POST)
  public String hello2() {
    return "/hello2.jsp";
  }
}


/*
# GET/POST 구분
- @RequestMapping()의 method 프로퍼티로 구분한다.
- 항상 요청 URL은 클래스에 선언된 @RequestMapping과
  메서드에 선언된 @RequestMapping의 값을 합쳐서 지정한다.
*/
