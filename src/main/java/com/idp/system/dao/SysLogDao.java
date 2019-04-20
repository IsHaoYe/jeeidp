package com.idp.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.idp.common.base.BaseDao;
import com.idp.system.entity.SysLog;

/**
 * 系统日志dao接口
 * 
 * @author King 2018-06-27
 *
 */
@Mapper
public interface SysLogDao extends BaseDao<SysLog, String> {

}