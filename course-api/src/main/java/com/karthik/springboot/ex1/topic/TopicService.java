package com.karthik.springboot.ex1.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics =  Arrays.asList(new Topic("Spring", "spring framework","spring framework description"),
			new Topic("Spring", "shb","ahgvhg"),
			new Topic("Spring3", "topic3","description3"));
	public List<Topic> getAllTopics(){
		return topics;
		
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}
}
