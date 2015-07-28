package vn.com.fpt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.fpt.entities.Item;
import vn.com.fpt.services.ItemService;

@Controller
public class ItemController {

	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public @ResponseBody List<Item> all() {
		List<Item> list = new ArrayList<Item>();
		Item i1 = new Item();
		Item i2 = new Item();
		i1.setItemName("brian");
		i1.setItemDesc("hey");
		i1.setItemInitPrice(null);
		i2.setItemName("diane");
		i2.setItemDesc("you");
		i2.setItemInitPrice(null);
		list.add(i1);
		list.add(i2);
		return list;
	}

	@RequestMapping(value = "/item", method = RequestMethod.POST)
	public @ResponseBody Item add(@RequestParam("itemName") String itemName, @RequestParam("itemDesc") String itemDesc,
			@RequestParam("itemInitPrice") String itemInitPrice) {

		Item item = new Item();
		item.setItemName(itemName);
		item.setItemDesc(itemDesc);
		item.setItemInitPrice(Double.parseDouble(itemInitPrice));
		itemService.persist(item);
		System.out.println(itemName);
		return item;
	}
}
