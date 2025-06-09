package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhujiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhujiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhujiaofeiView;


/**
 * 业主缴费
 *
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface YezhujiaofeiService extends IService<YezhujiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhujiaofeiVO> selectListVO(Wrapper<YezhujiaofeiEntity> wrapper);
   	
   	YezhujiaofeiVO selectVO(@Param("ew") Wrapper<YezhujiaofeiEntity> wrapper);
   	
   	List<YezhujiaofeiView> selectListView(Wrapper<YezhujiaofeiEntity> wrapper);
   	
   	YezhujiaofeiView selectView(@Param("ew") Wrapper<YezhujiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhujiaofeiEntity> wrapper);
   	
}

