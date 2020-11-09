package com.bachkhoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bachkhoa.dao.INewDAO;
import com.bachkhoa.model.NewModel;
import com.bachkhoa.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;
	
	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}
}
