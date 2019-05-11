package org.cource.topic.starter.repositoryService;
import org.cource.topic.starter.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepositoryService extends CrudRepository<Topic,String>{

}
