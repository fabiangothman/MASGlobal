package com.masglobal.employees;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmployeesApplicationTests {
	@Bean
    private RestTemplate restTemplate() {
        return new RestTemplate();
    }

	/*@Test
	void contextLoads() {
	}*/

	@Test
	public void testAllEmployees(){
		ResponseEntity<String> entity = this.restTemplate().getForEntity("http://localhost:8080/employee/", String.class);
		//assertTh
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).isNotNull();
	}

	@Test
	public void testEmployee(){
		ResponseEntity<String> entity = this.restTemplate().getForEntity("http://localhost:8080/employee/id/1", String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getStatusCode()).isNotNull();
	}

}
