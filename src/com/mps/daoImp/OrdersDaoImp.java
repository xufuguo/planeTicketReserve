package com.mps.daoImp;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import com.mps.daoBase.BaseDao;
import com.mps.model.Orders;
import com.mps.model.Traveller;

public class OrdersDaoImp extends BaseDao<Orders, Integer> {
	public OrdersDaoImp(){
		super(Orders.class);
	}
	public List<Orders> getTravellerOrders(String travellerid) {
		List<Orders> orders = super.findBy("id", false, Restrictions.sqlRestriction("travellerid=" + travellerid));
		if (orders==null) {
			return null;
		}else{
			return orders;
		}
	}
}
