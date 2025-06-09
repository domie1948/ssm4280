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
 * 房屋信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
@TableName("fangwuxinxi")
public class FangwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangwuxinxiEntity() {
		
	}
	
	public FangwuxinxiEntity(T t) {
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
	 * 楼号
	 */
					
	private String louhao;
	
	/**
	 * 房屋号
	 */
					
	private String fangwuhao;
	
	/**
	 * 房屋性质
	 */
					
	private String fangwuxingzhi;
	
	/**
	 * 是否出售
	 */
					
	private String shifouchushou;
	
	/**
	 * 是否可租
	 */
					
	private String shifoukezu;
	
	/**
	 * 面积
	 */
					
	private String mianji;
	
	/**
	 * 装修程度
	 */
					
	private String zhuangxiuchengdu;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 管理人员
	 */
					
	private String guanlirenyuan;
	
	
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
	 * 设置：楼号
	 */
	public void setLouhao(String louhao) {
		this.louhao = louhao;
	}
	/**
	 * 获取：楼号
	 */
	public String getLouhao() {
		return louhao;
	}
	/**
	 * 设置：房屋号
	 */
	public void setFangwuhao(String fangwuhao) {
		this.fangwuhao = fangwuhao;
	}
	/**
	 * 获取：房屋号
	 */
	public String getFangwuhao() {
		return fangwuhao;
	}
	/**
	 * 设置：房屋性质
	 */
	public void setFangwuxingzhi(String fangwuxingzhi) {
		this.fangwuxingzhi = fangwuxingzhi;
	}
	/**
	 * 获取：房屋性质
	 */
	public String getFangwuxingzhi() {
		return fangwuxingzhi;
	}
	/**
	 * 设置：是否出售
	 */
	public void setShifouchushou(String shifouchushou) {
		this.shifouchushou = shifouchushou;
	}
	/**
	 * 获取：是否出售
	 */
	public String getShifouchushou() {
		return shifouchushou;
	}
	/**
	 * 设置：是否可租
	 */
	public void setShifoukezu(String shifoukezu) {
		this.shifoukezu = shifoukezu;
	}
	/**
	 * 获取：是否可租
	 */
	public String getShifoukezu() {
		return shifoukezu;
	}
	/**
	 * 设置：面积
	 */
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
	/**
	 * 设置：装修程度
	 */
	public void setZhuangxiuchengdu(String zhuangxiuchengdu) {
		this.zhuangxiuchengdu = zhuangxiuchengdu;
	}
	/**
	 * 获取：装修程度
	 */
	public String getZhuangxiuchengdu() {
		return zhuangxiuchengdu;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：管理人员
	 */
	public void setGuanlirenyuan(String guanlirenyuan) {
		this.guanlirenyuan = guanlirenyuan;
	}
	/**
	 * 获取：管理人员
	 */
	public String getGuanlirenyuan() {
		return guanlirenyuan;
	}

}
