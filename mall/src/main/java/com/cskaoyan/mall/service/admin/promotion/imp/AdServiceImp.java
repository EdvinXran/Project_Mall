package com.cskaoyan.mall.service.admin.promotion.imp;

import com.cskaoyan.mall.beans.promotion.CskaoyanMallAd;
import com.cskaoyan.mall.beans.promotion.CskaoyanMallAdExample;
import com.cskaoyan.mall.beans.system.ListAndTotal;
import com.cskaoyan.mall.beans.system.Message;
import com.cskaoyan.mall.beans.system.PageAndSort;
import com.cskaoyan.mall.mapper.CskaoyanMallAdMapper;
import com.cskaoyan.mall.service.admin.promotion.AdService;
import com.cskaoyan.mall.util.FormatDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 15:39
 */
@Service("adService")
public class AdServiceImp implements AdService {

    @Autowired
    CskaoyanMallAdMapper adMapper;

    /**
     * 根据前端抓包显示，数据为三层嵌套
     * @param pas
     * @return
     */
    @Override
    public Message pageAdList(PageAndSort pas) {
        CskaoyanMallAdExample example = new CskaoyanMallAdExample();
        example.setLimit(pas.getLimit());
        example.setOffset(pas.getPage());
        example.setOrderByClause(pas.getSort()+" "+pas.getOrder());
        List<CskaoyanMallAd> adList=adMapper.selectByExample(example);
        return new Message(0,new ListAndTotal<CskaoyanMallAd>(adList,(int)adMapper.countByExample(example)),"成功");
    }

    /**
     * 修改操作，将修改后的值封装到message中返回
     * @param ad
     * @return
     */
    @Override
    public Message AdUpdate(CskaoyanMallAd ad) {
        //获取更新时间并装入ad
            ad.setUpdateTime(FormatDate.GetNow());
        return adMapper.updateByPrimaryKey(ad)==1?new Message(0,ad,"成功"):new Message(500,"","失败");
    }

    /**
     * 删除操作
     * @param ad
     * @return
     */
    @Override
    public Message AdDelete(CskaoyanMallAd ad) {
        return adMapper.deleteByPrimaryKey(ad.getId())==1?new Message(0,"","成功"):new Message(500,"","失败");
    }

    /**
     * 增加操作
     * @param ad
     * @return
     */
    @Override
    public Message AdAdd(CskaoyanMallAd ad) {
        int id=(int)adMapper.countByExample(new CskaoyanMallAdExample())+1;
        ad.setId(id);
        return adMapper.insert(ad)==1?new Message(0,ad,"成功"):new Message(500,"","失败");
    }
}
