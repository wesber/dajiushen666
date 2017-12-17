package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.DetailDao;
import com.example.demo.dao.PermissionDao;
import com.example.demo.dao.RoleDao;
import com.example.demo.dao.UserDao;
import com.example.demo.domain.Detail;
import com.example.demo.domain.Permission;
import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import com.example.demo.domain.vo.Check;
import com.example.demo.domain.vo.CheckVo;
import com.example.demo.domain.vo.UserInfo;
import com.example.demo.domain.vo.UserInfoVo;

@Controller
public class AccountController {
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private PermissionDao permissionDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private DetailDao detailDao;
	@RequestMapping("/toMainPage")
	public String say(Model model) {
		return "main";
	}
	@RequestMapping("/toAdminPage")
	public String show() {
		return "admin";
	}
	@RequestMapping("/toCheckPage")
	public String show2() {
		return "check";
	}
	@RequestMapping("userInfo")
	@ResponseBody
	public UserInfoVo getUserInfo() {
		UserInfoVo vo = new UserInfoVo();
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		List<User> userList = userDao.findAll();
		for(User u:userList) {
			UserInfo userInfo = new UserInfo();
			List<Role> roleList = roleDao.findByUsers_Name(u.getName());
			userInfo.setId(u.getId());
			userInfo.setUserName(u.getName());
			userInfo.setCompany(u.getCompany().getName());
			userInfo.setRole(roleList.get(0).getName());
			list.add(userInfo);
		}
		vo.setCode(0);
		vo.setCount(userList.size());
		vo.setMsg("wesber");
		vo.setData(list);
		System.out.println("================");
		return vo;
	}
	@RequestMapping("checkInfo")
	@ResponseBody
	public CheckVo getCheckInfo() {
		CheckVo checkVo = new CheckVo();
		ArrayList<Check> list = new ArrayList<Check>();
		Check check = new Check();
		Detail detail = detailDao.findById(1);
		check.setId(1);
//		check.setRadioUrl(detail.getRadioUrl());
		String url= "<audio src=\"audio/example.wav\" controls=\"controls\" controlsList=\"nodownload\"></audio>";
		check.setRadioUrl(url);
		list.add(check);
		checkVo.setCode(0);
		checkVo.setCount(100);
		checkVo.setMsg("wesber");
		checkVo.setData(list);
		return checkVo;
	}
}
