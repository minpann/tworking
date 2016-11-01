package com.tcl.tworking.admin.controller;

import com.tcl.mie.vo.response.ListResponse;
import com.tcl.mie.vo.response.ResponseBuilder;
import com.tcl.tworking.biz.service.user.UserService;
import com.tcl.tworking.persistence.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

	private static Logger LOG = LoggerFactory.getLogger(UserController.class);

	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value = "/user/list")
	@ResponseBody
	public ListResponse<User> getAll(){
		List<User> userList = this.userService.getAll();
		LOG.info(userList.toString());
        return ResponseBuilder.listResponse(userList);
	}
	
}

