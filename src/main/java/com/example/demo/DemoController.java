///*
// * Copyright (c) 2020-2030, Shuigedeng (981376577@qq.com & https://blog.taotaocloud.top/).
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      https://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * DemoController
// *
// * @author shuigedeng
// * @version 2022.09
// * @since 2022-12-01 12:45
// */
//@RestController
//public class DemoController {
//	@Autowired
//	private RedisTemplate redisTemplate;
//
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
//
//
//	@RequestMapping("/")
//	String home() {
//		return "Hello World!";
//	}
//
//	// 添加数据到redis
//	@PostMapping("/redis/addstring")
//	public String addToRedis(String name, String value) {
//
//		// 操作Redis中的string类型的数据,先获取ValueOperation
//		ValueOperations valueOperations = redisTemplate.opsForValue();
//
//		// 添加数据到redis
//		valueOperations.set(name, value);
//		return "向redis添加string类型的数据";
//	}
//}
