package com.dao;

import com.entity.WupinjinchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinjinchuVO;
import com.entity.view.WupinjinchuView;


/**
 * 物品进出
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface WupinjinchuDao extends BaseMapper<WupinjinchuEntity> {
	
	List<WupinjinchuVO> selectListVO(@Param("ew") Wrapper<WupinjinchuEntity> wrapper);
	
	WupinjinchuVO selectVO(@Param("ew") Wrapper<WupinjinchuEntity> wrapper);
	
	List<WupinjinchuView> selectListView(@Param("ew") Wrapper<WupinjinchuEntity> wrapper);

	List<WupinjinchuView> selectListView(Pagination page,@Param("ew") Wrapper<WupinjinchuEntity> wrapper);
	
	WupinjinchuView selectView(@Param("ew") Wrapper<WupinjinchuEntity> wrapper);
	
}
