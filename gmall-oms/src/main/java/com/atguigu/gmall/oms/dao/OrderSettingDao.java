package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author Qiao
 * @email lxf@atguigu.com
 * @date 2020-04-28 11:44:19
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
