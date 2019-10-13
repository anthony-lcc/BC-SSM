package org.lcc.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.lcc.bean.Dic;
import org.lcc.dao.DicDao;
import org.lcc.service.DicService;
import org.springframework.stereotype.Service;

@Service
public class DicServiceImpl implements DicService {
    
    @Resource
    private DicDao dicDao;
    
    @Override
    public List<Dic> getListByType(String type) {
	Dic dic = new Dic();
	dic.setType(type);
	return dicDao.select(dic);
    }
}
