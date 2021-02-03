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
   id                   bigint(20) not null comment '��ɱ�id,��������',
   product_id           bigint(20) comment '��Ʒid',
   price                int(11) comment '��Ʒ�۸�',
   nums                 int(11) comment '������Ʒ����',
   start_time           datetime comment '��ɱ�ж���ʼʱ��',
   end_time             datetime comment '��ɱ�����ʱ��',
   deleted              tinyint(4) comment '�Ƿ�ɾ��',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table tb_activity_info comment '���Ϣ��';

/*==============================================================*/
/* Table: tb_order                                              */
/*==============================================================*/
create table tb_order
(
   id                   bigint(20) not null comment '����id����������',
   order_no             varchar(50) comment '��ɱ�ɹ����ɵĶ������',
   product_id           bigint(20) comment '��Ʒid',
   activity_id          varchar(20) comment '��ɱ�id',
   user_id              bigint(20) comment '�û�id',
   status               tinyint(4) comment '״̬-1��Ч 0�ɹ��������1��ɣ��Ѹ�� 2��ȡ��',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table tb_order comment '������';

/*==============================================================*/
/* Table: tb_product                                            */
/*==============================================================*/
create table tb_product
(
   id                   bigint(20) not null comment '��Ʒid',
   name                 varchar(200) comment '��Ʒ����',
   code                 varchar(200) comment '��Ʒ����',
   remark               varchar(200) comment '��Ʒ˵��',
   deleted              tinyint(4) comment '�Ƿ�ɾ��',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table tb_product comment '��Ʒ��';

/*==============================================================*/
/* Table: tb_stock                                              */
/*==============================================================*/
create table tb_stock
(
   id                   bigint(20) not null comment '���id',
   product_id           bigint(20) comment '��Ʒid',
   total_nums           int(11) comment '��Ʒ���������',
   frozen_nums          int(11) comment '���������������Ԥ����',
   active_nums          int(11) comment '��Ծ���������',
   deleted              tinyint(4) comment '�Ƿ�ɾ��',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table tb_stock comment '��Ʒ����';

/*==============================================================*/
/* Table: tb_user                                               */
/*==============================================================*/
create table tb_user
(
   id                   bigint(20) not null comment '�û�id����������',
   user_name            varchar(200) comment '�û���',
   password             varchar(200) comment '����',
   phone_number         varchar(50) comment '�ֻ���',
   email                varchar(100) comment '����',
   deleted              tinyint(4) comment '�Ƿ�ɾ��',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '�޸�ʱ��',
   primary key (id)
);

alter table tb_user comment '�û���Ϣ��';
/*==============================================================*/
/* ��ʼ������                                                     */
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
