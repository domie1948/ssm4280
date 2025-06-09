package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.AnbaozhibanDao;
import com.entity.AnbaozhibanEntity;
import com.service.AnbaozhibanService;
import com.entity.vo.AnbaozhibanVO;
import com.entity.view.AnbaozhibanView;

@Service("anbaozhibanService")
public class AnbaozhibanServiceImpl extends ServiceImpl<AnbaozhibanDao, AnbaozhibanEntity> implements AnbaozhibanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnbaozhibanEntity> page = this.selectPage(
                new Query<AnbaozhibanEntity>(params).getPage(),
                new EntityWrapper<AnbaozhibanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnbaozhibanEntity> wrapper) {
		  Page<AnbaozhibanView> page =new Query<AnbaozhibanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnbaozhibanVO> selectListVO(Wrapper<AnbaozhibanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnbaozhibanVO selectVO(Wrapper<AnbaozhibanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnbaozhibanView> selectListView(Wrapper<AnbaozhibanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnbaozhibanView selectView(Wrapper<AnbaozhibanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
