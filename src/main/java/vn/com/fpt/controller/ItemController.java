package vn.com.fpt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.fpt.entities.Account;
import vn.com.fpt.entities.Item;
import vn.com.fpt.services.item.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public @ResponseBody List<Account> all() {
		List<Account> list = new ArrayList<Account>();
		Account a1 = new Account();
		Account a2 = new Account();
		a1.setId(1L);
		a1.setEmail("dummy1@email.com");
		a2.setId(2L);
		a2.setEmail("dummy2@email.com");
		list.add(a1);
		list.add(a2);
		return list;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestParam("itemName") String itemName, @RequestParam("itemDesc") String itemDesc, @RequestParam("itemInitPrice") String itemInitPrice) {
		Item item = new Item();
		item.setItemName(itemName);
		item.setItemDesc(itemDesc);
		item.setItemInitPrice(Double.parseDouble(itemInitPrice));
		if (itemService.persist(item)) {
			return "redirect:http://localhost:7662/FrontEnd/Item";
		}
		return "redirect:http://localhost:7662/FrontEnd/failed";		
	}
}
