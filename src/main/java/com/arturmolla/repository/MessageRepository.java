package com.arturmolla.repository;

import com.arturmolla.producer.model.MessageRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends AbstractBaseRepository<MessageRequest, Long>{
}