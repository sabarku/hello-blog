<h1 align="center"><a href="https://github.com/sabarku/hello-blog" target="_blank">hello-blog</a></h1>

> [hello-blog]是一个轻量、易用、前后端分离的博客系统，为了解除开发人员对后端的束缚，真正做到的一个面向接口开发的博客系统，其借鉴了<a href="https://github.com/byteblogs168/plumemo" target="_blank">plumemo</a>。

------------------------------
## 简介

> 基于[SpringBoot](https://spring.io/projects/spring-boot/)实现零配置让系统的配置更简单，使用了[Mybatis-Plus](https://mp.baomidou.com/)快速开发框架，在不是复杂的查询操作下，无需写sql就可以快速完成接口编写,对于复杂查询，通过配置xml映射器，手写sql实现。
> 后台管理系统使用了vue中流行的[ant](https://panjiachen.github.io/vue-element-admin-site/#/)，另外前后交互使用了[JWT](https://jwt.io/)作为令牌，进行权限、登录校验。使用了ES做全文搜索。

## 声明

> 本项目，主要宗旨在于，简单、易用、不烧脑的博客，并在plumemo基础上进行一些优化。

## 使用须知

>  由于项目是前后端完全分离，所以此项目为单独的后端项目，后台管理系统、博客主题可以进行自由搭配
>
>> 后端API <https://github.com/sabarku/hello-blog><br>
>> 后端管理系统 <https://github.com/sabarku/hello-blog-admin><br>
>> 前端主题(theme-react-sakura)地址：<https://github.com/sabarku/theme-react-sakura/><br>

## 后端技术栈
- 核心框架：Spring Boot
- 安全框架：Security
- Token 认证：jwt
- 持久层框架：MyBatisPlus
- java版本：JDK8
- 缓存：redis
- 搜索引擎：ElasticSearch
- 消息队列中间件：RocketMq

## 技术亮点
- 统一异常处理：不管是controller层还是service，dao层，都有可能报异常，如果是预料中的异常，可以直接捕获处理，如果是意料之外的异常，需要统一进行处理，进行记录，并给用户提示相对比较友好的信息。
- 利用JWT技术实现登录
  - jwt 可以生成 一个加密的token，做为用户登录的令牌，当用户登录成功之后，发放给客户端。请求需要登录的资源或者接口的时候，将token携带，后端验证token是否合法。
  - jwt 有三部分组成：A.B.C
    - A：Header，{“type”:“JWT”,“alg”:“HS256”} 固定
    - B：playload，存放信息，比如，用户id，过期时间等等，可以被解密，不能存放敏感信息
    - C: 签证，A和B加上秘钥 加密而成，只要秘钥不丢失，可以认为是安全的。
  - jwt 验证，主要就是验证C部分 是否合法。
- 使用redis存储登录的token做分布式会话管理存储，解决分布式session问题
- 使用ThreadLocal替代Session完成保存用户登录信息功能。 可以在同一线程中很方便的获取用户信息，不需要频繁的传递session对象。
  - <a href="https://blog.csdn.net/puppylpg/article/details/80433271" target="_blank">ThreadLocal原理及内存泄露预防</a>。
  - 实线代表强引用,虚线代表弱引用，每一个Thread维护一个ThreadLocalMap, key为使用弱引用的ThreadLocal实例，value为线程变量的副本，
    - 强引用，使用最普遍的引用，一个对象具有强引用，不会被垃圾回收器回收。当内存空间不足，Java虚拟机宁愿抛出OutOfMemoryError错误，使程序异常终止，也不回收这种对象。如果想取消强引用和某个对象之间的关联，可以显式地将引用赋值为null，这样可以使JVM在合适的时间就会回收该对象。
    - 弱引用，JVM进行垃圾回收时，无论内存是否充足，都会回收被弱引用关联的对象。在java中，用java.lang.ref.WeakReference类来表示。
- 使用拦截器，进行登录拦截，如果遇到需要登录才能访问的接口，如果未登录，拦截器直接返回，并跳转登录页面。
- 使用线程池 更新阅读次数
- Aop日志实现：在不改变原有方法基础上对原有方法进行增强，通过加上定义的注解来对我们需要的接口进行日志输出。
- 使用七牛云服务器做为图片服务器，将tps提升了一个数量级，大大提升了网站的访问速度。
- 使用SpringCache做统一缓存处理（内存的访问速度 远远大于 磁盘的访问速度 （1000倍起））
- 使用springsecurity 做一个后台权限系统作为后台管理

## 快速开始

### 下载最新的 hello-blog 安装包

window

```bash
https://github.com/sabarku/hello-blog/releases/download/V1.2.0/hello-blog-v1.2.0.jar
```

linux

```bash
wget https://github.com/sabarku/hello-blog/releases/download/V1.2.0/hello-blog-v1.2.0.jar
```

### 启动 hello-blog 

```bash
java -jar hello-blog-v1.2.0.jar --MYSQL_USERNAME=root  --MYSQL_PASSWORD=password  --MYSQL_DATABASE=jdbc:mysql://127.0.0.1:3306/helloblog?useSSL=false&characterEncoding=utf8 
```

## 生态圈
- 后端代码（hello-blog）：<https://github.com/sabarku/hello-blog>
- 后台代码（plumemo-admin）：<https://github.com/sabarku/hello-blog-admin>
- 主题仓库：<https://github.com/sabarku/theme-react-sakura/> 

## 致谢
项目开发过程主要基于<a href="https://github.com/byteblogs168/plumemo" target="_blank">plumemo</a>，感谢plumemo的相关文档教导。

