package com.entity.vo;

import com.entity.ZhuhufankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 住户反馈
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public class ZhuhufankuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fankuishijian;
		
	/**
	 * 反馈类型
	 */
	
	private String fankuileixing;
				
	
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
