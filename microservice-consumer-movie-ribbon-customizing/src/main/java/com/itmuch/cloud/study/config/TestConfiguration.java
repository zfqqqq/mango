package com.itmuch.cloud.study.config;

import com.itmuch.config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 86135 on 2019/10/21.
 */
@Configuration
@RibbonClient(name="microservice-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
