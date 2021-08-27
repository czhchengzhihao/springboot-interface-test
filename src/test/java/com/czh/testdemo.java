package com.czh;


import com.czh.dao.AutomationDao;
import com.czh.pojo.Automation;
import com.czh.service.AutomationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


import javax.annotation.Resource;

import java.util.List;

/**
 * @PackageName: com.czh
 * @ClassName: testdemo
 * @Description: testdemo/description:
 * @Author: ChengZhiHao
 * @Date: 2021/8/27 16:13
 * @Version: v1.0
 */
@SpringBootTest
public class testdemo extends AbstractTestNGSpringContextTests {
    @Autowired
    private AutomationService automationService;
    @Test
    public void test1() {
        List<Automation> automations = automationService.queryAutomationList();
        for (int i = 0; i < automations.size(); i++) {
            String theGinseng = automations.get(i).getTheGinseng();
            System.out.println(theGinseng);
        }
    }
}
