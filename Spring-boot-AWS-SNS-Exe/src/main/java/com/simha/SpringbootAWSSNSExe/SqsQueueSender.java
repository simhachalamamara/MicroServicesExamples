package com.simha.SpringbootAWSSNSExe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sns.AmazonSNSAsyncClientBuilder;
import com.amazonaws.services.sns.AmazonSNSClient;

@Configuration
public class SqsQueueSender {

	/*@Value("${cloud.aws.region.static}")*/
    private final String region="ap-south-1";
/*	@Value("${cloud.aws.credentials.access-key}")*/
    private final String awsAccessKey="AKIA3OX7LJ75MOMKP5O3";
	/*@Value("${cloud.aws.credentials.secret-key}")*/
    private String awsSecretKey="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";
	
	
    @Bean
    @Primary
	public AmazonSNSClient amazonSqs() {
		
		return (AmazonSNSClient)AmazonSNSAsyncClientBuilder.standard().withRegion(region).withCredentials
				(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsAccessKey, awsSecretKey))).build();
	}
}
