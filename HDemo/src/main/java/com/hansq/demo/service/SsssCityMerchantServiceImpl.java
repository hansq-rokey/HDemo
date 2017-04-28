package com.hansq.demo.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hansq.demo.dao.SsssCityMerchantDao;
import com.hansq.demo.entity.SsssCityMerchant;

@Service
public class SsssCityMerchantServiceImpl implements SsssCityMerchantService {
	@Resource
	SsssCityMerchantDao ssssCityMerchantDao;

	@Override
	public List<SsssCityMerchant> getList(Integer pageNo) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNo, 10, true);
		return ssssCityMerchantDao.getList();
	}

	@Override
	public List<SsssCityMerchant> getListByPid(Long pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SsssCityMerchant getByLinkTel(String linkTel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(SsssCityMerchant city, HttpServletRequest req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SsssCityMerchant city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SsssCityMerchant get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SsssCityMerchant getByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SsssCityMerchant> getListByStatus(Integer pageNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SsssCityMerchant getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SsssCityMerchant> selectList(String keywords, Byte typeValue,
			Integer pageDao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCityMerchant(SsssCityMerchant cityMerchant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SsssCityMerchant> getCitys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SsssCityMerchant> queryMerchantByParentId(Long parentId,
			Integer pageNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
