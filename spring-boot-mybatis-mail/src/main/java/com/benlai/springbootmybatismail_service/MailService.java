package com.benlai.springbootmybatismail_service;

public interface MailService {
	//发送一个简单的邮件
	public void sendSimpleMail(String to,String subject,String content);
}
