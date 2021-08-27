package com.czh.service;



import com.czh.pojo.Automation;

import java.util.List;

/**
 * @PackageName: com.study.service
 * @ClassName: AutomationService
 * @Description: AutomationService/description:
 * @Author: ChengZhiHao
 * @Date: 2021/7/6 11:18
 * @Version: v1.0
 */
public interface AutomationService {

    /**
     * 查询用例列表
     */
    List<Automation> queryAutomationList();

    /**
     * 根据id查询用例信息
     */
    Automation queryById(int id);

    /**
     * 添加用例
     */
    int addAutomation(Automation automation);

    /**
     * 修改用例
     */
    int updateAutomation(Automation automation);

    /**
     * 删除用例
     */
    int deleteAutomation(int id);


}
