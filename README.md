# Kafka Testing Project
This repository contains a set of tests conducted using Apache Kafka. The tests cover various Kafka features, including producing, consuming, streaming, and visualizing streams using smothie.js.

## Introduction
This project demonstrates the use of Apache Kafka for multiple test cases:

* Kafka Producer only
* Kafka Consumer only
* Both Kafka Producer and Consumer
* Kafka Streams processing
* Visualization of Kafka Streams using smoothie.js
Apache Kafka is a distributed event streaming platform used for building real-time data pipelines and streaming applications.

## Kafka Tests

### Producer
This test simulates a Kafka producer that publishes messages to a specific topic.
-> first : 
![image](https://github.com/user-attachments/assets/8ea446b9-be1a-477c-b6cc-da5b825f8c40)

-> second (using endpoint) : 
![image](https://github.com/user-attachments/assets/8d27bd00-66d5-48b4-abc1-56abf4d35240)

Usage: Run the producer class to send messages to the Kafka broker.
Configuration: Modify producer.properties file to set broker configurations, topic, and message content.


### Consumer
This test simulates a Kafka consumer that listens to messages from a specific topic.
-> first : 
![image](https://github.com/user-attachments/assets/aa0d1393-e08d-4ae4-a7f3-303b24582296)

-> second :
![image](https://github.com/user-attachments/assets/d51d3df2-17ad-40c1-b9ef-42d6d7e9400c)

Usage: Run the consumer class to receive and process messages from the Kafka broker.
Configuration: Modify consumer.properties to set broker configurations and topic subscriptions.


### Producer to Producer and Consumer
This test runs both a producer and a consumer. The producer sends messages to a topic, and the consumer listens to the topic, receiving and processing the messages.
-> Producer send messages :
![image](https://github.com/user-attachments/assets/8ea9e16e-5d67-407b-bc66-4898f987b420)

-> Consumer transform and produce messages :
![image](https://github.com/user-attachments/assets/9d02a186-1c5f-41b2-bf9e-e0f57ffecc2e)

![image](https://github.com/user-attachments/assets/2b08a698-9e1c-470a-94e8-360b025f4a6e)

Usage: Run both the producer and consumer classes simultaneously.


### Kafka Streams
This test demonstrates Kafka Streams processing, where streams of data are processed in real-time.
-> first :
![image](https://github.com/user-attachments/assets/d8edf3aa-0618-439f-a1b7-641e5f929416)

-> second : 
![image](https://github.com/user-attachments/assets/ee492062-9bb0-4003-99ce-f20fc0a5c54d)

-> using endpoint :
![image](https://github.com/user-attachments/assets/1ebcd211-11d8-4af7-b4ad-8f119e635e58)

Usage: The stream processor reads from one or more input topics, applies transformations, and writes the results to output topics.

### Streaming Visualization :

![image](https://github.com/user-attachments/assets/c49c820d-96b0-4250-aab6-d58d91ab9096)

Access the visualization on http://localhost:8080.

