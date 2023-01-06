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
//import java.util.List;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//
///**
// * DemoListener
// *
// * @author shuigedeng
// * @version 2022.09
// * @since 2022-12-01 12:54
// */
//@Component
//public class DemoListener implements CommandLineRunner {
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
//	@Autowired
//	private RedisTemplate redisTemplate;
//	// 已经配置好了，直接拿过来用
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// 操作Redis中的string类型的数据,先获取ValueOperation
//		ValueOperations valueOperations = redisTemplate.opsForValue();
//
//		// 添加数据到redis
//		Object sdfasdf = valueOperations.get("sdfasdf");
//		System.out.println(sdfasdf);
//
//		// 查询 user 表的所有信息
//		String sql = "select * from oa_sub_company";
//		List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql);
//
//		System.out.println(list_maps);
//	}
//}
