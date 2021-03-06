package com.itheima.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

/**
 * 流程定义的部署
 *activiti表有哪些:
 *  act_re_deployment,  部署信息
    act_re_procdef,     流程定义的一些信息
    act_ge_bytearray    流程定义的bpmn文件及png文件
 */
public class ActivitiDeployment {
    //流程定义的部署
    public static void main(String[] args) {
        //1.创建ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到RepositoryService对象
        RepositoryService repositoryService = processEngine.getRepositoryService();
        //3.进行部署
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("diagram/holiday.bpmn")
                .addClasspathResource("diagram/holiday.png")
                .name("请假申请的流程")
                .deploy();
        //4.输出部署的一些信息
        System.out.println(deployment.getName());
        System.out.println(deployment.getId());


    }





}
