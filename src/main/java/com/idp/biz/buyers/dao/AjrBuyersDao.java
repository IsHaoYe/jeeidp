package com.idp.biz.buyers.dao;

import org.apache.ibatis.annotations.Mapper;

import com.idp.common.base.BaseDao;
import com.idp.biz.buyers.entity.AjrBuyers;

/**
 * 客户留言管理dao接口
 * 
 * @author Taowd 2019-04-19
 *
 */
@Mapper
public interface AjrBuyersDao extends BaseDao<AjrBuyers, String> {
	
}