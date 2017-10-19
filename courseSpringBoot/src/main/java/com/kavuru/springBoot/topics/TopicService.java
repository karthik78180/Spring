package com.kavuru.springBoot.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("1", "Spring Core", "Spring Core Module"),
			new Topic("2", "Spring Security", "Spring Security Module"));

	public List<Topic> getAllTopics() {
		return topics;

	}

	// to get a specific topic based on id;
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	//post request
	public void addTopic(Topic topic) {
		
		topics.add(topic);
	}
	
	
	
}
