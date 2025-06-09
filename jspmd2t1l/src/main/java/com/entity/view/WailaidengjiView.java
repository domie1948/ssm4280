package com.entity.view;

import com.entity.WailaidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外来登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
@TableName("wailaidengji")
public class WailaidengjiView  extends WailaidengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WailaidengjiView(){
	}
 
 	public WailaidengjiView(WailaidengjiEntity wailaidengjiEntity){
 	try {
			BeanUtils.copyProperties(this, wailaidengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
