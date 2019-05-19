package com.zcs.dao;

import java.util.List;

import com.zcs.entity.Fenye;
import com.zcs.entity.Product;

public interface ProductMapper {
		Integer selectProCount(Fenye fenye);
		List<Product> selectPro(Fenye fenye);
		Integer delPro(Integer pid);
		Integer updatePro(Product product);
		Integer insertPro(Product product);
		
}
