package com.simha.SpringbootAWSSNSExe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.amazonaws.services.sqs.AmazonSQSAsync;

import io.awspring.cloud.messaging.listener.annotation.SqsListener;

@RestController
@RequestMapping("/sqs")
public class SQSCOntroller {

	@Autowired
	private AmazonSNSClient amazonsnsAsyncsds;
	/* @Value("${cloud.aws.end-point.url}") */
	private final String sqsEndpoint = "https://sqs.ap-south-1.amazonaws.com/787588272122/mysqsUque";
	private String arn="arn:aws:sns:ap-south-1:787588272122:myjavatopic";

	@GetMapping("/subscription/{email}")
	public void createSubscription(@PathVariable("email") String email) {

	  SubscribeRequest scribeRequest=new SubscribeRequest(arn,"email",email);
	  amazonsnsAsyncsds.subscribe(scribeRequest);
	}
	@RequestMapping("/message")
	public void sendingMessageTotopic()
	{
		PublishRequest prequest=new PublishRequest(arn,"hello hii");
		amazonsnsAsyncsds.publish(prequest);
	}
	

	
}
