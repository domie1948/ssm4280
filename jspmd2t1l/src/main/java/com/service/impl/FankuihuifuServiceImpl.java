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


import com.dao.FankuihuifuDao;
import com.entity.FankuihuifuEntity;
import com.service.FankuihuifuService;
import com.entity.vo.FankuihuifuVO;
import com.entity.view.FankuihuifuView;

@Service("fankuihuifuService")
public class FankuihuifuServiceImpl extends ServiceImpl<FankuihuifuDao, FankuihuifuEntity> implements FankuihuifuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FankuihuifuEntity> page = this.selectPage(
                new Query<FankuihuifuEntity>(params).getPage(),
                new EntityWrapper<FankuihuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FankuihuifuEntity> wrapper) {
		  Page<FankuihuifuView> page =new Query<FankuihuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FankuihuifuVO> selectListVO(Wrapper<FankuihuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FankuihuifuVO selectVO(Wrapper<FankuihuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FankuihuifuView> selectListView(Wrapper<FankuihuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FankuihuifuView selectView(Wrapper<FankuihuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
