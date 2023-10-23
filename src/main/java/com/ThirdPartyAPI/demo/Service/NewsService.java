package com.ThirdPartyAPI.demo.Service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.client.RestTemplate;

import com.ThirdPartyAPI.demo.Config.NewsAPIConfig;

@Service
public class NewsService {
    @Autowired
    private NewsAPIConfig newsAPIConfig;
    @Autowired
    private RestTemplate restTemplate;

    public String getNews() {
        String apiKey = newsAPIConfig.getApiKey();
        String apiUrl = "https://newsapi.org/v2/top-headlines?country=us&apiKey=" + apiKey;

        return restTemplate.getForObject(apiUrl, String.class);
    }
}