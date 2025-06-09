package com.entity.model;

import com.entity.FangwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 房屋信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public class FangwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
