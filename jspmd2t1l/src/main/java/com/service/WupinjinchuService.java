package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinjinchuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinjinchuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinjinchuView;


/**
 * 物品进出
 *
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface WupinjinchuService extends IService<WupinjinchuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinjinchuVO> selectListVO(Wrapper<WupinjinchuEntity> wrapper);
   	
   	WupinjinchuVO selectVO(@Param("ew") Wrapper<WupinjinchuEntity> wrapper);
   	
   	List<WupinjinchuView> selectListView(Wrapper<WupinjinchuEntity> wrapper);
   	
   	WupinjinchuView selectView(@Param("ew") Wrapper<WupinjinchuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinjinchuEntity> wrapper);
   	
}

