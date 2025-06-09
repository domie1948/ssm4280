package com.entity.vo;

import com.entity.TingcheweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 停车位
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public class TingcheweiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 入场时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruchangshijian;
		
	/**
	 * 出场时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuchangshijian;
		
	/**
	 * 停车费用
	 */
	
	private String tingchefeiyong;
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：入场时间
	 */
	 
	public void setRuchangshijian(Date ruchangshijian) {
		this.ruchangshijian = ruchangshijian;
	}
	
	/**
	 * 获取：入场时间
	 */
	public Date getRuchangshijian() {
		return ruchangshijian;
	}
				
	
	/**
	 * 设置：出场时间
	 */
	 
	public void setChuchangshijian(Date chuchangshijian) {
		this.chuchangshijian = chuchangshijian;
	}
	
	/**
	 * 获取：出场时间
	 */
	public Date getChuchangshijian() {
		return chuchangshijian;
	}
				
	
	/**
	 * 设置：停车费用
	 */
	 
	public void setTingchefeiyong(String tingchefeiyong) {
		this.tingchefeiyong = tingchefeiyong;
	}
	
	/**
	 * 获取：停车费用
	 */
	public String getTingchefeiyong() {
		return tingchefeiyong;
	}
			
}
