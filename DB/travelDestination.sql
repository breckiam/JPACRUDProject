-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema traveldb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `traveldb` ;

-- -----------------------------------------------------
-- Schema traveldb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `traveldb` DEFAULT CHARACTER SET utf8 ;
USE `traveldb` ;

-- -----------------------------------------------------
-- Table `destination`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `destination` ;

CREATE TABLE IF NOT EXISTS `destination` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `country_name` VARCHAR(100) NOT NULL,
  `state_region` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `rating` TINYINT(5) NULL,
  `top_attractions` VARCHAR(2000) NULL,
  `has_traveled` TINYINT(1) NULL DEFAULT 0,
  `arrival_date` DATE NULL,
  `departure_date` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS traveluser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'traveluser'@'localhost' IDENTIFIED BY 'traveluser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'traveluser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `destination`
-- -----------------------------------------------------
START TRANSACTION;
USE `traveldb`;
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (1, 'United States', 'Colorado', 'Brighton', 3, NULL, 1, NULL, NULL);
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (2, ' Dominican Republic', 'La Altagracia', 'Punta Cana', 4, 'Resorts, Ocean, Excursions', 1, NULL, NULL);
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (3, 'United States', 'Hawaii', 'Waikoloa Beach', 5, 'Resorts, Ocean, Mountains, Excursions', 1, '2021-07-25', '2021-08-03');
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (4, 'United States', 'Texas', 'Austin', 3, 'City, Swimming, Nightlife', 1, NULL, NULL);
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (5, 'Costa Rica', 'Guanacaste', 'Tamarindo', NULL, NULL, 0, NULL, NULL);
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (6, 'Panama', 'Panamá Province', 'Panama City', NULL, NULL, 0, NULL, NULL);
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (7, 'Greece', 'Cyclades complex', 'mykonos', NULL, NULL, 0, NULL, NULL);
INSERT INTO `destination` (`id`, `country_name`, `state_region`, `city`, `rating`, `top_attractions`, `has_traveled`, `arrival_date`, `departure_date`) VALUES (8, 'Belize', 'Ambergris Caye', 'san pedro', NULL, NULL, 0, '2022-07-18', '2022-07-28');

COMMIT;

