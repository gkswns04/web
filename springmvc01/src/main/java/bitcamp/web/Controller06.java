package bitcamp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller06")
public class Controller06 {
  
  @RequestMapping(value="/test", method=RequestMethod.GET)
  public String hello() {
    return "/hello.jsp";
  }
  
  @RequestMapping(value="/test", method=RequestMethod.POST)
  public String hello2() {
    return "/hello2.jsp";
  }
}


/*
# 요청 핸들러의 리턴 값
- 리턴 타입이 String인 경우,
  리턴 값은 뷰 컴포넌트의 URL이다.
*/
