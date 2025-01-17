package com.entity.view;

import com.entity.LoufangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 楼房信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * 
 */
@TableName("loufangxinxi")
public class LoufangxinxiView  extends LoufangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LoufangxinxiView(){
	}
 
 	public LoufangxinxiView(LoufangxinxiEntity loufangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, loufangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
