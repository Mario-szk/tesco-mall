package com.jerusalem.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerusalem.common.utils.PageUtils;
import com.jerusalem.ware.entity.PurchaseDetailEntity;
import com.jerusalem.ware.vo.MergeVo;

import java.util.List;
import java.util.Map;

/****
 * 服务层接口
 * 采购项
 * @author jerusalem
 * @email 3276586184@qq.com
 * @date 2020-04-09 17:54:29
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    /**
    * 根据仓库、采购单状态、关键字进行分页查询采购需求
    * @param params
    * @return
    */
    PageUtils queryPage(Map<String, Object> params);

    /***
     * 合并采购项到采购单
     * @param mergeVo
     * @return
     */
    void mergePurchaseDetail(MergeVo mergeVo);

    /***
     * 根据采购单ID查询采购项
     * @param purchaseId
     * @return
     */
    List<PurchaseDetailEntity> detailListByPurchaseId(Long purchaseId);
}

