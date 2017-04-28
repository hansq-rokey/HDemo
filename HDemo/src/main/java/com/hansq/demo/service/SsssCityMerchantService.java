package com.hansq.demo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hansq.demo.entity.SsssCityMerchant;

public interface SsssCityMerchantService {
	
	List<SsssCityMerchant> getList(Integer pageNo);
	
	List<SsssCityMerchant> getListByPid(Long pid);

	SsssCityMerchant getByLinkTel(String linkTel);
	
	void insert(SsssCityMerchant city,HttpServletRequest req);
	
	void update(SsssCityMerchant city);
	
	SsssCityMerchant get(Long id);
	
	SsssCityMerchant getByUserId(Long userId);

	List<SsssCityMerchant> getListByStatus(Integer pageNo);

	SsssCityMerchant getById(Long id);

	List<SsssCityMerchant> selectList(String keywords,Byte typeValue,Integer pageDao);

	void updateCityMerchant(SsssCityMerchant cityMerchant);

	List<SsssCityMerchant> getCitys();
	
	List<SsssCityMerchant> queryMerchantByParentId(Long parentId,Integer pageNo);
}
