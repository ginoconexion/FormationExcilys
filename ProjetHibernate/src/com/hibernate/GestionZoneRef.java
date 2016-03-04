package com.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.mapping.object.genere.ZoneRef;

public class GestionZoneRef {
	
	public static void main(String[] args){
		ZoneRef zoneRef = new ZoneRef();
		zoneRef.setPrix(3.5f);
		zoneRef.setZoneDebut(6);
		zoneRef.setZoneFin(4);
		GestionZoneRef gestion = new GestionZoneRef();
		gestion.ajouterZoneRef(zoneRef);
	}
	
	public void ajouterZoneRef(ZoneRef p){
		Session session = HibernateUtil.currentSession();
		Transaction tx  = session.beginTransaction();
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}
