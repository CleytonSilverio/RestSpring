package com.gft.main.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gft.main.entidade.Cidadao;

@Service
@Repository
@Transactional
public class CidadaoDao{
	
	@Autowired
	private SessionFactory factory;

	public void salvaCidadao(Cidadao cidadao) {
		getSession().save(cidadao);
	}

	public List<Cidadao> getCidadoes() {
		return getSession().createCriteria(Cidadao.class).list();
	}

	private Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}
		return session;
	}

}
