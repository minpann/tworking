CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL COMMENT '用户名',
  `address` varchar(64) NOT NULL COMMENT '地址',
  `description` varchar(64) DEFAULT '' COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COMMENT='用户表';

insert into user(username, address, description)
  values('杨雨晴','北京朝阳','金融工作');

insert into user(username, address, description)
  values('李欢','上海虹桥','经济');