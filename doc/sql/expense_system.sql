/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : expense_system

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-12-03 13:11:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ExpenseAdmin
-- ----------------------------
DROP TABLE IF EXISTS `ExpenseAdmin`;
CREATE TABLE `ExpenseAdmin` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `code` varchar(30) NOT NULL COMMENT 'code',
  `password` varchar(30) NOT NULL COMMENT '管理员密码',
  `name` varchar(30) DEFAULT NULL COMMENT '管理员姓名',
  `telephone` varchar(15) DEFAULT NULL COMMENT '管理员手机号',
  `email` varchar(50) DEFAULT NULL,
  `enrollDate` date NOT NULL COMMENT '授权日期',
  `timeCreated` datetime DEFAULT NULL COMMENT '创建时间',
  `timeModified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of ExpenseAdmin
-- ----------------------------
INSERT INTO `ExpenseAdmin` VALUES ('8', 'admin', '123', 'ADMIN', '123456789', 'admin@tarena.com.cn', '2017-08-15', '2017-11-04 19:48:37', '2017-11-04 19:48:37');
INSERT INTO `ExpenseAdmin` VALUES ('9', 'zhangfei', '123', 'ZhangFei', '123456789', 'zhangfei@tarena.com.cn', '2017-11-14', '2017-11-04 19:48:37', '2017-11-04 19:48:37');
INSERT INTO `ExpenseAdmin` VALUES ('10', 'liubei', '123', 'LiuBei', '123456789', 'liubei@tarena.com.cn', '2017-11-29', '2017-11-04 19:48:37', '2017-11-04 19:48:37');
INSERT INTO `ExpenseAdmin` VALUES ('11', 'caocao', '123', 'CaoCao', '123456789', 'caocao@tarena.com.cn', '2017-11-21', '2017-11-04 19:48:37', '2017-11-04 19:48:37');
INSERT INTO `ExpenseAdmin` VALUES ('12', 'aaa', '123', 'AAA', '123456789', 'aaa@tarena.com.cn', '2017-11-08', '2017-11-04 19:48:37', '2017-11-04 19:48:37');

-- ----------------------------
-- Table structure for ExpenseAdminRole
-- ----------------------------
DROP TABLE IF EXISTS `ExpenseAdminRole`;
CREATE TABLE `ExpenseAdminRole` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '管理员角色关联id',
  `adminId` int(10) NOT NULL COMMENT '管理员id',
  `roleId` int(10) NOT NULL COMMENT '角色id',
  `timeCreated` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `admin_role_pk` (`adminId`,`roleId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='管理员角色关联表';

-- ----------------------------
-- Records of ExpenseAdminRole
-- ----------------------------
INSERT INTO `ExpenseAdminRole` VALUES ('1', '8', '1', '2017-11-18 20:40:30');
INSERT INTO `ExpenseAdminRole` VALUES ('2', '8', '2', '2017-11-18 20:40:30');
INSERT INTO `ExpenseAdminRole` VALUES ('3', '4000', '300', '2017-11-18 20:40:30');
INSERT INTO `ExpenseAdminRole` VALUES ('4', '5000', '100', '2017-11-18 20:40:30');
INSERT INTO `ExpenseAdminRole` VALUES ('5', '5000', '200', '2017-11-18 20:40:30');
INSERT INTO `ExpenseAdminRole` VALUES ('6', '5000', '300', '2017-11-18 20:40:30');

-- ----------------------------
-- Table structure for ExpenseCost
-- ----------------------------
DROP TABLE IF EXISTS `ExpenseCost`;
CREATE TABLE `ExpenseCost` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '资费名称',
  `baseDuration` decimal(11,0) DEFAULT NULL COMMENT '基本时长',
  `baseCost` decimal(7,2) DEFAULT NULL COMMENT '基本费用',
  `unitCost` decimal(7,4) DEFAULT NULL COMMENT '单位费用',
  `costType` int(1) DEFAULT NULL COMMENT '消费类型',
  `status` int(1) DEFAULT NULL COMMENT '状态(1：开通，2：暂停)',
  `descr` varchar(255) DEFAULT NULL,
  `timeCreated` datetime DEFAULT NULL COMMENT '创建时间',
  `timeOpened` datetime DEFAULT NULL COMMENT '开通时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资费信息表';

-- ----------------------------
-- Records of ExpenseCost
-- ----------------------------

-- ----------------------------
-- Table structure for ExpenseModule
-- ----------------------------
DROP TABLE IF EXISTS `ExpenseModule`;
CREATE TABLE `ExpenseModule` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '模块编号',
  `name` varchar(30) NOT NULL COMMENT '模块名称',
  `timeCreated` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='模块表';

-- ----------------------------
-- Records of ExpenseModule
-- ----------------------------
INSERT INTO `ExpenseModule` VALUES ('1', '角色管理', null);
INSERT INTO `ExpenseModule` VALUES ('2', '管理员', null);
INSERT INTO `ExpenseModule` VALUES ('3', '资费管理', null);
INSERT INTO `ExpenseModule` VALUES ('4', '账务账号', null);
INSERT INTO `ExpenseModule` VALUES ('5', '业务账号', null);
INSERT INTO `ExpenseModule` VALUES ('6', '账单管理', null);
INSERT INTO `ExpenseModule` VALUES ('7', '报表', null);

