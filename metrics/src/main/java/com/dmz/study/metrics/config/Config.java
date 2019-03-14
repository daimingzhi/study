package com.dmz.study.metrics.config;

import com.sensorsdata.analytics.javasdk.SensorsAnalytics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dmz
 * @date Create in 20:44 2019/3/4
 */
@Configuration
public class Config {

    /**
     * 从神策分析获取的数据接收的 URL
     */
    final String SA_SERVER_URL = "";

    /**
     * 使用 Debug 模式，并且导入 Debug 模式下所发送的数据
     */
    final boolean SA_WRITE_DATA = true;

    @Bean
    public SensorsAnalytics sensorsAnalytics() throws Exception {
        SensorsAnalytics sa = new SensorsAnalytics(
                new SensorsAnalytics.DebugConsumer(SA_SERVER_URL, SA_WRITE_DATA));
        return sa;
    }
}
