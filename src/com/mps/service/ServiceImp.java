package com.mps.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mps.daoImp.OrdersDaoImp;
import com.mps.daoImp.TravellerDaoImp;
import com.mps.iservice.Service;
import com.mps.model.Orders;
import com.mps.model.Ticket;
import com.mps.model.Traveller;
import com.mps.util.PostSplite;

import cn.com.WebXml.ServiceFacade;

public class ServiceImp implements Service {
	public ServiceFacade webService;
	private OrdersDaoImp ordersDaoImp;
	private TravellerDaoImp travellerDaoImp;

	public TravellerDaoImp getTravellerDaoImp() {
		return travellerDaoImp;
	}
	public void setTravellerDaoImp(TravellerDaoImp travellerDaoImp) {
		this.travellerDaoImp = travellerDaoImp;
	}
	public ServiceFacade getWebService() {
		return webService;
	}
	public OrdersDaoImp getOrdersDaoImp() {
		return ordersDaoImp;
	}


	public void setOrdersDaoImp(OrdersDaoImp ordersDaoImp) {
		this.ordersDaoImp = ordersDaoImp;
	}
	
	public void setWebService(ServiceFacade webService) {
		this.webService = webService;
	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "shihu";
	}

	@Override
	public String getAirLines(String json) {
		// TODO Auto-generated method stub
		Map<String, String> ma = PostSplite.postchange(json);
		String start = ma.get("start");
		String end  = ma.get("end");
		String date = ma.get("date");
		
		String str = webService.getAirLines(start, end, date);
		str = str.replaceAll("\\[", "");
		str = str.replaceAll("\\]", "");
		str = "["+str+"]";
	
		return str;
	}
	@Override
	public List<Ticket> printTicket(String idcard) {
		Traveller traveller=travellerDaoImp.getTravellerId(idcard);
		List<Orders> orders=ordersDaoImp.getTravellerOrders(traveller.getId().toString());
		List<Ticket> tickets=new ArrayList<Ticket>();
		Ticket ticket=null;
		if (orders!=null) {
			for(Orders order:orders){
				ticket=new Ticket();
				ticket.setName(traveller.getName());
				ticket.setIdcard(traveller.getIdcard());
				ticket.setFlight(order.getFlight());
				ticket.setStartPoint(order.getStartpoint());
				ticket.setEndPoint(order.getEndpoint());
				tickets.add(ticket);
			}
		}
		System.out.println(tickets.toString());
		return tickets;
	}	

}
