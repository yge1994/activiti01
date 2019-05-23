package com.itheima.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;

import java.util.List;

/**
 * 处理当前用户的任务
 *      背后操作的表:
 *          act_hi_actinst,
             act_hi_identitylink,
             act_hi_taskinst,
             act_ru_execution,
             act_ru_identitylink,
             act_ru_task
 */
public class ActivitiCompleteTask {
    //wangwu查询并完成自己的任务
    public static void main(String[] args) {
        //1.创建ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到TaskService对象
        TaskService taskService = processEngine.getTaskService();
        //3.查询任务
        Task task = taskService.createTaskQuery()
                .processDefinitionKey("holiday")
                .taskAssignee("wangwu")
                .singleResult();
        //4.完成任务
        taskService.complete(task.getId());
    }

    //lisi完成自己的任务
   /* public static void main(String[] args) {
        //1.创建ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到TaskService对象
        TaskService taskService = processEngine.getTaskService();
        //3.处理任务    任务ID:5002
        taskService.complete("5002");
        //4.打印信息
        System.out.println("完成的任务ID:"+5002);


    }*/

    //zhangsan完成自己的任务
    /*public static void main(String[] args) {
        //1.创建ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到TaskService对象
        TaskService taskService = processEngine.getTaskService();
        //3.处理任务    任务ID:2505
        taskService.complete("2505");
        //4.打印信息
        System.out.println("完成的任务ID:"+2505);


    }*/

}

















