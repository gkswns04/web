package bitcamp.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller27")
public class Controller27 {
  
  @RequestMapping
  public String m1(HttpServletResponse response) {
    Cookie cookie = new Cookie("lastVisited", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    cookie.setMaxAge(3600 * 24 * 5);
    response.addCookie(cookie);
    
    return "/Controller27.jsp";
  }
}

/*
# 요청 핸들러에서 직접 콘텐츠를 클라이언트로 출력하기
- ResponseEntity 객체에 담아서 리턴할 수 있다.
*/
