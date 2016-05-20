package bitcamp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import bitcamp.vo.Member;

@Controller
@RequestMapping("/controller32")
@SessionAttributes("userInfo")
public class Controller32 {
  @RequestMapping(value="/page1", method=RequestMethod.GET)
  public String page1(@ModelAttribute("userInfo") Member member) {
    if (member.getId() == null) {
      return "redirect:../controller31/login.do";
    }
    return "/controller32/page.jsp";
  }
  
  @RequestMapping(value="/page2", method=RequestMethod.GET)
  public String page2(HttpSession session) {
    Member member = (Member)session.getAttribute("userInfo");
    
    if (member == null) {
      return "redirect:../controller31/login.do";
    }
    return "/controller32/page.jsp";
  }
  
  @RequestMapping(value="/page3", method=RequestMethod.GET)
  public String page3(@SessionAttribute(value="userInfo", required=false) Member member) {
    if (member == null) {
      return "redirect:../controller31/login.do";
    }
    return "/controller32/page.jsp";
  }

}

/*
# 요청 핸들러에서 직접 콘텐츠를 클라이언트로 출력하기
- ResponseEntity 객체에 담아서 리턴할 수 있다.
*/
