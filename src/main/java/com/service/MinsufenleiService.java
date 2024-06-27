package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinsufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MinsufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MinsufenleiView;


/**
 * 民宿分类
 *
 * @author 
 * @email 
 * @date 2021-04-24 10:13:31
 */
public interface MinsufenleiService extends IService<MinsufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinsufenleiVO> selectListVO(Wrapper<MinsufenleiEntity> wrapper);
   	
   	MinsufenleiVO selectVO(@Param("ew") Wrapper<MinsufenleiEntity> wrapper);
   	
   	List<MinsufenleiView> selectListView(Wrapper<MinsufenleiEntity> wrapper);
   	
   	MinsufenleiView selectView(@Param("ew") Wrapper<MinsufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinsufenleiEntity> wrapper);
   	
}

