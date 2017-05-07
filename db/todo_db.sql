DROP DATABASE IF EXISTS `todo`;

CREATE DATABASE IF NOT EXISTS `todo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE todo;

-- need to drop user because of bug in mysql - http://stackoverflow.com/a/6332971
-- drop user 'pikapika'@'%';
-- FLUSH privileges;
-- GRANT ALL ON 
-- non deprecated create instead of deprecated grant
 CREATE USER 'todo'@'%' IDENTIFIED BY '9Hors3M4nB0j4ck12';
 GRANT ALL privileges ON todo.* TO 'todo'@'%'IDENTIFIED BY '9Hors3M4nB0j4ck12';
 grant all privileges on todo.* to 'todo'@'localhost' identified by '9Hors3M4nB0j4ck12';

-- for development, just run all these and it will work
 DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(20000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;



INSERT INTO `task`
(`task_name`)
VALUES
("Buy milk");

INSERT INTO `task`
(`task_name`)
VALUES
("Take jacket to drycleaners");


INSERT INTO `task`
(`task_name`)
VALUES
("Visit granny");


INSERT INTO `task`
(`task_name`)
VALUES
("Take flowers to graveyard");

INSERT INTO `task`
(`task_name`)
VALUES
("Go on rampage and shoot police");

INSERT INTO `task`
(`task_name`)
VALUES
("Destroy all evidence of this list");




