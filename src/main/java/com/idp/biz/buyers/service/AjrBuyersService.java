package com.idp.biz.buyers.service;

import java.util.List;

import com.idp.common.model.PageModel;
import com.idp.biz.buyers.entity.AjrBuyers;

/**
 * 客户留言管理service接口
 * 
 * @author Taowd 2019-04-19
 *
 */
public interface AjrBuyersService{
	
	/**
	 * 分页查询
	 * Taowd 2019-04-19
	 * @param ajrBuyers
	 * @param page
	 * @return
	 */
	public PageModel<AjrBuyers> findByPage(AjrBuyers ajrBuyers,PageModel<AjrBuyers> page);
	
	/**
	 * 条件查询
	 * Taowd 2019-04-19
	 * @param ajrBuyers
	 * @return
	 */
	public List<AjrBuyers> findBySearch(AjrBuyers ajrBuyers);
	
	/**
	 * 通过PK查询
	 * Taowd 2019-04-19
	 * @param id
	 * @return
	 */
	public AjrBuyers getById(String id);
	
	/**
	 * 新增
	 * Taowd 2019-04-19
	 * @param ajrBuyers
	 */
	public void add(AjrBuyers ajrBuyers);

	/**
	 * 修改
	 * Taowd 2019-04-19
	 * @param ajrBuyers
	 */
	public void update(AjrBuyers ajrBuyers);
	
	/**
	 * 删除
	 * Taowd 2019-04-19
	 * @param ids
	 */
	public void delete(String ids);
}
