/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : book_system02

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-09-06 17:17:30
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
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES ('1', '微微一笑很倾城', '简介：微微一笑很倾城如果你“惨”遭抛弃后，忽然有个很强很拽很不可一世的男人向你求婚，你怎么反应？', '20', '2', '3790', '\\static\\upload\\book_1.jpg', '顾漫', '73');
INSERT INTO `t_book` VALUES ('2', '冬日笔记', '一个人只要活得足够长久，就没有什么事情是不能解决的。', '21', '3', '3795', '\\static\\upload\\book_2.jpg', '保罗·奥斯特', '1');
INSERT INTO `t_book` VALUES ('3', '十二幅地图中的世界史', '世界之奥妙徐徐绽放在地图之中', '18', '5', '3794', '\\static\\upload\\book_3.jpg', '杰里·布罗顿', '35');
INSERT INTO `t_book` VALUES ('4', '月童度河', '“朴素简单地存在”', '74', '8', '3797', '\\static\\upload\\book_4.jpg', '庆山', '7');
INSERT INTO `t_book` VALUES ('5', '小王子', '小王子是一个超凡脱俗的仙童，他住在一颗只比他大一丁点儿的小行星上。陪伴他的是一朵他非常喜爱的小玫瑰花。但玫瑰花的虚荣心伤害了小王子对她的感情。小王子告别小行星，开始了遨游太空的旅行。他先后访问了六个行星，各种见闻使他陷入忧伤，他感到大人们荒唐可笑、太不正常。只有在其中一个点灯人的星球上，小王子才找到一个可以作为朋友的人。但点灯人的天地又十分狭小，除了点灯人他自己，不能容下第二个人。在地理学家的指点下，孤单的小王子来到人类居住的地球。', '22', '5', '3799', '\\static\\upload\\book_5.jpg', '圣埃克苏佩里', '5248');
INSERT INTO `t_book` VALUES ('6', '围城', '《围城》是钱钟书所著的长篇小说。第一版于1947年由上海晨光出版公司出版。1949年之后，由于政治等方面的原因，本书长期无法在中国大陆和台湾重印，仅在香港出现过盗印本。1980年由作者重新修订之后，在中国大陆地区由人民文学出版社刊印。此后作者又曾小幅修改过几次。《围城》自从出版以来，就受到许多人的推重。由于1949年后长期无法重印，这本书逐渐淡出人们的视野。1960年代，旅美汉学家夏志清在《中国现代小说史》(A History of Modern Chinese Fiction)中对本书作出很高的评价，这才重新引起人们对它的关注。人们对它的评价一般集中在两方面，幽默的语言和对生活深刻的观察。从1990年代开始，也有人提出对本书的不同看法，认为这是一部被“拔高”的小说，并不是一部出色的作品。很多人认为这是一部幽默作品。除了各具特色的人物语言之外，', '25', '10', '3802', '\\static\\upload\\book_6.jpg', '钱锺书', '89');
INSERT INTO `t_book` VALUES ('7', '优秀的人，都敢对自己下狠手', '《优秀的人，都敢 对自己下狠手》，写给在大城市', '12', '8', '3796', null, '优秀的', '1242');
INSERT INTO `t_book` VALUES ('8', '慢思考：大脑超载时代的思考学', '有没有这样的感觉：你头脑中充斥着过量的信息，每天都在邮件、电话、朋友圈和手头工作之间疲惫折返，最后却沮丧地发现，最重要的事情还是没有做？\r\n你并不孤独！\r\n在这个网络无孔不入和信息严重超载的时代，我们每个人都充当着“多面快手”角色，急不可耐地同时应对多种任务，透支着身体和精神的宝贵能量，对于大脑的生产力和创造力受到的严重影响却毫不自知。', '38', '8', '3799', '\\static\\upload\\book_8.jpg', '特奥•康普诺利', '22');
INSERT INTO `t_book` VALUES ('11', '山中的糖果', '《山中的糖果》通过“亲人记”“世间记”“回乡记”三个部分，集结了作者对故乡亲人、师友，对身边那些人那些事的记录与怀念。作者邓安庆生长在农村，曾游荡于多个城市之间，从事过广告策划、内刊编辑、企业培训、木材加工、图书编辑、互联网等不同职业，阅历丰富，天性敏感细腻，对乡村，对城市，对社会底层的人和事，都有独到而细致入微的体察。作者文笔细腻，语言纯净克制，用平铺直叙的白描手法，将人间烟火娓娓道来，对人物的举止投足和心理刻画生动，性格描述细致入微，使得读者如见其人，如入其境，读来亲切有加。他的文字接地气，带有温度，能够俘获人心。', '77', '8', '3800', null, '邓安庆', '21');

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
-- Records of t_book_in_record
-- ----------------------------
INSERT INTO `t_book_in_record` VALUES ('34', '2', '29', '4');
INSERT INTO `t_book_in_record` VALUES ('35', '2', '30', '41');
INSERT INTO `t_book_in_record` VALUES ('36', '7', '30', '1');
INSERT INTO `t_book_in_record` VALUES ('37', '3', '31', '12');
INSERT INTO `t_book_in_record` VALUES ('38', '11', '34', '6');
INSERT INTO `t_book_in_record` VALUES ('39', '8', '35', '20');
INSERT INTO `t_book_in_record` VALUES ('40', '11', '36', '12');
INSERT INTO `t_book_in_record` VALUES ('41', '8', '37', '12');
INSERT INTO `t_book_in_record` VALUES ('42', '11', '37', '12');
INSERT INTO `t_book_in_record` VALUES ('43', '6', '37', '1');
INSERT INTO `t_book_in_record` VALUES ('44', '4', '38', '2');
INSERT INTO `t_book_in_record` VALUES ('45', '5', '39', '2');
INSERT INTO `t_book_in_record` VALUES ('46', '5', '40', '33');
INSERT INTO `t_book_in_record` VALUES ('47', '3', '40', '1');
INSERT INTO `t_book_in_record` VALUES ('48', '4', '40', '3');
INSERT INTO `t_book_in_record` VALUES ('49', '8', '40', '1');
INSERT INTO `t_book_in_record` VALUES ('50', '5', '41', '1');

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
-- Records of t_book_sale_record
-- ----------------------------
INSERT INTO `t_book_sale_record` VALUES ('12', '2', '12', '170');
INSERT INTO `t_book_sale_record` VALUES ('13', '2', '16', '1');
INSERT INTO `t_book_sale_record` VALUES ('14', '6', '16', '1');
INSERT INTO `t_book_sale_record` VALUES ('15', '7', '17', '12');
INSERT INTO `t_book_sale_record` VALUES ('16', '8', '17', '11');
INSERT INTO `t_book_sale_record` VALUES ('19', '3', '19', '3');
INSERT INTO `t_book_sale_record` VALUES ('20', '4', '20', '3');
INSERT INTO `t_book_sale_record` VALUES ('21', '5', '20', '1');
INSERT INTO `t_book_sale_record` VALUES ('22', '7', '20', '2');
INSERT INTO `t_book_sale_record` VALUES ('23', '11', '20', '3');

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
-- Records of t_book_type
-- ----------------------------
INSERT INTO `t_book_type` VALUES ('2', '青春', '简介：青春测试', '1');
INSERT INTO `t_book_type` VALUES ('3', '历史', '简介：历史', '1');
INSERT INTO `t_book_type` VALUES ('4', '政治', '简介：政治', '0');
INSERT INTO `t_book_type` VALUES ('5', '数学', '简介：数学', '1');
INSERT INTO `t_book_type` VALUES ('8', '文化', '简介：文化', '1');
INSERT INTO `t_book_type` VALUES ('10', '言情', '简介：言情的', '0');
INSERT INTO `t_book_type` VALUES ('11', '传记', '简介：传记', '0');
INSERT INTO `t_book_type` VALUES ('12', '奇幻', '简介：奇幻', '0');
INSERT INTO `t_book_type` VALUES ('13', '生物', '简介：生物', '0');

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
-- Records of t_in_record
-- ----------------------------
INSERT INTO `t_in_record` VALUES ('29', '2016-09-05 16:40:52');
INSERT INTO `t_in_record` VALUES ('30', '2016-09-05 16:41:06');
INSERT INTO `t_in_record` VALUES ('31', '2016-09-05 17:16:56');
INSERT INTO `t_in_record` VALUES ('34', '2016-09-05 19:17:36');
INSERT INTO `t_in_record` VALUES ('35', '2016-09-05 20:09:16');
INSERT INTO `t_in_record` VALUES ('36', '2016-09-05 20:12:36');
INSERT INTO `t_in_record` VALUES ('37', '2016-09-06 16:11:31');
INSERT INTO `t_in_record` VALUES ('38', '2016-09-06 16:45:24');
INSERT INTO `t_in_record` VALUES ('39', '2016-09-06 16:45:35');
INSERT INTO `t_in_record` VALUES ('40', '2016-09-06 16:58:35');
INSERT INTO `t_in_record` VALUES ('41', '2016-09-06 16:59:18');

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
-- Records of t_publisher
-- ----------------------------
INSERT INTO `t_publisher` VALUES ('3790', '海燕出版社测试', '123456789858', '张山', '简介：海燕出版社', '1');
INSERT INTO `t_publisher` VALUES ('3793', '科学出版社', '12312314', '梁朝伟', '简介：科学出版社', '0');
INSERT INTO `t_publisher` VALUES ('3794', '龙门书局', '1414', '周杰伦', '简介：龙门书局', '0');
INSERT INTO `t_publisher` VALUES ('3795', '群众出版社', '14454546', '周杰', '简介：群众出版社', '1');
INSERT INTO `t_publisher` VALUES ('3796', '北京十月文艺出版社', '75757', '孙茜', '简介：北京十月文艺出版社', '0');
INSERT INTO `t_publisher` VALUES ('3797', '电子工业出版社', '8766', '聚合釜', '简介：电子工业出版社', '1');
INSERT INTO `t_publisher` VALUES ('3799', '人民军医出版社', '657565477', '飞轮海', '简介：人民军医出版社', '0');
INSERT INTO `t_publisher` VALUES ('3800', '中国建筑工业出版社2', '10086', '勿忘我', '简介：中国建筑工业出版社', '0');
INSERT INTO `t_publisher` VALUES ('3801', '中国税务出版社', '587484', '李思', '简介：中国税务出版社', '1');
INSERT INTO `t_publisher` VALUES ('3802', '中国传媒大学出版社', '58715148481152', '王瑚', '简介：中国传媒大学出版社', '0');
INSERT INTO `t_publisher` VALUES ('3803', '江西人民出版社', '74554787421', '王大根', '豆瓣红人王大根首部作品集', '0');

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
-- Records of t_sale_record
-- ----------------------------
INSERT INTO `t_sale_record` VALUES ('12', '2016-09-05 21:34:37');
INSERT INTO `t_sale_record` VALUES ('15', '2016-09-05 21:57:59');
INSERT INTO `t_sale_record` VALUES ('16', '2016-09-06 15:21:03');
INSERT INTO `t_sale_record` VALUES ('17', '2016-09-06 16:09:45');
INSERT INTO `t_sale_record` VALUES ('19', '2016-09-06 16:41:23');
INSERT INTO `t_sale_record` VALUES ('20', '2016-09-06 16:55:42');

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

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', 'admin');
INSERT INTO `t_user` VALUES ('2', 'root', '123');
INSERT INTO `t_user` VALUES ('3', 'seapeng', '234');
INSERT INTO `t_user` VALUES ('4', 'abc', '123');
