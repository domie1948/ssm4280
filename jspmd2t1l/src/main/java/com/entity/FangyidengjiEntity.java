package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 防疫登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
@TableName("fangyidengji")
public class FangyidengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangyidengjiEntity() {
		
	}
	
	public FangyidengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 人员姓名
	 */
					
	private String renyuanxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 公寓住户
	 */
					
	private String gongyuzhuhu;
	
	/**
	 * 检测体温
	 */
					
	private String jiancetiwen;
	
	/**
	 * 外出史
	 */
					
	private String waichushi;
	
	/**
	 * 接触史
	 */
					
	private String jiechushi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：人员姓名
	 */
	public void setRenyuanxingming(String renyuanxingming) {
		this.renyuanxingming = renyuanxingming;
	}
	/**
	 * 获取：人员姓名
	 */
	public String getRenyuanxingming() {
		return renyuanxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：公寓住户
	 */
	public void setGongyuzhuhu(String gongyuzhuhu) {
		this.gongyuzhuhu = gongyuzhuhu;
	}
	/**
	 * 获取：公寓住户
	 */
	public String getGongyuzhuhu() {
		return gongyuzhuhu;
	}
	/**
	 * 设置：检测体温
	 */
	public void setJiancetiwen(String jiancetiwen) {
		this.jiancetiwen = jiancetiwen;
	}
	/**
	 * 获取：检测体温
	 */
	public String getJiancetiwen() {
		return jiancetiwen;
	}
	/**
	 * 设置：外出史
	 */
	public void setWaichushi(String waichushi) {
		this.waichushi = waichushi;
	}
	/**
	 * 获取：外出史
	 */
	public String getWaichushi() {
		return waichushi;
	}
	/**
	 * 设置：接触史
	 */
	public void setJiechushi(String jiechushi) {
		this.jiechushi = jiechushi;
	}
	/**
	 * 获取：接触史
	 */
	public String getJiechushi() {
		return jiechushi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
