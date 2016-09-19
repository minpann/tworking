package com.tcl.tworking.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcl.mie.vo.response.ListResponse;
import com.tcl.mie.vo.response.ResponseBuilder;
import com.tcl.tworking.biz.service.ExampleService;
import com.tcl.tworking.persistence.model.Example;

@Controller
public class ExampleController {

	private static Logger LOG = LoggerFactory.getLogger(ExampleController.class);

	@Autowired
	private ExampleService exampleService;
	
	@RequestMapping(value = "/example/list")
	@ResponseBody
	public ListResponse<Example> getAll(){
		List<Example> exampleList = this.exampleService.getAll();
		LOG.info(exampleList.toString());
        return ResponseBuilder.listResponse(exampleList);
	}
	
}

