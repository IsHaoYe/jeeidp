package com.idp.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.idp.common.base.BaseDao;
import com.idp.system.entity.SysRole;

/**
 * 角色管理dao接口
 * 
 * @author King
 *
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRole, String> {

	/**
	 * 根据userid查询角色
	 * @param userId
	 * @return
	 */
	public List<SysRole> findByUserId(String userId);
}