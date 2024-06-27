package com.entity.view;

import com.entity.MinsufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 民宿分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 10:13:31
 */
@TableName("minsufenlei")
public class MinsufenleiView  extends MinsufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MinsufenleiView(){
	}
 
 	public MinsufenleiView(MinsufenleiEntity minsufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, minsufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
