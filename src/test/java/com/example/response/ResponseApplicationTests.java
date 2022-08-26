package com.example.response;

import com.example.response.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResponseApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-----");

		var objectMapper = new ObjectMapper();

		/* object -> text
		object mapper는 get 메서드를 사용한다.
		*/
		var user = new User("yuni", 10, "123-456", "address");

		var text = objectMapper.writeValueAsString(user);

		System.out.println(text);

		/* text -> object
		기본 생성자가 필요하다. */
		var objectUser = objectMapper.readValue(text, User.class);

		System.out.println(objectUser);

	}

}
