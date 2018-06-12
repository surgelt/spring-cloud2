package org.spring.cloud2.service.feign.service;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry " + name;
	}
}
