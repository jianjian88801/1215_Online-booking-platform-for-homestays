package com.dao;

import com.entity.MinsufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MinsufenleiVO;
import com.entity.view.MinsufenleiView;


/**
 * 民宿分类
 * 
 * @author 
 * @email 
 * @date 2021-04-24 10:13:31
 */
public interface MinsufenleiDao extends BaseMapper<MinsufenleiEntity> {
	
	List<MinsufenleiVO> selectListVO(@Param("ew") Wrapper<MinsufenleiEntity> wrapper);
	
	MinsufenleiVO selectVO(@Param("ew") Wrapper<MinsufenleiEntity> wrapper);
	
	List<MinsufenleiView> selectListView(@Param("ew") Wrapper<MinsufenleiEntity> wrapper);

	List<MinsufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<MinsufenleiEntity> wrapper);
	
	MinsufenleiView selectView(@Param("ew") Wrapper<MinsufenleiEntity> wrapper);
	
}
