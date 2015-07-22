package vn.com.fpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.fpt.entities.Account;

@Controller
public class ItemController {

	@RequestMapping("/all")
	public @ResponseBody Account all() {
		Account a1 = new Account();
		a1.setId(1L);
		a1.setEmail("email@email.com");
		return a1;
	}
}
