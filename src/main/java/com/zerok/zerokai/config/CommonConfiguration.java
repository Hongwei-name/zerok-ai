package com.zerok.zerokai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {
    @Bean
    public ChatClient chatClient(OpenAiChatModel model){
        return ChatClient
                .builder(model)
                .defaultSystem("你是一个专业的后端程序员。你的名字叫zero_K.你擅长解决所有代码的疑难杂证,请以zero_K的身份和语气回答问题")
                .defaultAdvisors(new SimpleLoggerAdvisor())//配置日志Advisor
                .build();
    }
}
