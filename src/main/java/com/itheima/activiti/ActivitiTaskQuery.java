package com.itheima.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;

import java.util.List;

/**
 * 查询当前用户的任务列表
 */
public class ActivitiTaskQuery {
    //lisi任务的查询
    public static void main(String[] args) {
        //1.创建ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到TaskService对象
        TaskService taskService = processEngine.getTaskService();
        //3.根据流程定义的key及负责人assignee,实现当前用户的任务列表查询
        Task task = taskService.createTaskQuery()
                .processDefinitionKey("holiday")
                .taskAssignee("lisi")
                .singleResult();
        //4.任务列表的展示
        System.out.println("流程实例的ID:"+task.getProcessInstanceId());
        System.out.println("任务的ID:"+task.getId());//5002
        System.out.println("任务负责人:"+task.getAssignee());
        System.out.println("任务名称:"+task.getName());


    }

    //张三任务列表的查询
    /*public static void main(String[] args) {
        //1.创建ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到TaskService对象
        TaskService taskService = processEngine.getTaskService();
        //3.根据流程定义的key及负责人assignee,实现当前用户的任务列表查询
        List<Task> taskList = taskService.createTaskQuery()
                .processDefinitionKey("holiday")
                .taskAssignee("zhangsan")
                .list();
        //4.任务列表的展示
        for (Task task: taskList) {
            System.out.println("流程实例的ID:"+task.getProcessInstanceId());
            System.out.println("任务的ID:"+task.getId());
            System.out.println("任务负责人:"+task.getAssignee());
            System.out.println("任务名称:"+task.getName());
        }


    }*/

}

















