package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FankuihuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FankuihuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FankuihuifuView;


/**
 * 反馈回复
 *
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface FankuihuifuService extends IService<FankuihuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FankuihuifuVO> selectListVO(Wrapper<FankuihuifuEntity> wrapper);
   	
   	FankuihuifuVO selectVO(@Param("ew") Wrapper<FankuihuifuEntity> wrapper);
   	
   	List<FankuihuifuView> selectListView(Wrapper<FankuihuifuEntity> wrapper);
   	
   	FankuihuifuView selectView(@Param("ew") Wrapper<FankuihuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FankuihuifuEntity> wrapper);
   	
}

