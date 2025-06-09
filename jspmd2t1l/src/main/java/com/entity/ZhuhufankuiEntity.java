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
 * 住户反馈
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
@TableName("zhuhufankui")
public class ZhuhufankuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuhufankuiEntity() {
		
	}
	
	public ZhuhufankuiEntity(T t) {
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
	 * 反馈编号
	 */
					
	private String fankuibianhao;
	
	/**
	 * 住户账号
	 */
					
	private String zhuhuzhanghao;
	
	/**
	 * 住户姓名
	 */
					
	private String zhuhuxingming;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 附件
	 */
					
	private String fujian;
	
	/**
	 * 反馈原因
	 */
					
	private String fankuiyuanyin;
	
	/**
	 * 反馈时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fankuishijian;
	
	/**
	 * 反馈类型
	 */
					
	private String fankuileixing;
	
	
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
	 * 设置：反馈编号
	 */
	public void setFankuibianhao(String fankuibianhao) {
		this.fankuibianhao = fankuibianhao;
	}
	/**
	 * 获取：反馈编号
	 */
	public String getFankuibianhao() {
		return fankuibianhao;
	}
	/**
	 * 设置：住户账号
	 */
	public void setZhuhuzhanghao(String zhuhuzhanghao) {
		this.zhuhuzhanghao = zhuhuzhanghao;
	}
	/**
	 * 获取：住户账号
	 */
	public String getZhuhuzhanghao() {
		return zhuhuzhanghao;
	}
	/**
	 * 设置：住户姓名
	 */
	public void setZhuhuxingming(String zhuhuxingming) {
		this.zhuhuxingming = zhuhuxingming;
	}
	/**
	 * 获取：住户姓名
	 */
	public String getZhuhuxingming() {
		return zhuhuxingming;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：附件
	 */
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
	}
	/**
	 * 设置：反馈原因
	 */
	public void setFankuiyuanyin(String fankuiyuanyin) {
		this.fankuiyuanyin = fankuiyuanyin;
	}
	/**
	 * 获取：反馈原因
	 */
	public String getFankuiyuanyin() {
		return fankuiyuanyin;
	}
	/**
	 * 设置：反馈时间
	 */
	public void setFankuishijian(Date fankuishijian) {
		this.fankuishijian = fankuishijian;
	}
	/**
	 * 获取：反馈时间
	 */
	public Date getFankuishijian() {
		return fankuishijian;
	}
	/**
	 * 设置：反馈类型
	 */
	public void setFankuileixing(String fankuileixing) {
		this.fankuileixing = fankuileixing;
	}
	/**
	 * 获取：反馈类型
	 */
	public String getFankuileixing() {
		return fankuileixing;
	}

}
