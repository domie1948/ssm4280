package com.dao;

import com.entity.WailaidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WailaidengjiVO;
import com.entity.view.WailaidengjiView;


/**
 * 外来登记
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:20:19
 */
public interface WailaidengjiDao extends BaseMapper<WailaidengjiEntity> {
	
	List<WailaidengjiVO> selectListVO(@Param("ew") Wrapper<WailaidengjiEntity> wrapper);
	
	WailaidengjiVO selectVO(@Param("ew") Wrapper<WailaidengjiEntity> wrapper);
	
	List<WailaidengjiView> selectListView(@Param("ew") Wrapper<WailaidengjiEntity> wrapper);

	List<WailaidengjiView> selectListView(Pagination page,@Param("ew") Wrapper<WailaidengjiEntity> wrapper);
	
	WailaidengjiView selectView(@Param("ew") Wrapper<WailaidengjiEntity> wrapper);
	
}
