SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `bazaerezervimit` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `bazaerezervimit` ;

-- -----------------------------------------------------
-- Table `bazaerezervimit`.`dhoma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`dhoma` (
  `iddhoma` INT NOT NULL AUTO_INCREMENT,
  `numri` VARCHAR(4) NOT NULL,
  `personat` VARCHAR(2) NOT NULL,
  `pershkrimi` VARCHAR(255) NULL,
  `karakteristika` VARCHAR(512) NULL,
  `pagesa` DECIMAL(7,2) NOT NULL,
  `dhoma_e_zene` VARCHAR(15) NOT NULL,
  `tipi_dhomave` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`iddhoma`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bazaerezervimit`.`personi`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`personi` (
  `idpersoni` INT NOT NULL AUTO_INCREMENT,
  `emer` VARCHAR(20) NOT NULL,
  `atesia` VARCHAR(20) NOT NULL,
  `amesia` VARCHAR(20) NOT NULL,
  `tipi_dokumentit` VARCHAR(15) NOT NULL,
  `num_dokumentit` VARCHAR(8) NOT NULL,
  `adresa` VARCHAR(100) NOT NULL,
  `telefoni` VARCHAR(8) NOT NULL,
  `email` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`idpersoni`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bazaerezervimit`.`klienti`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`klienti` (
  `idpersoni` INT NOT NULL,
  `kodi_klientit` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idpersoni`),
  UNIQUE INDEX `codigo_cliente_UNIQUE` (`kodi_klientit` ASC),
  CONSTRAINT `fk_personi_klienti`
    FOREIGN KEY (`idpersoni`)
    REFERENCES `bazaerezervimit`.`personi` (`idpersoni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bazaerezervimit`.`punonjes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`punonjes` (
  `idpersoni` INT NOT NULL,
  `paga` DECIMAL(7,2) NOT NULL,
  `akses` VARCHAR(15) NOT NULL,
  `login` VARCHAR(15) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  `ka_qene` VARCHAR(1) NOT NULL,
  PRIMARY KEY (`idpersoni`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC),
  CONSTRAINT `fk_personi_punonjes`
    FOREIGN KEY (`idpersoni`)
    REFERENCES `bazaerezervimit`.`personi` (`idpersoni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bazaerezervimit`.`produkti`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`produkti` (
  `idprodukti` INT NOT NULL AUTO_INCREMENT,
  `numri` VARCHAR(45) NOT NULL,
  `pershkrim` VARCHAR(255) NULL,
  `sasi` VARCHAR(20) NOT NULL,
  `ulje_cemimi` DECIMAL(7,2) NOT NULL,
  PRIMARY KEY (`idprodukti`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bazaerezervimit`.`rezervimi`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`rezervimi` (
  `idrezervimi` INT NOT NULL AUTO_INCREMENT,
  `tipi_rezervimit` VARCHAR(20) NOT NULL,
  `data_rezervimit` DATE NOT NULL,
  `dat_hyrje` DATE NOT NULL,
  `dat_dalje` DATE NOT NULL,
  `kostoja_e_strehimit` DECIMAL(7,2) NOT NULL,
  `dhome_e_zene` VARCHAR(15) NOT NULL,
  `iddhoma` INT NOT NULL,
  `idklienti` INT NOT NULL,
  `idpunonjes` INT NOT NULL,
  PRIMARY KEY (`idrezervimi`),
  INDEX `fk_rezervim_dhoma_idx` (`iddhoma` ASC),
  INDEX `fk_rezervimi_klienti_idx` (`idklienti` ASC),
  INDEX `fk_rezervimi_punonjes_idx` (`idpunonjes` ASC),
  CONSTRAINT `fk_rezervimi_dhoma`
    FOREIGN KEY (`iddhoma`)
    REFERENCES `bazaerezervimit`.`dhoma` (`iddhoma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_rezervimi_klienti`
    FOREIGN KEY (`idklienti`)
    REFERENCES `bazaerezervimit`.`klienti` (`idpersoni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_rezervimi_punonjes`
    FOREIGN KEY (`idpunonjes`)
    REFERENCES `bazaerezervimit`.`punonjes` (`idpersoni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bazaerezervimit`.`konsumatori`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`konsumatori` (
  `idkonsumatori` INT NOT NULL AUTO_INCREMENT,
  `kandidate` DECIMAL(7,2) NOT NULL,
  `ulje_cemimi` DECIMAL(7,2) NOT NULL,
  `dhome_e_zene` VARCHAR(15) NOT NULL,
  `idrezervimi` INT NOT NULL,
  `idprodukti` INT NOT NULL,
  PRIMARY KEY (`idkonsumatori`),
  INDEX `fk_konsumatori_produkti_idx` (`idprodukti` ASC),
  INDEX `fk_konsumatori_rezervimi_idx` (`idrezervimi` ASC),
  CONSTRAINT `fk_konsumatori_produkti`
    FOREIGN KEY (`idprodukti`)
    REFERENCES `bazaerezervimit`.`produkti` (`idprodukti`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_konsumatori_rezervimi`
    FOREIGN KEY (`idrezervimi`)
    REFERENCES `bazaerezervimit`.`rezervimi` (`idrezervimi`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bazaerezervimit`.`paga`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bazaerezervimit`.`paga` (
  `idpaga` INT NOT NULL AUTO_INCREMENT,
  `tipi_kuponit` VARCHAR(20) NOT NULL,
  `num_kuponit` VARCHAR(20) NOT NULL,
  `igv` DECIMAL(4,2) NOT NULL,
  `pagaa_totale` DECIMAL(7,2) NOT NULL,
  `dat_leshimi` DATE NOT NULL,
  `dat_pagese` DATE NOT NULL,
  `idrezervimi` INT NOT NULL,
  PRIMARY KEY (`idpaga`),
  INDEX `fk_paga_rezervimi_idx` (`idrezervimi` ASC),
  CONSTRAINT `fk_paga_rezervimi`
    FOREIGN KEY (`idrezervimi`)
    REFERENCES `bazaerezervimit`.`rezervimi` (`idrezervimi`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
