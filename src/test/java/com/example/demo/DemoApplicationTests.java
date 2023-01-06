package com.example.demo;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoApplicationTests {

	//@Test
	//void contextLoads() {
	//
	//}

	public static void main(String[] args) {
		Competition competition = new Competition();
		CompResult result = new CompResult();
		User user = new User();
		user.setName("sdf");
		result.setChampion(user);
		competition.setResult(result);
		String championName = getChampionName(competition);
		System.out.println(championName);
	}

	public static String getChampionName(Competition comp) throws IllegalArgumentException {
		return Optional.ofNullable(comp)
				.map(Competition::getResult)  // 相当于c -> c.getResult()，下同
				.map(CompResult::getChampion)
				.map(User::getName)
				.orElseThrow(()->new RuntimeException("The value of param comp isn't available."));
	}

	public static class Competition{
		private CompResult result;

		public CompResult getResult() {
			return result;
		}

		public void setResult(CompResult result) {
			this.result = result;
		}
	}

	public static class CompResult{
		private User champion;

		public User getChampion() {
			return champion;
		}

		public void setChampion(User champion) {
			this.champion = champion;
		}
	}

	public static class User{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
