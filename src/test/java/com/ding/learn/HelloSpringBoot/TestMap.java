package com.ding.learn.HelloSpringBoot;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TestMap {
	public static void main(String[] args) {
		ConcurrentMap<String, String> curHashMap = new ConcurrentHashMap<String, String>();
		curHashMap.put("name", "zhangsan");
		curHashMap.put("sex", "nan");
		System.out.println(curHashMap.size());
	}
}
