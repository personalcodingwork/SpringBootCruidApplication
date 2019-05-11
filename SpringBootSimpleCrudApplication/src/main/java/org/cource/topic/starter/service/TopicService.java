package org.cource.topic.starter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.cource.topic.starter.model.Topic;
import org.cource.topic.starter.repositoryService.TopicRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	@Autowired
	private TopicRepositoryService topicRepositoryService;
	
	
	public List<Topic> getAllTopic(){
		List<Topic> listOfTopic = new ArrayList<Topic>();
		topicRepositoryService.findAll()
		.forEach(listOfTopic :: add);
		
		return listOfTopic;
	}

	public void addTopic(Topic topic) {
		topicRepositoryService.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepositoryService.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepositoryService.deleteById(id);
	}
}
