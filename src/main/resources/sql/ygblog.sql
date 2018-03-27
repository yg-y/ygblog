/*
Navicat MySQL Data Transfer

Source Server         : learningsystemdatabase
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : ygblog

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-03-24 00:16:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog_forum
-- ----------------------------
DROP TABLE IF EXISTS `blog_forum`;
CREATE TABLE `blog_forum` (
  `forum_id` int(6) NOT NULL,
  `forum_title` varchar(16) NOT NULL,
  `forum_content` varchar(800) DEFAULT NULL,
  `forum_img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`forum_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_forum
-- ----------------------------

-- ----------------------------
-- Table structure for blog_img
-- ----------------------------
DROP TABLE IF EXISTS `blog_img`;
CREATE TABLE `blog_img` (
  `img_id` int(6) NOT NULL AUTO_INCREMENT,
  `like_id` int(6) DEFAULT NULL,
  `img_name` varchar(255) DEFAULT NULL,
  `img_path` varchar(255) DEFAULT NULL,
  `img_content` varchar(255) DEFAULT NULL,
  `img_date` varchar(255) DEFAULT NULL,
  `img_index` varchar(100) DEFAULT NULL COMMENT '标识哪个页面的图片',
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_img
-- ----------------------------
INSERT INTO `blog_img` VALUES ('1', null, '2018-03-20/images/93801483389', '2018-03-20/images/93801483389', '从前初识这世间', '2018-03-20', '1');
INSERT INTO `blog_img` VALUES ('3', null, '2018-03-20/images/990499077748', '2018-03-20/images/990499077748', '你好世界', '2018-03-20', '1');
INSERT INTO `blog_img` VALUES ('4', null, '2018-03-20/images/329921619863', '2018-03-20/images/329921619863', '万般留恋', '2018-03-20', '1');
INSERT INTO `blog_img` VALUES ('5', null, '2018-03-23/images/928899641197', '2018-03-23/images/928899641197', '值支持1080', '2018-03-23', '1');

-- ----------------------------
-- Table structure for blog_like
-- ----------------------------
DROP TABLE IF EXISTS `blog_like`;
CREATE TABLE `blog_like` (
  `like_id` int(6) NOT NULL,
  `img_id` int(6) DEFAULT NULL,
  `like_count` int(7) DEFAULT NULL,
  `like_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`like_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_like
-- ----------------------------

-- ----------------------------
-- Table structure for blog_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
  `user_id` int(6) NOT NULL AUTO_INCREMENT,
  `img_id` int(6) DEFAULT NULL,
  `forum_id` int(6) DEFAULT NULL,
  `like_id` int(6) DEFAULT NULL,
  `user_name` varchar(12) DEFAULT NULL,
  `user_password` varchar(12) NOT NULL,
  `user_email` varchar(20) DEFAULT NULL,
  `user_gender` char(4) DEFAULT NULL,
  `user_age` int(4) DEFAULT NULL,
  `user_date` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_user
-- ----------------------------
INSERT INTO `blog_user` VALUES ('1', null, null, null, 'admin', 'admin', '627756022@163.com', '0', '21', null);
INSERT INTO `blog_user` VALUES ('2', null, null, null, 'root', 'root', 'y627756022@163.com', null, null, null);
