package org.restfeeds.client.example;

import org.restfeeds.client.FeedItem;
import org.restfeeds.client.FeedItemConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleFeedItemConsumer implements FeedItemConsumer {

  private static final Logger log = LoggerFactory.getLogger(SimpleFeedItemConsumer.class);

  @Override
  public void accept(FeedItem feedItem) {
    log.info("Consumed {}", feedItem);
  }
}
