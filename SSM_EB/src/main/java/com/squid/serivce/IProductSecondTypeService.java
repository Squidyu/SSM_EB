package com.squid.serivce;

import java.util.List;

import com.squid.bean.ProductSecondType;

public interface IProductSecondTypeService {
	List<ProductSecondType> findByFId(long id);
}
