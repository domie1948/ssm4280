package com.dao;

import com.entity.FankuihuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FankuihuifuVO;
import com.entity.view.FankuihuifuView;


/**
 * 反馈回复
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface FankuihuifuDao extends BaseMapper<FankuihuifuEntity> {
	
	List<FankuihuifuVO> selectListVO(@Param("ew") Wrapper<FankuihuifuEntity> wrapper);
	
	FankuihuifuVO selectVO(@Param("ew") Wrapper<FankuihuifuEntity> wrapper);
	
	List<FankuihuifuView> selectListView(@Param("ew") Wrapper<FankuihuifuEntity> wrapper);

	List<FankuihuifuView> selectListView(Pagination page,@Param("ew") Wrapper<FankuihuifuEntity> wrapper);
	
	FankuihuifuView selectView(@Param("ew") Wrapper<FankuihuifuEntity> wrapper);
	
}
