package com.czh.service.impl;


import com.czh.dao.AutomationDao;
import com.czh.pojo.Automation;
import com.czh.service.AutomationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName: com.study.service.impl
 * @ClassName: AutomationServiceImpl
 * @Description: AutomationServiceImpl/description:
 * @Author: ChengZhiHao
 * @Date: 2021/7/6 11:19
 * @Version: v1.0
 */
@Service
public class AutomationServiceImpl implements AutomationService {
    @Resource
    AutomationDao automationDao;

    @Override
    public List<Automation> queryAutomationList() {
        return automationDao.queryAutomationList();
    }

    @Override
    public Automation queryById(int id) {
        return automationDao.queryById(id);
    }

    @Override
    public int addAutomation(Automation automation) {
        return automationDao.addAutomation(automation);
    }

    @Override
    public int updateAutomation(Automation automation) {
        return 0;
    }

    @Override
    public int deleteAutomation(int id) {
        return 0;
    }


}
