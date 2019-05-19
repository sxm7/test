package com.zcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcs.dao.ProductMapper;
import com.zcs.entity.Fenye;
import com.zcs.entity.Product;
@Service
public class ProServiceimpl implements ProService{
@Autowired
private ProductMapper productMapper;
	public Fenye selectPro(Fenye fenye) {
		// TODO Auto-generated method stub
		List<Product> pro = productMapper.selectPro(fenye);
		Integer proCount = productMapper.selectProCount(fenye);
		fenye.setRows(pro);
		fenye.setTotal(proCount);
		return fenye;
	}

}
