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


import com.dao.WailaidengjiDao;
import com.entity.WailaidengjiEntity;
import com.service.WailaidengjiService;
import com.entity.vo.WailaidengjiVO;
import com.entity.view.WailaidengjiView;

@Service("wailaidengjiService")
public class WailaidengjiServiceImpl extends ServiceImpl<WailaidengjiDao, WailaidengjiEntity> implements WailaidengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WailaidengjiEntity> page = this.selectPage(
                new Query<WailaidengjiEntity>(params).getPage(),
                new EntityWrapper<WailaidengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WailaidengjiEntity> wrapper) {
		  Page<WailaidengjiView> page =new Query<WailaidengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WailaidengjiVO> selectListVO(Wrapper<WailaidengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WailaidengjiVO selectVO(Wrapper<WailaidengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WailaidengjiView> selectListView(Wrapper<WailaidengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WailaidengjiView selectView(Wrapper<WailaidengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
