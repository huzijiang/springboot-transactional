/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云-MySQL8.0-物理机
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : 47.118.51.155:3306
 Source Schema         : spring_tansiactional

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 10/07/2022 18:00:40
*/

create database spring_tansiactional;




SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
                           `id` int NOT NULL,
                           `name` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL,
                           `age` int DEFAULT NULL,
                           `teacher_id` int DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (1, 'lilei', 21, 1);
COMMIT;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
                           `id` int NOT NULL,
                           `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
                           `age` int DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES (2, 'ma.jieke', 56);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
