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


import com.dao.FangyidengjiDao;
import com.entity.FangyidengjiEntity;
import com.service.FangyidengjiService;
import com.entity.vo.FangyidengjiVO;
import com.entity.view.FangyidengjiView;

@Service("fangyidengjiService")
public class FangyidengjiServiceImpl extends ServiceImpl<FangyidengjiDao, FangyidengjiEntity> implements FangyidengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyidengjiEntity> page = this.selectPage(
                new Query<FangyidengjiEntity>(params).getPage(),
                new EntityWrapper<FangyidengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyidengjiEntity> wrapper) {
		  Page<FangyidengjiView> page =new Query<FangyidengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyidengjiVO> selectListVO(Wrapper<FangyidengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyidengjiVO selectVO(Wrapper<FangyidengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyidengjiView> selectListView(Wrapper<FangyidengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyidengjiView selectView(Wrapper<FangyidengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
