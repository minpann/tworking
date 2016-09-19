package com.tcl.tworking.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcl.tworking.biz.service.ExampleService;
import com.tcl.tworking.persistence.dao.ExampleDao;
import com.tcl.tworking.persistence.model.Example;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private ExampleDao exampleDao;
	
	@Override
	public List<Example> getAll() {
		// TODO Auto-generated method stub
		return exampleDao.getAll();
	}

}
