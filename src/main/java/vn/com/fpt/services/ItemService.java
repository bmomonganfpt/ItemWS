package vn.com.fpt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.fpt.entities.Item;
import vn.com.fpt.repository.ItemRepository;

@Service
@Transactional
public class ItemService {

	@Autowired
	ItemRepository itemRepository;

	public Item persist(Item item) {
		itemRepository.persist(item);
		return item;
	}
}
