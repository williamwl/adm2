package com.webank.cc.view;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)  
	public String welcome(){
		return "index";
	}
	@RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"}) 
	@ResponseBody
	public JsonResult test(){
		JsonResult jr = new JsonResult();
		jr.setMessage("去你妈的！");
		return jr;
	}
}
