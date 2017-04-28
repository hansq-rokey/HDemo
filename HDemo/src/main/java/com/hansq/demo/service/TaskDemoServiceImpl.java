package com.hansq.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class TaskDemoServiceImpl implements TaskDemoService {

	@Override
	public String testTask() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String d = sdf.format(date);
		return "于"+d+" 执行一次";
	}
}
