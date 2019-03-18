/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-03-18 15:24:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_employee`
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_code` char(255) NOT NULL COMMENT '员工编号',
  `employee_name` char(255) DEFAULT NULL COMMENT '员工姓名',
  `employee_sex` int(11) DEFAULT NULL COMMENT '员工性别',
  `employee_age` int(11) DEFAULT NULL COMMENT '员工年龄',
  `employee_tel` char(255) DEFAULT NULL COMMENT '员工电话',
  `employee_address` char(255) DEFAULT NULL COMMENT '员工地址',
  `employee_entry_date` char(255) DEFAULT NULL COMMENT '入职时间',
  `employee_quit_date` char(255) DEFAULT NULL COMMENT '离职时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_employee
-- ----------------------------
INSERT INTO `tb_employee` VALUES ('1', '20190312001', '第一个员工', '0', '22', '17857024940', '浙江万里学院', '2019-03-13', '');
INSERT INTO `tb_employee` VALUES ('12', '20190312002', '测试添加', '0', '23', '17857024940', '万里学院1', '2019-03-12', '');

-- ----------------------------
-- Table structure for `tb_goods`
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_code` char(255) DEFAULT NULL,
  `goods_name` char(255) DEFAULT NULL COMMENT '商品名称',
  `goods_type_id` char(11) DEFAULT '0' COMMENT '商品类型id',
  `sale_price` int(11) DEFAULT NULL COMMENT '售价',
  `picUrl` char(255) DEFAULT NULL COMMENT '图片地址',
  `state` int(11) DEFAULT '0' COMMENT '是否上架: 0:下架 1:上架',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_goods
-- ----------------------------
INSERT INTO `tb_goods` VALUES ('1', '00211233', '白酒', '00002', '233', null, '1');
INSERT INTO `tb_goods` VALUES ('2', '002113', '米酒', '00002', '2224', null, '0');
INSERT INTO `tb_goods` VALUES ('3', '002114', '黄酒', '00002', '5556', null, '1');
INSERT INTO `tb_goods` VALUES ('4', '002115', '测试', '00002', '566', null, '1');

-- ----------------------------
-- Table structure for `tb_goods_type`
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods_type`;
CREATE TABLE `tb_goods_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_type_name` char(255) DEFAULT NULL COMMENT '商品类型',
  `goods_type_code` char(255) DEFAULT NULL COMMENT '商品编号',
  `state` int(11) DEFAULT NULL COMMENT '状态0: 禁用 1:启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_goods_type
-- ----------------------------
INSERT INTO `tb_goods_type` VALUES ('1', '生活日用', '0000001', '1');
INSERT INTO `tb_goods_type` VALUES ('2', '测试', '0002', '1');
INSERT INTO `tb_goods_type` VALUES ('3', 'abv', '123123', '0');
INSERT INTO `tb_goods_type` VALUES ('4', '1', '1', '0');
INSERT INTO `tb_goods_type` VALUES ('5', '酒水', '00002', '1');

-- ----------------------------
-- Table structure for `tb_stock`
-- ----------------------------
DROP TABLE IF EXISTS `tb_stock`;
CREATE TABLE `tb_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_code` char(255) NOT NULL,
  `goods_code` char(11) NOT NULL COMMENT '商品编码',
  `purchase_price` int(11) DEFAULT NULL COMMENT '进价',
  `stock_num` int(11) DEFAULT NULL COMMENT '入库数量',
  `stock_margin` int(11) DEFAULT NULL COMMENT '库存余量',
  `supplier_id` int(11) NOT NULL COMMENT '供货商id',
  `create_date` char(255) DEFAULT NULL COMMENT '入库时间',
  `employee_code` char(11) DEFAULT NULL COMMENT '入库员id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_stock
-- ----------------------------
INSERT INTO `tb_stock` VALUES ('1', '201903161', '00211233', '15', '100', '100', '1', '2019-03-16', null);
INSERT INTO `tb_stock` VALUES ('2', '201903161', '002114', '18', '50', '50', '1', '2019-03-16', null);
INSERT INTO `tb_stock` VALUES ('3', '201903162', '002115', '200', '10', '10', '2', '2019-03-16', null);
INSERT INTO `tb_stock` VALUES ('4', '201903162', '002113', '15', '100', '100', '2', '2019-03-16', null);
INSERT INTO `tb_stock` VALUES ('5', '201903171', '002114', '1', '100', '100', '1', '2019-03-16', null);
INSERT INTO `tb_stock` VALUES ('6', '201903162', '00211233', '52', '22', '22', '2', '2019-03-16', null);

-- ----------------------------
-- Table structure for `tb_supplier`
-- ----------------------------
DROP TABLE IF EXISTS `tb_supplier`;
CREATE TABLE `tb_supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_name` char(255) DEFAULT NULL COMMENT '供货商名称',
  `supplier_address` char(255) DEFAULT NULL COMMENT '供货商地址',
  `supplier_person` char(255) DEFAULT NULL COMMENT '供货商联系人',
  `supplier_tel` char(255) DEFAULT NULL COMMENT '供货商电话',
  `state` int(11) DEFAULT NULL COMMENT '状态 0: 未合作 1:合作',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_supplier
-- ----------------------------
INSERT INTO `tb_supplier` VALUES ('1', '上海某食品有限公司', '上海浦东', '牛老板', '17857024940', '1');
INSERT INTO `tb_supplier` VALUES ('2', '河北某食品有限公司', '河北张家口', '黄老板', '17857024940', '1');
