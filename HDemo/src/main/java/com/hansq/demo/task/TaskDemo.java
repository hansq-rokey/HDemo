package com.hansq.demo.task;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hansq.demo.service.TaskDemoService;

@Component
public class TaskDemo {
	@Resource
	private TaskDemoService taskDemoService;
	
	/**
	 * @description 测试定时调度任务
	 * @author hansq
	 * @date 2017-3-27 下午3:56:53
	 */
	public void testDemo(){
//		System.out.println("执行调度任务开始："+taskDemoService.testTask());
	}
}
