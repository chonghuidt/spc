package com.jc.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther lipeng
 * @date 2020/4/20 0020 15:18
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
   /* 访问规则
   * / {application} / {profile} [/ {label}]
     /{application}-{profile}.yml
    /{label}/{application}-{profile}.yml
    /{application}-{profile}.properties
    /{label}/{application}-{profile}.properties
   *
   * */

    //例如：
    // 访问按照   端口号/分支/文件名  例如：http://config-3344.com:3344/dev/config-dev.yml
    //前面的config-3344.com 为本机映射的域名，如果不映射写localhost也可以
    //使用全局动态刷新的消息总线：更改github上的文件，发送一次请求给暴露的端口
    //这里以 localhost:3344/actuator/bus-refresh 为例，然后 配置中心的客户端也能自动拿到最新的数据
    //不用重启微服务
    //全局广播有时候不需要所有客户端都广播到，如果只需指定个别广播，在访问的时候指定对应的
    //服务名和端口名即可  例如，只通知3355   那么发请求：localhost:3344/actuator/bus-refresh/config-client:3355
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
