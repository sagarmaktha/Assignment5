package com.gonuclei.constants;

public class Constants {
  public static final String AUTHORIZATION = "Authorization";

  public static final int TOKEN_VALIDITY = 1000 * 60 * 60 * 10;


  public static final String TOPIC_PATTERN = "test-";

  public static final String CRON_SCHEDULE = "0 0 * * * ?";

  public static final String KAFKA_CONTAINER_FACTORY = "applicaionKafkaContainerFactory";

  public static final String KAFKA_TOPIC_PATTERN = "test-.*";
  public static final String KAFKA_CONSTANT_HOLDER = "applicaionKafkaContextHolder";
  public static final int JWT_TOKEN_SUBSTRING = 7;
}
