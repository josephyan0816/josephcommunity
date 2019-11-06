## joseph社区


##
[Spring 文档](https://spring.io/guides)
https://spring.io/guides/gs/serving-web-context



## 工具
https://git-scm.com/download

## 脚本
```sql
create table user(
id int auto_increment primary key not null,
account_id varchar(100),
name varchar(50),
token varchar(36),
GMT_create bigint,
GMT_modified bigint
)
```
```sql
create table question(
id int auto_increment primary key,
title varchar(50),
description text,
gmt_create bigint,
gmt_modified bigint,
creator int,
comment_count int default 0,
view_count int default 0,
like_count int default 0,
tag varchar(256)
)
```