-- ----------------------------
-- Table structure for ExpenseRole
-- ----------------------------
DROP TABLE IF EXISTS `ExpenseRole`;
CREATE TABLE `ExpenseRole` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `name` varchar(30) NOT NULL COMMENT '角色名称',
  `timeCreated` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ExpenseRole
-- ----------------------------
INSERT INTO `ExpenseRole` VALUES ('1', '管理员', '2017-11-14 17:04:47');
INSERT INTO `ExpenseRole` VALUES ('2', '营业员', '2017-11-07 17:04:51');
INSERT INTO `ExpenseRole` VALUES ('3', '经理', '2017-11-15 17:04:55');
INSERT INTO `ExpenseRole` VALUES ('4', 'aaa', '2017-11-01 17:04:58');
INSERT INTO `ExpenseRole` VALUES ('5', 'bbb', '2017-11-01 17:05:02');
INSERT INTO `ExpenseRole` VALUES ('6', 'ccc', '2017-10-30 17:05:05');
INSERT INTO `ExpenseRole` VALUES ('7', '测试', '2017-12-02 14:58:25');
INSERT INTO `ExpenseRole` VALUES ('9', '测试1', '2017-12-02 15:24:57');
INSERT INTO `ExpenseRole` VALUES ('10', '测试3', '2017-12-02 15:29:56');
INSERT INTO `ExpenseRole` VALUES ('11', '测试2', '2017-12-02 15:32:06');
INSERT INTO `ExpenseRole` VALUES ('12', '123333', '2017-12-02 15:53:44');
INSERT INTO `ExpenseRole` VALUES ('13', '3232323', '2017-12-02 16:00:11');
INSERT INTO `ExpenseRole` VALUES ('20', '老板', '2017-12-02 16:20:09');

-- ----------------------------
-- Table structure for ExpenseRoleModule
-- ----------------------------
DROP TABLE IF EXISTS `ExpenseRoleModule`;
CREATE TABLE `ExpenseRoleModule` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '角色模块id',
  `roleId` int(10) NOT NULL COMMENT '角色id',
  `moduleId` int(10) NOT NULL COMMENT '模块id',
  `timeCreated` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_module_pk` (`roleId`,`moduleId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='角色模块关联表';

-- ----------------------------
-- Records of ExpenseRoleModule
-- ----------------------------
INSERT INTO `ExpenseRoleModule` VALUES ('1', '1', '1', '2017-11-18 20:34:53');
INSERT INTO `ExpenseRoleModule` VALUES ('2', '2', '2', '2017-11-18 20:34:54');
INSERT INTO `ExpenseRoleModule` VALUES ('3', '1', '3', '2017-11-18 20:34:54');
INSERT INTO `ExpenseRoleModule` VALUES ('4', '200', '4', '2017-11-18 20:34:54');
INSERT INTO `ExpenseRoleModule` VALUES ('5', '200', '5', '2017-11-18 20:34:54');
INSERT INTO `ExpenseRoleModule` VALUES ('6', '200', '6', '2017-11-18 20:34:54');
INSERT INTO `ExpenseRoleModule` VALUES ('7', '300', '7', '2017-11-18 20:34:54');
INSERT INTO `ExpenseRoleModule` VALUES ('8', '7', '1', '2017-12-02 14:58:56');
INSERT INTO `ExpenseRoleModule` VALUES ('9', '7', '4', '2017-12-02 14:58:58');
INSERT INTO `ExpenseRoleModule` VALUES ('10', '7', '7', '2017-12-02 14:58:59');
INSERT INTO `ExpenseRoleModule` VALUES ('11', '9', '2', '2017-12-02 15:25:01');
INSERT INTO `ExpenseRoleModule` VALUES ('12', '9', '3', '2017-12-02 15:25:03');
INSERT INTO `ExpenseRoleModule` VALUES ('13', '9', '5', '2017-12-02 15:25:06');
INSERT INTO `ExpenseRoleModule` VALUES ('14', '9', '6', '2017-12-02 15:25:08');
INSERT INTO `ExpenseRoleModule` VALUES ('15', '10', '2', '2017-12-02 15:29:57');
INSERT INTO `ExpenseRoleModule` VALUES ('16', '10', '7', '2017-12-02 15:29:57');
INSERT INTO `ExpenseRoleModule` VALUES ('17', '20', '2', '2017-12-02 16:20:09');
INSERT INTO `ExpenseRoleModule` VALUES ('18', '20', '3', '2017-12-02 16:20:09');
INSERT INTO `ExpenseRoleModule` VALUES ('19', '20', '5', '2017-12-02 16:20:09');
INSERT INTO `ExpenseRoleModule` VALUES ('20', '20', '6', '2017-12-02 16:20:09');
