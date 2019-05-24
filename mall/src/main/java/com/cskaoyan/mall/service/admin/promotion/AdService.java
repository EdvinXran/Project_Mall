package com.cskaoyan.mall.service.admin.promotion;

import com.cskaoyan.mall.beans.promotion.CskaoyanMallAd;
import com.cskaoyan.mall.beans.system.Message;
import com.cskaoyan.mall.beans.system.PageAndSort;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 15:38
 */
public interface AdService {
    Message pageAdList(PageAndSort pas);

    Message AdUpdate(CskaoyanMallAd ad);

    Message AdDelete(CskaoyanMallAd ad);

    Message AdAdd(CskaoyanMallAd ad);
}
