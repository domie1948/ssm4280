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
 * 公寓资产
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
@TableName("gongyuzichan")
public class GongyuzichanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongyuzichanEntity() {
		
	}
	
	public GongyuzichanEntity(T t) {
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
	 * 资产编号
	 */
					
	private String zichanbianhao;
	
	/**
	 * 资产名称
	 */
					
	private String zichanmingcheng;
	
	/**
	 * 资产价值
	 */
					
	private Integer zichanjiazhi;
	
	/**
	 * 资产类型
	 */
					
	private String zichanleixing;
	
	/**
	 * 规格型号
	 */
					
	private String guigexinghao;
	
	/**
	 * 购入日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date goururiqi;
	
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
	 * 设置：资产编号
	 */
	public void setZichanbianhao(String zichanbianhao) {
		this.zichanbianhao = zichanbianhao;
	}
	/**
	 * 获取：资产编号
	 */
	public String getZichanbianhao() {
		return zichanbianhao;
	}
	/**
	 * 设置：资产名称
	 */
	public void setZichanmingcheng(String zichanmingcheng) {
		this.zichanmingcheng = zichanmingcheng;
	}
	/**
	 * 获取：资产名称
	 */
	public String getZichanmingcheng() {
		return zichanmingcheng;
	}
	/**
	 * 设置：资产价值
	 */
	public void setZichanjiazhi(Integer zichanjiazhi) {
		this.zichanjiazhi = zichanjiazhi;
	}
	/**
	 * 获取：资产价值
	 */
	public Integer getZichanjiazhi() {
		return zichanjiazhi;
	}
	/**
	 * 设置：资产类型
	 */
	public void setZichanleixing(String zichanleixing) {
		this.zichanleixing = zichanleixing;
	}
	/**
	 * 获取：资产类型
	 */
	public String getZichanleixing() {
		return zichanleixing;
	}
	/**
	 * 设置：规格型号
	 */
	public void setGuigexinghao(String guigexinghao) {
		this.guigexinghao = guigexinghao;
	}
	/**
	 * 获取：规格型号
	 */
	public String getGuigexinghao() {
		return guigexinghao;
	}
	/**
	 * 设置：购入日期
	 */
	public void setGoururiqi(Date goururiqi) {
		this.goururiqi = goururiqi;
	}
	/**
	 * 获取：购入日期
	 */
	public Date getGoururiqi() {
		return goururiqi;
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
