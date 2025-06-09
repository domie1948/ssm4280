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


import com.dao.WupinjinchuDao;
import com.entity.WupinjinchuEntity;
import com.service.WupinjinchuService;
import com.entity.vo.WupinjinchuVO;
import com.entity.view.WupinjinchuView;

@Service("wupinjinchuService")
public class WupinjinchuServiceImpl extends ServiceImpl<WupinjinchuDao, WupinjinchuEntity> implements WupinjinchuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinjinchuEntity> page = this.selectPage(
                new Query<WupinjinchuEntity>(params).getPage(),
                new EntityWrapper<WupinjinchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinjinchuEntity> wrapper) {
		  Page<WupinjinchuView> page =new Query<WupinjinchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinjinchuVO> selectListVO(Wrapper<WupinjinchuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinjinchuVO selectVO(Wrapper<WupinjinchuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinjinchuView> selectListView(Wrapper<WupinjinchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinjinchuView selectView(Wrapper<WupinjinchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
