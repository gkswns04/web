package bitcamp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller09")
public class Controller09 {
  
  @RequestMapping
  public String m1(
      @RequestParam("name") String name,
      @RequestParam("tel") String tel,
      @RequestParam("age") int age) {
    System.out.println("m1()~~~~~~~~");
    System.out.printf("name = %s\n", name);
    System.out.printf("tel = %s\n", tel);
    System.out.printf("age = %d\n", age);
    
    return "/hello.jsp";
  }
 }


/*
# 파라미터 값 받기
- 요청 핸들러의 파라미터를 선언할 때 @RequestParam 애노테이션을 붙인다
- 문법
  @RequestParam("파라미터명") String 변수명
  
*/
