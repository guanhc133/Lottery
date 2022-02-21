# 基于SpringBoot+Redis的转盘抽奖活动项目

#### 介绍
基于SpringBoot+Redis等技术实现转盘抽奖活动项目，含前端、后台及数据库文件

#### 软件架构
SpringBoot
Redis
Mybaits


#### 配置文件
application.yml


```
server:
  port: 8080   #端口号
  servlet:
    context-path: /
spring:
  datasource:
    druid:
      url: jdbc:mysql://127.0.0.1:3366/lottery?useUnicode=true&characterEncoding=utf-8&useSSL=false  #数据库端口号：3366 数据库名：lottery
      username: root    #数据库用户名
      password: root    #数据库密码
      driver-class-name: com.mysql.cj.jdbc.Driver
      initial-size: 30
      max-active: 100
      min-idle: 10
      max-wait: 60000
      time-between-eviction-runs-millis: 60000
      min-evictable-idle-time-millis: 300000
      validation-query: SELECT 1 FROM DUAL
      test-while-idle: true
      test-on-borrow: false
      test-on-return: false
      filters: stat,wall
  redis:
    port: 6379  #redis 端口号  无密码
    host: 127.0.0.1
    lettuce:
      pool:
        max-active: -1
        max-idle: 2000
        max-wait: -1
        min-idle: 1
        time-between-eviction-runs: 5000
  mvc:
    view:
      prefix: classpath:/templates/
      suffix: .html
# mybatis-plus
mybatis-plus:
  configuration:
    map-underscore-to-camel-case: true
    auto-mapping-behavior: full
  mapper-locations: classpath*:mapper/**/*Mapper.xml

# 线程池
async:
  executor:
    thread:
      core-pool-size: 6
      max-pool-size: 12
      queue-capacity: 100000
      name-prefix: lottery-service-

```

#### 页面展示
1. 主界面
![主界面](https://images.gitee.com/uploads/images/2022/0221/141042_e9fdcbda_9956838.png "主界面.png")
![输入图片说明](https://images.gitee.com/uploads/images/2022/0221/141125_675d54b2_9956838.png "主界面2.png")
![输入图片说明](https://images.gitee.com/uploads/images/2022/0221/141133_cda4d17e_9956838.png "主界面3.png")

2. 抽奖界面
![输入图片说明](https://images.gitee.com/uploads/images/2022/0221/141201_0f706196_9956838.png "抽奖.png")
![输入图片说明](https://images.gitee.com/uploads/images/2022/0221/141210_3af74da8_9956838.png "抽奖2.png")
![输入图片说明](https://images.gitee.com/uploads/images/2022/0221/141221_3156c439_9956838.png "抽奖3.png")



#### 感谢
借鉴学习： https://gitee.com/cl1429745331/redis-demo.git

#### About me
一个爱学习、爱分享、爱交流的程序员；

欢迎关注个人微信公众号【Java烂笔头】，微信小程序【Java烂笔头】，一起交流、共同进步；


