package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WailaidengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WailaidengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WailaidengjiView;


/**
 * 外来登记
 *
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface WailaidengjiService extends IService<WailaidengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WailaidengjiVO> selectListVO(Wrapper<WailaidengjiEntity> wrapper);
   	
   	WailaidengjiVO selectVO(@Param("ew") Wrapper<WailaidengjiEntity> wrapper);
   	
   	List<WailaidengjiView> selectListView(Wrapper<WailaidengjiEntity> wrapper);
   	
   	WailaidengjiView selectView(@Param("ew") Wrapper<WailaidengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WailaidengjiEntity> wrapper);
   	
}

