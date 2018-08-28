/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : share_home_db

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 28/08/2018 23:36:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_home_info
-- ----------------------------
DROP TABLE IF EXISTS `t_home_info`;
CREATE TABLE `t_home_info`  (
  `homeInfoId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '房屋信息Id',
  `homeInfoTitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房源标题',
  `homeInfoMoneyByOneMonth` double(255, 0) NULL DEFAULT NULL COMMENT '月付金额',
  `homeInfoArea` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋面积',
  `homeInfoType` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋户型',
  `homeInfoFloor` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋楼层',
  `homeInfoOrientation` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋朝向',
  `homeInfoSubway` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋地铁',
  `homeInfoCommunity` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋小区',
  `homeInfoAddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋地址',
  `homeInfoPhone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '联系电话',
  `homeInfoPublishTime` bigint(20) NULL DEFAULT NULL COMMENT '发布时间',
  `homeInfoRentalMethod` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '租赁方式',
  `homeInfoSupportPayMethod` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '付款方式',
  `homeInfoHeatingMethod` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '供暖方式',
  `homeInfoPicListId` bigint(20) NULL DEFAULT NULL COMMENT '房屋图片列表Id ----外键关联',
  `homeInfoDeviceListId` bigint(20) NULL DEFAULT NULL COMMENT '房屋设备列表Id----外键关联',
  PRIMARY KEY (`homeInfoId`) USING BTREE,
  INDEX `homeInfoPicId`(`homeInfoPicListId`) USING BTREE,
  INDEX `homeInfoDeviceId`(`homeInfoDeviceListId`) USING BTREE,
  CONSTRAINT `t_home_info_ibfk_1` FOREIGN KEY (`homeInfoPicListId`) REFERENCES `t_home_info_pic` (`homeinfopicid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `t_home_info_ibfk_2` FOREIGN KEY (`homeInfoDeviceListId`) REFERENCES `t_home_info_device` (`homeinfodeviceid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_home_info_device
-- ----------------------------
DROP TABLE IF EXISTS `t_home_info_device`;
CREATE TABLE `t_home_info_device`  (
  `homeInfoDeviceUid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '房屋设备序号Id',
  `homeInfoDeviceId` bigint(20) NULL DEFAULT NULL COMMENT '房屋设备Id',
  `homeInfoDeviceLabel` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋设备标签名称',
  `homeInfoDeviceName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋设备图片名称',
  `homeInfoDevicePath` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋设备图片路径',
  `homeInfoDeviceDesc` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '房屋设备描述信息',
  PRIMARY KEY (`homeInfoDeviceUid`) USING BTREE,
  INDEX `homeInfoDeviceId`(`homeInfoDeviceId`) USING BTREE,
  INDEX `homeInfoDeviceId_2`(`homeInfoDeviceId`) USING BTREE,
  INDEX `homeInfoDeviceId_3`(`homeInfoDeviceId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_home_info_pic
-- ----------------------------
DROP TABLE IF EXISTS `t_home_info_pic`;
CREATE TABLE `t_home_info_pic`  (
  `homeInfoPicUid` bigint(11) NOT NULL AUTO_INCREMENT,
  `homeInfoPicId` bigint(11) NULL DEFAULT NULL,
  `homeInfoPicLabel` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `homeInfoPicName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `homeInfoPicPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `homeInfoPicDesc` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`homeInfoPicUid`) USING BTREE,
  INDEX `homeInfoPicId`(`homeInfoPicId`) USING BTREE,
  INDEX `homeInfoPicId_2`(`homeInfoPicId`) USING BTREE,
  INDEX `homeInfoPicId_3`(`homeInfoPicId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
