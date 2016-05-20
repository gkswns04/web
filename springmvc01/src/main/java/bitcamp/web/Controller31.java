package bitcamp.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import bitcamp.vo.Member;

@Controller
@RequestMapping("/controller31")
@SessionAttributes("userInfo")
public class Controller31 {
  @RequestMapping(value="/login", method=RequestMethod.GET)
  public String form(@CookieValue(required=false) String id, Model model) {
    if (id != null) {
      model.addAttribute("id", id);
      model.addAttribute("checked", "checked");
    }
    return "/controller31/form.jsp";
  }
  
  @RequestMapping(value="/login", method=RequestMethod.POST)
  public String login(
      String id,
      String password,
      String idsave,
      HttpServletResponse response,
      Model model) {
    if (idsave != null) {
      Cookie cookie = new Cookie("id", id);
      cookie.setMaxAge(3600);
      response.addCookie(cookie);
    } else {
      Cookie cookie = new Cookie("id", "");
      cookie.setMaxAge(0);
      response.addCookie(cookie); 
    }
    if (id.equals("admin") && password.equals("1111")) {
      Member member = new Member();
      member.setId(id);
      member.setPassword(password);
      member.setName("홍길동");
      
      model.addAttribute("userInfo", member);
      return "redirect:../controller32/page3.do";
    } else {
      return "redirect:login.do";
    }
  }
}

/*
# 요청 핸들러에서 직접 콘텐츠를 클라이언트로 출력하기
- ResponseEntity 객체에 담아서 리턴할 수 있다.
*/
