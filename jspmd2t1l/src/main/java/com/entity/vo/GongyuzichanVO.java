package com.entity.vo;

import com.entity.GongyuzichanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 公寓资产
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public class GongyuzichanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goururiqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
