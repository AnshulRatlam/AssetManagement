package Admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import AssetBean.AdminBean;
import AssetMangeDao.Dao;




@Controller
public class MainController {
	
	
	@RequestMapping("/")
	public String hello()
	{
	return "index";	
	
	}
	

	@RequestMapping("/check")
public ModelAndView adminCheck(@RequestParam String name,@RequestParam String password)
{
			
		Dao m = new Dao();
		
		
		
	ModelAndView mv=null;
	   int x= m.loginAdmin(name,password);
	   if(x==1)
	   {
		mv=new ModelAndView("index","msg"," Success,Welcome At Admin Home") ;  
	   }
	   else {
		   mv=new ModelAndView("index","msg","Fail..Try Again") ;
	   }
	   return mv;
}

	}
