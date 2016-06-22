package com.mps.daoImp;

import org.hibernate.criterion.Restrictions;

import com.mps.daoBase.BaseDao;
import com.mps.model.Traveller;

import java.util.List;

public class TravellerDaoImp extends BaseDao<Traveller, Integer> {
	public TravellerDaoImp() {
		super(Traveller.class);
	}

	public Traveller getTravellerId(String idcard) {
		List<Traveller> travellers = super.findBy("id", false, Restrictions.sqlRestriction("idcard=" + idcard));
		if (travellers==null) {
			return null;
		}else{
			return travellers.get(0);
		}
		
	}
}
