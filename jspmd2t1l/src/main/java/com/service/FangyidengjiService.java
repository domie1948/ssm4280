package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyidengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyidengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyidengjiView;


/**
 * 防疫登记
 *
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface FangyidengjiService extends IService<FangyidengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyidengjiVO> selectListVO(Wrapper<FangyidengjiEntity> wrapper);
   	
   	FangyidengjiVO selectVO(@Param("ew") Wrapper<FangyidengjiEntity> wrapper);
   	
   	List<FangyidengjiView> selectListView(Wrapper<FangyidengjiEntity> wrapper);
   	
   	FangyidengjiView selectView(@Param("ew") Wrapper<FangyidengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyidengjiEntity> wrapper);
   	
}

