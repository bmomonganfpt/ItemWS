package vn.com.fpt.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.com.fpt.entities.Item;

@Repository
public class ItemRepository {

	@Autowired
	SessionFactory sessionFactory;

	public Item persist(Item item) {
		sessionFactory.getCurrentSession().save(item);
		return item;
	}
}
