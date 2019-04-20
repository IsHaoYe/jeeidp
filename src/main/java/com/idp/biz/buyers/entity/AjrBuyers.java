package com.idp.biz.buyers.entity;

import java.io.Serializable;
import java.util.Date;

import com.idp.common.base.BaseEntity;

/**
 * 客户留言管理实体类
 * 
 * @author Taowd 2019-04-19
 *
 */
public class AjrBuyers extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**唯一标识*/
	private String id;

	/**产品ID*/
	private String pid;

	/**预购数量*/
	private Integer count;

	/**主题*/
	private String title;

	/**ip*/
	private String ip;

	/**客户姓名*/
	private String custName;

	/**内容*/
	private String content;

	/**客户电子邮箱*/
	private String custEmail;

	/**客户公司名称*/
	private String custCorporate;

	/**客户电话*/
	private String custTelephone;

	/**预留字段1*/
	private String temp1;

	/**预留字段2*/
	private String temp2;

	/**创建时间*/
	private Date updateDate;

	/**创建时间开始*/
	private Date updateDateStart;

	/**创建时间结束*/
	private Date updateDateEnd;

	/**
	 *方法: 取得String
	 *@return: String  唯一标识
	 */
	public String getId() {

		return this.id;
	}

	/**
	 *方法: 设置String
	 *@param: String  唯一标识
	 */
	public void setId(String id) {

		this.id = id;
	}

	/**
	 *方法: 取得String
	 *@return: String  产品ID
	 */
	public String getPid() {

		return this.pid;
	}

	/**
	 *方法: 设置String
	 *@param: String  产品ID
	 */
	public void setPid(String pid) {

		this.pid = pid;
	}

	/**
	 *方法: 取得Integer
	 *@return: Integer  预购数量
	 */
	public Integer getCount() {

		return this.count;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  预购数量
	 */
	public void setCount(Integer count) {

		this.count = count;
	}

	/**
	 *方法: 取得String
	 *@return: String  主题
	 */
	public String getTitle() {

		return this.title;
	}

	/**
	 *方法: 设置String
	 *@param: String  主题
	 */
	public void setTitle(String title) {

		this.title = title;
	}

	/**
	 *方法: 取得String
	 *@return: String  ip
	 */
	public String getIp() {

		return this.ip;
	}

	/**
	 *方法: 设置String
	 *@param: String  ip
	 */
	public void setIp(String ip) {

		this.ip = ip;
	}

	/**
	 *方法: 取得String
	 *@return: String  客户姓名
	 */
	public String getCustName() {

		return this.custName;
	}

	/**
	 *方法: 设置String
	 *@param: String  客户姓名
	 */
	public void setCustName(String custName) {

		this.custName = custName;
	}

	/**
	 *方法: 取得String
	 *@return: String  内容
	 */
	public String getContent() {

		return this.content;
	}

	/**
	 *方法: 设置String
	 *@param: String  内容
	 */
	public void setContent(String content) {

		this.content = content;
	}

	/**
	 *方法: 取得String
	 *@return: String  客户电子邮箱
	 */
	public String getCustEmail() {

		return this.custEmail;
	}

	/**
	 *方法: 设置String
	 *@param: String  客户电子邮箱
	 */
	public void setCustEmail(String custEmail) {

		this.custEmail = custEmail;
	}

	/**
	 *方法: 取得String
	 *@return: String  客户公司名称
	 */
	public String getCustCorporate() {

		return this.custCorporate;
	}

	/**
	 *方法: 设置String
	 *@param: String  客户公司名称
	 */
	public void setCustCorporate(String custCorporate) {

		this.custCorporate = custCorporate;
	}

	/**
	 *方法: 取得String
	 *@return: String  客户电话
	 */
	public String getCustTelephone() {

		return this.custTelephone;
	}

	/**
	 *方法: 设置String
	 *@param: String  客户电话
	 */
	public void setCustTelephone(String custTelephone) {

		this.custTelephone = custTelephone;
	}

	/**
	 *方法: 取得String
	 *@return: String  预留字段1
	 */
	public String getTemp1() {

		return this.temp1;
	}

	/**
	 *方法: 设置String
	 *@param: String  预留字段1
	 */
	public void setTemp1(String temp1) {

		this.temp1 = temp1;
	}

	/**
	 *方法: 取得String
	 *@return: String  预留字段2
	 */
	public String getTemp2() {

		return this.temp2;
	}

	/**
	 *方法: 设置String
	 *@param: String  预留字段2
	 */
	public void setTemp2(String temp2) {

		this.temp2 = temp2;
	}

	/**
	 *方法: 取得Date
	 *@return: Date  创建时间
	 */
	public Date getUpdateDate() {

		return this.updateDate;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  创建时间
	 */
	public void setUpdateDate(Date updateDate) {

		this.updateDate = updateDate;
	}

	/**
	 *方法: 取得Date
	 *@return: Date  创建时间开始
	 */
	public Date getUpdateDateStart() {

		return this.updateDateStart;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  创建时间开始
	 */
	public void setUpdateDateStart(Date updateDateStart) {

		this.updateDateStart = updateDateStart;
	}

	/**
	 *方法: 取得Date
	 *@return: Date  创建时间结束
	 */
	public Date getUpdateDateEnd() {

		return this.updateDateEnd;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  创建时间结束
	 */
	public void setUpdateDateEnd(Date updateDateEnd) {

		this.updateDateEnd = updateDateEnd;
	}

	@Override
	public String toString() {

		return "客户留言管理：[" + "唯一标识=" + id + ", 产品ID=" + pid + ", 预购数量=" + count + ", 主题=" + title
				+ ", ip=" + ip + ", 客户姓名=" + custName + ", 内容=" + content + ", 客户电子邮箱=" + custEmail
				+ ", 客户公司名称=" + custCorporate + ", 客户电话=" + custTelephone + ", 预留字段1=" + temp1
				+ ", 预留字段2=" + temp2 + ", 创建时间=" + updateDate + ",创建时间(开始)=" + updateDateStart
				+ ",创建时间(结束)=" + updateDateEnd + "]";
	}
}
