package bitcamp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller08")
public class Controller08 {
  
  @RequestMapping(headers="bit1")
  public String hello() {
    System.out.println("hello()");
    return "/hello.jsp";
  }
  
  @RequestMapping(headers={"bit2"})
  public String hello2() {
    System.out.println("hello2()");
    return "/hello.jsp";
  }
  
  @RequestMapping(headers={"bit3","bit4"})
  public String hello3() {
    System.out.println("hello3()");
    return "/hello.jsp";
  }
}


/*
# 파라미터 이름으로 요청을 구분하기
- params 프로퍼티에 파라미터 이름을 지정한다.
- 이름이 한 개일 때는 그냥 일반 문자가
*/
