/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 04/04/2022 15:47:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` varchar(255) NOT NULL,
  `email` varchar(64) DEFAULT NULL,
  `password` varchar(64) NOT NULL,
  `username` varchar(64) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4wv83hfajry5tdoamn8wsqa6x` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
BEGIN;
INSERT INTO `tb_user` VALUES ('4028838e7ff36c37017ff36c4c5e0000', 'x.ytlci@qq.com', 'ullamco', '冯平');
INSERT INTO `tb_user` VALUES ('ff8080817ff3599a017ff361a32e0004', 'h.lgpoafgz@qq.com', 'proident nisi', '余刚');
INSERT INTO `tb_user` VALUES ('ff8080817ff3599a017ff364b6680005', 'k.dmxlmhx@qq.com', 'ad', '邹涛');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
