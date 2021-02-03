/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2021/1/26 15:17:49                           */
/*==============================================================*/


drop table if exists tb_activity_info;

drop table if exists tb_order;

drop table if exists tb_product;

drop table if exists tb_stock;

drop table if exists tb_user;

/*==============================================================*/
/* Table: tb_activity_info                                      */
/*==============================================================*/
create table tb_activity_info
(
   id                   bigint(20) not null comment '秒杀活动id,自增主键',
   product_id           bigint(20) comment '产品id',
   price                int(11) comment '商品价格',
   nums                 int(11) comment '参与活动商品数量',
   start_time           datetime comment '秒杀行动开始时间',
   end_time             datetime comment '秒杀活动结束时间',
   deleted              tinyint(4) comment '是否被删除',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table tb_activity_info comment '活动信息表';

/*==============================================================*/
/* Table: tb_order                                              */
/*==============================================================*/
create table tb_order
(
   id                   bigint(20) not null comment '主键id，自增主键',
   order_no             varchar(50) comment '秒杀成功生成的订单编号',
   product_id           bigint(20) comment '商品id',
   activity_id          varchar(20) comment '秒杀活动id',
   user_id              bigint(20) comment '用户id',
   status               tinyint(4) comment '状态-1无效 0成功（待付款）1完成（已付款） 2已取消',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table tb_order comment '订单表';

/*==============================================================*/
/* Table: tb_product                                            */
/*==============================================================*/
create table tb_product
(
   id                   bigint(20) not null comment '产品id',
   name                 varchar(200) comment '产品名称',
   code                 varchar(200) comment '产品编码',
   remark               varchar(200) comment '产品说明',
   deleted              tinyint(4) comment '是否被删除',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table tb_product comment '商品表';

/*==============================================================*/
/* Table: tb_stock                                              */
/*==============================================================*/
create table tb_stock
(
   id                   bigint(20) not null comment '库存id',
   product_id           bigint(20) comment '产品id',
   total_nums           int(11) comment '商品库存总数量',
   frozen_nums          int(11) comment '冻结库存总数量（活动预留）',
   active_nums          int(11) comment '活跃库存总数量',
   deleted              tinyint(4) comment '是否被删除',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table tb_stock comment '商品库存表';

/*==============================================================*/
/* Table: tb_user                                               */
/*==============================================================*/
create table tb_user
(
   id                   bigint(20) not null comment '用户id，自增主键',
   user_name            varchar(200) comment '用户名',
   password             varchar(200) comment '密码',
   phone_number         varchar(50) comment '手机号',
   email                varchar(100) comment '邮箱',
   deleted              tinyint(4) comment '是否删除',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '修改时间',
   primary key (id)
);

alter table tb_user comment '用户信息表';
/*==============================================================*/
/* 初始化数据                                                     */
/*==============================================================*/
/*==============================================================*/
/* Table: tb_product                                            */
/*==============================================================*/
INSERT INTO `tb_product` ( NAME, CODE, deleted, create_time )
VALUES
( 'iphone12', 'product1', 0, '2020-11-14 21:11:23' );
INSERT INTO `tb_product` ( NAME, CODE, deleted, create_time )
VALUES
( 'AirJordan4', 'product2', 0, '2020-11-04 11:13:23' );
INSERT INTO `tb_product` ( NAME, CODE, deleted, create_time )
VALUES
( 'Tesla', 'product3', 0, '2020-11-09 18:11:23' );
/*==============================================================*/
/* Table: tb_stock                                              */
/*==============================================================*/
INSERT INTO `tb_stock` ( product_id, total_nums, frozen_nums, active_nums, deleted, create_time )
VALUES
( 1, 1000, 0, 0, 0, '2020-11-14 21:11:23' );
INSERT INTO `tb_stock` ( product_id, total_nums, frozen_nums, active_nums, deleted, create_time )
VALUES
( 2, 2000, 0, 0, 0, '2020-11-14 21:11:23' );
INSERT INTO `tb_stock` ( product_id, total_nums, frozen_nums, active_nums, deleted, create_time )
VALUES
( 3, 3000, 0, 0, 0, '2020-11-14 21:11:23' );
/*==============================================================*/
/* Table: tb_activity_info                                      */
/*==============================================================*/
INSERT INTO `tb_activity_info` ( product_id, price, nums, start_time, end_time, deleted, create_time )
VALUES
( 1, 1000, 70, '2020-11-14 21:59:07', '2020-11-14 21:59:11', 0, '2020-11-14  21:11:23' );
INSERT INTO `tb_activity_info` ( product_id, price, nums, start_time, end_time, deleted, create_time )
VALUES
( 2, 2000, 30, '2020-11-14 21:59:07', '2020-11-14 21:59:11', 0, '2020-11-14  21:11:23' );
INSERT INTO `tb_activity_info` ( product_id, price, nums, start_time, end_time, deleted, create_time )
VALUES
( 3, 100000, 2, '2020-11-14 21:59:07', '2020-11-14 21:59:11', 0, '2020-11-14  21:11:23' );
