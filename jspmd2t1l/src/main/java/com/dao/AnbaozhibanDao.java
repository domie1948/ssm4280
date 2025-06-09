package com.dao;

import com.entity.AnbaozhibanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnbaozhibanVO;
import com.entity.view.AnbaozhibanView;


/**
 * 安保值班
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface AnbaozhibanDao extends BaseMapper<AnbaozhibanEntity> {
	
	List<AnbaozhibanVO> selectListVO(@Param("ew") Wrapper<AnbaozhibanEntity> wrapper);
	
	AnbaozhibanVO selectVO(@Param("ew") Wrapper<AnbaozhibanEntity> wrapper);
	
	List<AnbaozhibanView> selectListView(@Param("ew") Wrapper<AnbaozhibanEntity> wrapper);

	List<AnbaozhibanView> selectListView(Pagination page,@Param("ew") Wrapper<AnbaozhibanEntity> wrapper);
	
	AnbaozhibanView selectView(@Param("ew") Wrapper<AnbaozhibanEntity> wrapper);
	
}
