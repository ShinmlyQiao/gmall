package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品库存
 * 
 * @author Qiao
 * @email lxf@atguigu.com
 * @date 2020-04-28 11:48:12
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    List<WareSkuEntity> checkStore(Long skuId, Integer count);

    void lockStore(Long id, Integer count);

    void unLockStore(Long wareSkuId, Integer count);

    void minusStore(Long wareSkuId, Integer count);
}
