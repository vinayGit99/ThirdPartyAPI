package com.ThirdPartyAPI.demo.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewsAPIConfig {
    @Value("${newsapi.api-key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}