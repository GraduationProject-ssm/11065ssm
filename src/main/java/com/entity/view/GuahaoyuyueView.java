package com.entity.view;

import com.entity.GuahaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 挂号预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 10:26:02
 */
@TableName("guahaoyuyue")
public class GuahaoyuyueView  extends GuahaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuahaoyuyueView(){
	}
 
 	public GuahaoyuyueView(GuahaoyuyueEntity guahaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, guahaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
