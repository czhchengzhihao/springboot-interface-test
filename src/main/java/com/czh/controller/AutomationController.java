package com.czh.controller;


import com.czh.pojo.Automation;
import com.czh.service.AutomationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName: com.study.controller
 * @ClassName: AutomationController
 * @Description: AutomationController/description:
 * @Author: ChengZhiHao
 * @Date: 2021/7/6 12:05
 * @Version: v1.0
 */

@RestController
public class AutomationController {
    @Resource
    private AutomationService automationService;

    @GetMapping("/queryAutomationList")
    public List<Automation> queryAutomationList() {
        return automationService.queryAutomationList();
    }

    @PostMapping("queryAutomationById")
    public Automation queryAutomationById(int id) {
        return automationService.queryById(id);
    }

    @PostMapping("addAutomation")
    public int addAutomation(@RequestBody Automation automation) {
        return automationService.addAutomation(automation);
    }

}
