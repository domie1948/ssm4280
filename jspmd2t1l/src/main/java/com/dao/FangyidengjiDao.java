package com.dao;

import com.entity.FangyidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyidengjiVO;
import com.entity.view.FangyidengjiView;


/**
 * 防疫登记
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface FangyidengjiDao extends BaseMapper<FangyidengjiEntity> {
	
	List<FangyidengjiVO> selectListVO(@Param("ew") Wrapper<FangyidengjiEntity> wrapper);
	
	FangyidengjiVO selectVO(@Param("ew") Wrapper<FangyidengjiEntity> wrapper);
	
	List<FangyidengjiView> selectListView(@Param("ew") Wrapper<FangyidengjiEntity> wrapper);

	List<FangyidengjiView> selectListView(Pagination page,@Param("ew") Wrapper<FangyidengjiEntity> wrapper);
	
	FangyidengjiView selectView(@Param("ew") Wrapper<FangyidengjiEntity> wrapper);
	
}
