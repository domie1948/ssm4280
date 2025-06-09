package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnbaozhibanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnbaozhibanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnbaozhibanView;


/**
 * 安保值班
 *
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface AnbaozhibanService extends IService<AnbaozhibanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnbaozhibanVO> selectListVO(Wrapper<AnbaozhibanEntity> wrapper);
   	
   	AnbaozhibanVO selectVO(@Param("ew") Wrapper<AnbaozhibanEntity> wrapper);
   	
   	List<AnbaozhibanView> selectListView(Wrapper<AnbaozhibanEntity> wrapper);
   	
   	AnbaozhibanView selectView(@Param("ew") Wrapper<AnbaozhibanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnbaozhibanEntity> wrapper);
   	
}

