<h1 align="center"><a href="https://github.com/byteblogs168/plumemo" target="_blank">hello-blog</a></h1>

> [hello-blog](https://www.plumemo.com/) 是一个轻量、易用、前后端分离的博客系统，为了解除开发人员对后端的束缚，真正做到的一个面向接口开发的博客系统，其借鉴了<a href="https://github.com/byteblogs168/plumemo" target="_blank">plumemo</a>。

------------------------------
## 简介

> 基于[SpringBoot](https://spring.io/projects/spring-boot/)实现零配置让系统的配置更简单，使用了[Mybatis-Plus](https://mp.baomidou.com/)快速开发框架，在不是复杂的查询操作下，无需写sql就可以快速完成接口编写,对于复杂查询，通过配置xml映射器，手写sql实现。
> 后台管理系统使用了vue中流行的[ant](https://panjiachen.github.io/vue-element-admin-site/#/)，另外前后交互使用了[JWT](https://jwt.io/)作为令牌，进行权限、登录校验。使用了ES做全文搜索。

## 声明

> 本项目，主要宗旨在于，简单、易用、不烧脑的博客，并在plumemo基础上进行一些优化。

## 使用须知

>  由于项目是前后端完全分离，所以此项目为单独的后端项目，后台管理系统、博客主题可以进行自由搭配
>
>> 后端API <https://github.com/byteblogs168/plumemo><br>
>> 后端管理系统 <https://github.com/byteblogs168/plumemo-admin><br>
>> 前端主题(theme-react-sakura)地址：<https://github.com/byteblogs168/theme-react-sakura/><br>
>> 前端主题(theme-vue-bluesoul)地址：<https://github.com/byteblogs168/theme-vue-bluesoul/><br>

## 快速开始

### 下载最新的 plumemo 安装包

window

```bash
https://github.com/byteblogs168/plumemo/releases/download/v1.1.0/plumemo-v1.1.0.jar
```

linux

```bash
wget https://github.com/byteblogs168/plumemo/releases/download/v1.1.0/plumemo-v1.1.0.jar
```

### 启动 plumemo 

```bash
java -jar plumemo-v1.1.0.jar --MYSQL_USERNAME=root  --MYSQL_PASSWORD=password  --MYSQL_DATABASE=jdbc:mysql://127.0.0.1:3306/helloblog?useSSL=false&characterEncoding=utf8 
```

详细文档请移步：<https://www.plumemo.com/>

## 博客示例
- 前端(theme-react-sakura)： <https://preview.plumemo.com/>。
- 前端(theme-vue-bluesoul)： <https://preview.plumemo.com/theme-vue-bluesoul>。
- 管理系统： <https://preview.plumemo.com/admin>。 
- 演示站点：账号：preview_plumemo@163.com 密码：plumemo888

## 生态圈
- 后端代码（plumemo）：<https://github.com/byteblogs168/plumemo>
- 后端代码（plumemo-admin）：<https://github.com/byteblogs168/plumemo-admin>
- 主题仓库：<https://github.com/byteblogs168/theme-react-sakura/> | <https://github.com/byteblogs168/theme-vue-bluesoul/>

## 使用plumemo的优秀博主

- 青涩知夏：<https://www.nosum.cn/>
- 踏歌长行：<https://www.bygit.cn/>
- 遥远的理想乡：<https://www.aimer-zero.cn/>
- 巫山烤鱼：<http://qfdxz.top/>

## 预览图

<img src="https://cos.nosum.cn/preview/helloblog-theme/helloblog-theme3-perview%20%281%29.jpg" width="600"/>

