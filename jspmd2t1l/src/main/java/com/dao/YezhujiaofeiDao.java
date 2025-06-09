package com.dao;

import com.entity.YezhujiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhujiaofeiVO;
import com.entity.view.YezhujiaofeiView;


/**
 * 业主缴费
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface YezhujiaofeiDao extends BaseMapper<YezhujiaofeiEntity> {
	
	List<YezhujiaofeiVO> selectListVO(@Param("ew") Wrapper<YezhujiaofeiEntity> wrapper);
	
	YezhujiaofeiVO selectVO(@Param("ew") Wrapper<YezhujiaofeiEntity> wrapper);
	
	List<YezhujiaofeiView> selectListView(@Param("ew") Wrapper<YezhujiaofeiEntity> wrapper);

	List<YezhujiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<YezhujiaofeiEntity> wrapper);
	
	YezhujiaofeiView selectView(@Param("ew") Wrapper<YezhujiaofeiEntity> wrapper);
	
}
