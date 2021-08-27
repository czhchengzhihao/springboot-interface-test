package com.czh.dao;


import com.czh.pojo.Automation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @PackageName: com.study.dao
 * @ClassName: AutomationDao
 * @Description: AutomationDao/description:
 * @Author: ChengZhiHao
 * @Date: 2021/7/6 10:59
 * @Version: v1.0
 */

/**
 * 这是一个mybatis的mapper类
 *
 * @author admin
 */
@Mapper
public interface AutomationDao {
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
