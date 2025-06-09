package com.entity.view;

import com.entity.FankuihuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 反馈回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
@TableName("fankuihuifu")
public class FankuihuifuView  extends FankuihuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FankuihuifuView(){
	}
 
 	public FankuihuifuView(FankuihuifuEntity fankuihuifuEntity){
 	try {
			BeanUtils.copyProperties(this, fankuihuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
