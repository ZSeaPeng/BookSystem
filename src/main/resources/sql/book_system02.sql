/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : book_system02

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-09-06 23:07:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BOOK_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `BOOK_INTRO` varchar(9999) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `BOOK_PRICE` double DEFAULT NULL,
  `TYPE_ID_FK` int(11) NOT NULL,
  `PUB_ID_FK` int(11) NOT NULL,
  `IMAGE_URL` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `AUTHOR` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `REPERTORY_SIZE` bigint(10) DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `TYPE_ID_FK` (`TYPE_ID_FK`),
  KEY `PUB_ID_FK` (`PUB_ID_FK`),
  CONSTRAINT `t_book_ibfk_1` FOREIGN KEY (`TYPE_ID_FK`) REFERENCES `t_book_type` (`ID`),
  CONSTRAINT `t_book_ibfk_2` FOREIGN KEY (`PUB_ID_FK`) REFERENCES `t_publisher` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_book_in_record
-- ----------------------------
DROP TABLE IF EXISTS `t_book_in_record`;
CREATE TABLE `t_book_in_record` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BOOK_ID_FK` int(11) DEFAULT NULL,
  `T_IN_RECORD_ID_FK` int(11) DEFAULT NULL,
  `IN_SUM` int(10) DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `BOOK_ID_FK` (`BOOK_ID_FK`),
  KEY `T_IN_RECORD_ID_FK` (`T_IN_RECORD_ID_FK`),
  CONSTRAINT `t_book_in_record_ibfk_1` FOREIGN KEY (`BOOK_ID_FK`) REFERENCES `t_book` (`ID`),
  CONSTRAINT `t_book_in_record_ibfk_2` FOREIGN KEY (`T_IN_RECORD_ID_FK`) REFERENCES `t_in_record` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_book_sale_record
-- ----------------------------
DROP TABLE IF EXISTS `t_book_sale_record`;
CREATE TABLE `t_book_sale_record` (
  `BOOK_SALE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `BOOK_ID_FK` int(11) DEFAULT NULL,
  `T_SALE_RECORD_ID_FK` int(11) DEFAULT NULL,
  `TRADE_SUM` int(10) DEFAULT NULL,
  PRIMARY KEY (`BOOK_SALE_ID`),
  KEY `BOOK_ID_FK` (`BOOK_ID_FK`),
  KEY `T_SALE_RECORD_ID_FK` (`T_SALE_RECORD_ID_FK`),
  CONSTRAINT `t_book_sale_record_ibfk_1` FOREIGN KEY (`BOOK_ID_FK`) REFERENCES `t_book` (`ID`),
  CONSTRAINT `t_book_sale_record_ibfk_2` FOREIGN KEY (`T_SALE_RECORD_ID_FK`) REFERENCES `t_sale_record` (`SALE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_book_type
-- ----------------------------
DROP TABLE IF EXISTS `t_book_type`;
CREATE TABLE `t_book_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `TYPE_INTRO` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `TYPE_STATUS` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_in_record
-- ----------------------------
DROP TABLE IF EXISTS `t_in_record`;
CREATE TABLE `t_in_record` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RECORD_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_publisher
-- ----------------------------
DROP TABLE IF EXISTS `t_publisher`;
CREATE TABLE `t_publisher` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PUB_NAME` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `PUB_TEL` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `PUB_LINK_MAN` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `PUB_INTRO` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `PUB_STATUS` int(4) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3804 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for t_sale_record
-- ----------------------------
DROP TABLE IF EXISTS `t_sale_record`;
CREATE TABLE `t_sale_record` (
  `SALE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RECORD_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`SALE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(20) DEFAULT NULL,
  `USER_PASSWORD` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
