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


import com.dao.YezhujiaofeiDao;
import com.entity.YezhujiaofeiEntity;
import com.service.YezhujiaofeiService;
import com.entity.vo.YezhujiaofeiVO;
import com.entity.view.YezhujiaofeiView;

@Service("yezhujiaofeiService")
public class YezhujiaofeiServiceImpl extends ServiceImpl<YezhujiaofeiDao, YezhujiaofeiEntity> implements YezhujiaofeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhujiaofeiEntity> page = this.selectPage(
                new Query<YezhujiaofeiEntity>(params).getPage(),
                new EntityWrapper<YezhujiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhujiaofeiEntity> wrapper) {
		  Page<YezhujiaofeiView> page =new Query<YezhujiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhujiaofeiVO> selectListVO(Wrapper<YezhujiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhujiaofeiVO selectVO(Wrapper<YezhujiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhujiaofeiView> selectListView(Wrapper<YezhujiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhujiaofeiView selectView(Wrapper<YezhujiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
