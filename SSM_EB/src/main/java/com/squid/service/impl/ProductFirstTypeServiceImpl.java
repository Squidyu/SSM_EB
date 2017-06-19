package com.squid.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squid.bean.Member;
import com.squid.bean.ProductFirstType;
import com.squid.dao.ProductFirstTypeMapper;
import com.squid.serivce.IMemberService;
import com.squid.serivce.IProductFirstTypeService;
/**
 * @author Squid
 *
 */
@Service
public class ProductFirstTypeServiceImpl implements IProductFirstTypeService {

	@Autowired
	private ProductFirstTypeMapper mapper;

	public List<ProductFirstType> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}
	

}
