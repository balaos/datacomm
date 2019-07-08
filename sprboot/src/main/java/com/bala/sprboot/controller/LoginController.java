package com.bala.sprboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.bala.sprboot.model.Credential;
import com.bala.sprboot.model.Job;
import com.bala.sprboot.model.LoginStatus;
import com.bala.sprboot.model.Response;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	
	  
	@GetMapping("/login")
	public String login(@RequestParam("un") String un, @RequestParam("pwd") String pwd) {
		System.out.println("LoginController.login() : " + un + " , " + pwd);
		return "mainpage.html";
	}
	
	@GetMapping("/mainpage")
	public String getMainPage() {
		System.out.println("LoginController.getMainPage()");
		return "mainpage.html";
	}
	
		
	/*@RequestMapping(value = "/myapplogin", method = RequestMethod.POST, produces = { MediaType.TEXT_HTML_VALUE, MediaType.APPLICATION_JSON_VALUE}, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String doLogin(@RequestBody Credential credential) {
		System.out.println("LoginController.doLogin() : " + credential);
		return "mainpage.html";
	}*/
	
	/*@RequestMapping(value = "/myapplogin", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelAndView doLogin(@RequestBody Credential credential) {
		System.out.println("LoginController.doLogin() : " + credential);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("mainpage.html");
		return mv;
	}*/
	
	@RequestMapping(value = "/myapplogin", method = RequestMethod.POST, produces = { MediaType.TEXT_HTML_VALUE, MediaType.APPLICATION_JSON_VALUE}, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public LoginStatus doLogin(@RequestBody Credential credential) {
		System.out.println("LoginController.doLogin() : " + credential);
		return new LoginStatus("0", "Login Success");
	}
	
	@GetMapping("/loadjobs")
	@ResponseBody
	public List<Job> login() {
		List<Job> jList = new ArrayList<>();
		//jList.add(new Job("123","I", "FIOS"));
		//jList.add(new Job("124","M", "POTS"));
		//jList.add(new Job("222","I", "FIOS"));
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<List<Job>> jobList =
		        rt.exchange("http://localhost:8081/restsvc/jobs",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Job>>() {
		            });

		jList = jobList.getBody();
		System.out.println("LoginController.login() : "+jList);
		//Response<List<Job>> res = new Response<List<Job>>("0", "success", "loadjobs", jList);
		
		return jList;
	}
	 
}
