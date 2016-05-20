package bitcamp.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller26")
public class Controller26 {
  @RequestMapping(value="/login", method=RequestMethod.GET)
  public String form(@CookieValue(required=false) String id, Model model) {
    if (id != null) {
      model.addAttribute("id", id);
    }
    return "/controller26/form.jsp";
  }
  
  @RequestMapping(value="/login", method=RequestMethod.POST)
  public String login(String id,
      String password,
      String idsave,
      HttpServletResponse response) {
    if (idsave != null) {
      Cookie cookie = new Cookie("id", id);
      cookie.setMaxAge(3600);
      response.addCookie(cookie);
    } else {
      Cookie cookie = new Cookie("id", "");
      cookie.setMaxAge(0);
      response.addCookie(cookie); 
    }
    return "/controller26/loginResult.jsp";
  }
}

/*
# 요청 핸들러에서 직접 콘텐츠를 클라이언트로 출력하기
- ResponseEntity 객체에 담아서 리턴할 수 있다.
*/
