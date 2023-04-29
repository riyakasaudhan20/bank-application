DROP TABLE IF EXISTS cards;

CREATE TABLE `cards` (
`card_id` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`card_number` BIGINT NOT NULL,
`card_type` varchar(100) NOT NULL,
`expir_date` date DEFAULT NULL
);

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (1,98765,'CREDIT_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (1,98875,'DEBT_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (2,43785,'CREDIT_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (2,98834,'DEBT_CARD',CURDATE());