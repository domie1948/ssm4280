package com.entity.vo;

import com.entity.AnbaozhibanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 安保值班
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public class AnbaozhibanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 负责区域
	 */
	
	private String fuzequyu;
		
	/**
	 * 负责时间
	 */
	
	private String fuzeshijian;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
				
	
	/**
	 * 设置：负责区域
	 */
	 
	public void setFuzequyu(String fuzequyu) {
		this.fuzequyu = fuzequyu;
	}
	
	/**
	 * 获取：负责区域
	 */
	public String getFuzequyu() {
		return fuzequyu;
	}
				
	
	/**
	 * 设置：负责时间
	 */
	 
	public void setFuzeshijian(String fuzeshijian) {
		this.fuzeshijian = fuzeshijian;
	}
	
	/**
	 * 获取：负责时间
	 */
	public String getFuzeshijian() {
		return fuzeshijian;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
			
}
