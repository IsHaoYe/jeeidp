package com.idp.biz.buyers.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.idp.biz.buyers.dao.AjrBuyersDao;
import com.idp.biz.buyers.entity.AjrBuyers;
import com.idp.biz.buyers.service.AjrBuyersService;
import com.idp.common.model.PageModel;
import com.idp.common.util.ResourceUtil;

/**
 * 客户留言管理service实现类
 * 
 * @author Taowd 2019-04-19
 *
 */
@Service("ajrBuyersService")
public class AjrBuyersServiceImpl implements AjrBuyersService {

	@Autowired
	private AjrBuyersDao ajrBuyersDao;

	@Override
	public PageModel<AjrBuyers> findByPage(AjrBuyers ajrBuyers, PageModel<AjrBuyers> page) {

		PageHelper.offsetPage(page.getStart(), page.getLength());
		page.initData(ajrBuyersDao.findByPage(ajrBuyers));

		return page;
	}

	@Override
	public List<AjrBuyers> findBySearch(AjrBuyers ajrBuyers) {

		return ajrBuyersDao.find(ajrBuyers);
	}

	@Override
	public AjrBuyers getById(String id) {

		return ajrBuyersDao.getById(id);
	}

	@Override
	public void add(AjrBuyers ajrBuyers) {

		ajrBuyers.setId(ResourceUtil.getUUID());
		ajrBuyersDao.add(ajrBuyers);
	}

	@Override
	public void update(AjrBuyers ajrBuyers) {

		ajrBuyersDao.update(ajrBuyers);
	}

	@Override
	public void delete(String ids) {

		List<String> idList = Arrays.asList(ids.split(","));

		ajrBuyersDao.batchDelete(idList);
	}

}