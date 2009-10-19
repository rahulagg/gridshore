package nl.gridshore.newsfeed.domain.impl;

import nl.gridshore.newsfeed.domain.ReceivedMessage;
import nl.gridshore.newsfeed.domain.ReceivedMessageRepository;
import nl.gridshore.newsfeed.domain.ReceivedMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jettro Coenradie
 */
@Service
public class ReceivedMessageServiceImpl implements ReceivedMessageService {
    @Autowired
    private ReceivedMessageRepository receivedMessageRepository;

    @Override
    public void createReceivedMessage(String sender, String content) {
        receivedMessageRepository.persist(new ReceivedMessage(content,sender));
    }

    @Override
    public List<ReceivedMessage> listAllReceivedMessages() {
        return receivedMessageRepository.listAllReceivedMessages();
    }
}
