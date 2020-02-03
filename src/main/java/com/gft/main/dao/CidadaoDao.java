package com.gft.main.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gft.main.entidade.Cidadao;

@Repository
@Transactional
public class CidadaoDao {
	
	 @Autowired
	    private EntityManager entityManager;

	public void salvaCidadao(Cidadao cidadao) {
		getSession().save(cidadao);
	}

	public List getCidadoes() {
		Criteria crit = getSession().createCriteria(Cidadao.class);
		List results = crit.list();
		System.out.println(results);
		return results;
	}

	private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
}
