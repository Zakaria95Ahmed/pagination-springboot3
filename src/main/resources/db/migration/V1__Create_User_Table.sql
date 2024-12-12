-- Flyway migration script for creating the User table
-- V1__Create_User_Table.sql

CREATE TABLE `users`
(
    `id`      BIGINT AUTO_INCREMENT PRIMARY KEY,
    `name`    VARCHAR(255) NOT NULL,
    `email`   VARCHAR(255) NOT NULL UNIQUE,
    `status`  VARCHAR(50)  DEFAULT NULL,
    `address` VARCHAR(255) DEFAULT NULL,
    `phone`   VARCHAR(20)  DEFAULT NULL,
    `image_url` VARCHAR(255) DEFAULT NULL
);
