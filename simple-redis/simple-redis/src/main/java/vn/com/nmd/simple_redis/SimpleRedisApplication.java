package vn.com.nmd.simple_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SimpleRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRedisApplication.class, args);
	}

}
