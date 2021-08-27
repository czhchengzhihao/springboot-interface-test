package com.czh;

import com.czh.pojo.Automation;
import com.czh.service.AutomationService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SprintbootInterfaceTestApplicationTests {

    @Resource
    private AutomationService automationService;

    @Test
    void contextLoads() {
        List<Automation> automations = automationService.queryAutomationList();
        for (int i = 0; i < automations.size(); i++) {
            String theGinseng = automations.get(i).getTheGinseng();
            System.out.println(theGinseng);
        }
    }
}
