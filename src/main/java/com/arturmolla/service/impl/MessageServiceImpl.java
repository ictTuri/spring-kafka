package com.arturmolla.service.impl;

import com.arturmolla.producer.model.MessageRequest;
import com.arturmolla.repository.AbstractBaseRepository;
import com.arturmolla.service.MessageService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MessageServiceImpl extends AbstractBaseServiceImpl<MessageRequest, Long> implements MessageService {

    public MessageServiceImpl(AbstractBaseRepository<MessageRequest, Long> abstractBaseRepository) {
        super(abstractBaseRepository);
    }
}
