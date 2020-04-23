版本说明：
       springboot:2.2.2.RELEASE
       springcloud:Hoxton.SR1
       其他技术栈版本号见主工程的pom.xml文件
       
项目结构：
      cloud-cpi-common:项目中公用的部分，例如entity，util类等
      cloud-consumer-feign-hystrix-order80：测试熔断降级的服务调用
      cloud-consumer-feign-order80：使用feign服务调用
      cloud-consumer-hystrix-dashboard9001：hystrix仪表盘，监控页面
      cloud-consumer-order80:服务调用
      cloud-eureka-server7001：eureka服务端7001
      cloud-eureka-server7002：eureka服务端7002
      cloud-gateway-gateway9527：网关
      cloud-provider-hystrix-payment8001：熔断降级的服务提供者
      cloud-provider-payment8001：服务提供者8001
      cloud-provider-payment8002：服务提供者8002
      cloud-stream-rabbitmq-consumer8802 : 消息驱动消费者8802
      cloud-stream-rabbitmq-consumer8803 :消息驱动消费者8803
      cloud-stream-rabbitmq-provider8801 :消息驱动提供者8801
      -----------使用nacos注册服务的部分，后续部分未完成 ------------
      cloudalibaba-provider-payment9001 : alibaba服务提供者9001
      cloudalibaba-provider-payment9002 : alibaba服务提供者9002
      cloudalibaba-provider-payment9002 : alibaba服务提供者9003     只建了模块
      cloudalibaba-provider-payment9002 : alibaba服务提供者9004     只建了模块
      cloudalibaba-consumer-nacos-order83 ： alibaba服务调用者
      
      
      