package com.hansq.demo.dao;

import java.util.List;
import java.util.Map;

import com.hansq.demo.entity.SsssCityMerchant;

public interface SsssCityMerchantDao {
	
	int deleteByPrimaryKey(Long id);

    int insert(SsssCityMerchant record);

    int insertSelective(SsssCityMerchant record);

    SsssCityMerchant selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SsssCityMerchant record);

    int updateByPrimaryKey(SsssCityMerchant record);
    
    List<SsssCityMerchant> getListByPid(Long pid);
    
    SsssCityMerchant getByLinkTel(String linkTel);
    
    List<SsssCityMerchant> getList();
    
    SsssCityMerchant getMaxIdEntityByPid(Long pid);
    
    SsssCityMerchant getByUserId(Long userId);
    
    SsssCityMerchant getByCode(String code);

	List<SsssCityMerchant> getListByStatus();

	SsssCityMerchant getById(Long id);

	List<SsssCityMerchant> selectList(Map<String, Object> map);
	
	List<SsssCityMerchant> queryMerchantByParentId(Long parentId);
}