package com.entity.model;

import com.entity.FangyidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 防疫登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public class FangyidengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
