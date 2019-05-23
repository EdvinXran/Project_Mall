package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.ItemTotal;
import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.user.Search_history;
import com.cskaoyan.cskaoyanmall.beans.user.Search_historyExample;
import com.cskaoyan.cskaoyanmall.mapper.user.Search_historyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Search_historyServiceImpl implements Search_historyService {

    @Autowired
    Search_historyMapper search_historyMapper;


    @Override
    public Message pageListWithCondition(int page,int limit,String sort,String order,Integer userId,String keyword) {
        int start_i=(page-1)*limit;
        long total= search_historyMapper.countByExample(new Search_historyExample());
        Search_historyExample search_historyExample = new Search_historyExample(sort+" "+order,start_i,limit);
        Search_historyExample.Criteria search_historyExampleCriteria = search_historyExample.createCriteria();
        if(userId!=null&&!"".equals(userId)){ search_historyExampleCriteria.andUserIdEqualTo(userId);}
        if(keyword!=null&&!"".equals(keyword)){ search_historyExampleCriteria.andKeywordLike("%"+keyword+"%");}
        List<Search_history> search_historys = search_historyMapper.selectByExample(search_historyExample);
        ItemTotal itemTotal = new ItemTotal(search_historys, total);
        return new Message(0,itemTotal,"成功");
    }
}
