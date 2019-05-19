package com.zcs.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zcs.entity.Fenye;
import com.zcs.service.ProService;

@Controller
public class ProContorller {
	@Autowired
	private Fenye fenye;
	@Autowired
	private ProService proService;
	@RequestMapping(value="/selectPro",method=RequestMethod.POST)
	@ResponseBody
	public Fenye selectPro(Integer page,Integer rows){
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		fenye = proService.selectPro(fenye);
		return fenye;
		
	}
}
