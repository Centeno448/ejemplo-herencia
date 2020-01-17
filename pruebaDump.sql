-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pruebaHerencia
-- ------------------------------------------------------
-- Server version	5.7.29-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Almacenamiento`
--

DROP TABLE IF EXISTS `Almacenamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Almacenamiento` (
  `id_Almacenamiento` int(11) NOT NULL AUTO_INCREMENT,
  `licencia` varchar(45) CHARACTER SET latin1 NOT NULL,
  `id_EquipoFisico` int(11) NOT NULL,
  PRIMARY KEY (`id_Almacenamiento`),
  KEY `FK_idEquipoFisico_Almacenamiento_idx` (`id_EquipoFisico`),
  CONSTRAINT `FK_idEquipoFisico_Almacenamiento` FOREIGN KEY (`id_EquipoFisico`) REFERENCES `EquipoFisico` (`id_EquipoFisico`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Almacenamiento`
--

LOCK TABLES `Almacenamiento` WRITE;
/*!40000 ALTER TABLE `Almacenamiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `Almacenamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ambito`
--

DROP TABLE IF EXISTS `Ambito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Ambito` (
  `id_Ambito` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_Ambito`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ambito`
--

LOCK TABLES `Ambito` WRITE;
/*!40000 ALTER TABLE `Ambito` DISABLE KEYS */;
INSERT INTO `Ambito` VALUES (1,'A');
/*!40000 ALTER TABLE `Ambito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AreaFuncional`
--

DROP TABLE IF EXISTS `AreaFuncional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `AreaFuncional` (
  `id_AreaFuncional` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_AreaFuncional`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AreaFuncional`
--

LOCK TABLES `AreaFuncional` WRITE;
/*!40000 ALTER TABLE `AreaFuncional` DISABLE KEYS */;
INSERT INTO `AreaFuncional` VALUES (1,'Area de Prueba');
/*!40000 ALTER TABLE `AreaFuncional` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Clasificacion`
--

DROP TABLE IF EXISTS `Clasificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Clasificacion` (
  `id_Clasificacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_Clasificacion`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Clasificacion`
--

LOCK TABLES `Clasificacion` WRITE;
/*!40000 ALTER TABLE `Clasificacion` DISABLE KEYS */;
INSERT INTO `Clasificacion` VALUES (1,'a');
/*!40000 ALTER TABLE `Clasificacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cuchilla`
--

DROP TABLE IF EXISTS `Cuchilla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Cuchilla` (
  `id_Cuchilla` int(11) NOT NULL AUTO_INCREMENT,
  `ip` varchar(45) CHARACTER SET utf8 NOT NULL,
  `id_EquipoFisico` int(11) NOT NULL,
  PRIMARY KEY (`id_Cuchilla`),
  KEY `FK_idEquipoFisico_Cuchilla_idx` (`id_EquipoFisico`),
  CONSTRAINT `FK_idEquipoFisico_Cuchilla` FOREIGN KEY (`id_EquipoFisico`) REFERENCES `EquipoFisico` (`id_EquipoFisico`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cuchilla`
--

LOCK TABLES `Cuchilla` WRITE;
/*!40000 ALTER TABLE `Cuchilla` DISABLE KEYS */;
/*!40000 ALTER TABLE `Cuchilla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DataCenter`
--

DROP TABLE IF EXISTS `DataCenter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `DataCenter` (
  `id_DataCenter` int(11) NOT NULL AUTO_INCREMENT,
  `sector` varchar(45) CHARACTER SET latin1 NOT NULL,
  `area` varchar(45) CHARACTER SET latin1 NOT NULL,
  `callePrincipal` varchar(200) CHARACTER SET latin1 NOT NULL,
  `calleSecundaria` varchar(200) CHARACTER SET latin1 NOT NULL,
  `numero` varchar(45) CHARACTER SET latin1 NOT NULL,
  `descripcion` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`id_DataCenter`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DataCenter`
--

LOCK TABLES `DataCenter` WRITE;
/*!40000 ALTER TABLE `DataCenter` DISABLE KEYS */;
INSERT INTO `DataCenter` VALUES (1,'A','A','CALLEA','CALLEB','123','ABCD');
/*!40000 ALTER TABLE `DataCenter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Dominio`
--

DROP TABLE IF EXISTS `Dominio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Dominio` (
  `id_Dominio` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_Dominio`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Dominio`
--

LOCK TABLES `Dominio` WRITE;
/*!40000 ALTER TABLE `Dominio` DISABLE KEYS */;
INSERT INTO `Dominio` VALUES (1,'1');
/*!40000 ALTER TABLE `Dominio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Equipo`
--

DROP TABLE IF EXISTS `Equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Equipo` (
  `id_Equipo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `host` varchar(45) CHARACTER SET latin1 NOT NULL,
  `direccionMAC` varchar(45) CHARACTER SET latin1 NOT NULL,
  `memoria` varchar(45) CHARACTER SET latin1 NOT NULL,
  `ip` varchar(45) CHARACTER SET latin1 NOT NULL,
  `capacidad` varchar(45) CHARACTER SET latin1 NOT NULL,
  `descripcion` varchar(120) CHARACTER SET latin1 DEFAULT NULL,
  `tipoEquipo` varchar(100) CHARACTER SET latin1 NOT NULL,
  `id_DataCenter` int(11) NOT NULL,
  `id_Procesador` int(11) NOT NULL,
  `id_SistemaOperativo` int(11) NOT NULL,
  PRIMARY KEY (`id_Equipo`),
  KEY `FK_idDataCenter_DataCenter_idx` (`id_DataCenter`),
  KEY `FK_idSistemaOperativo_SistemaOperativo_idx` (`id_SistemaOperativo`),
  KEY `FK_idProcesador_Procesador_idx` (`id_Procesador`),
  CONSTRAINT `FK_idDataCenter_DataCenter` FOREIGN KEY (`id_DataCenter`) REFERENCES `DataCenter` (`id_DataCenter`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idProcesador_Procesador` FOREIGN KEY (`id_Procesador`) REFERENCES `Procesador` (`id_Procesador`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idSistemaOperativo_SistemaOperativo` FOREIGN KEY (`id_SistemaOperativo`) REFERENCES `SistemaOperativo` (`id_SistemaOperativo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Equipo`
--

LOCK TABLES `Equipo` WRITE;
/*!40000 ALTER TABLE `Equipo` DISABLE KEYS */;
INSERT INTO `Equipo` VALUES (1,'Equipo de Prueba','1','1','1','1','1','1','1',1,1,1);
/*!40000 ALTER TABLE `Equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EquipoFisico`
--

DROP TABLE IF EXISTS `EquipoFisico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `EquipoFisico` (
  `id_EquipoFisico` int(11) NOT NULL AUTO_INCREMENT,
  `modelo` varchar(45) CHARACTER SET latin1 NOT NULL,
  `energia` varchar(45) CHARACTER SET latin1 NOT NULL,
  `disco` varchar(45) CHARACTER SET latin1 NOT NULL,
  `id_Equipo` int(11) NOT NULL,
  PRIMARY KEY (`id_EquipoFisico`),
  KEY `FK_idEquipo_EquipoFisico_idx` (`id_Equipo`),
  CONSTRAINT `FK_idEquipo_EquipoFisico` FOREIGN KEY (`id_Equipo`) REFERENCES `Equipo` (`id_Equipo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EquipoFisico`
--

LOCK TABLES `EquipoFisico` WRITE;
/*!40000 ALTER TABLE `EquipoFisico` DISABLE KEYS */;
/*!40000 ALTER TABLE `EquipoFisico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EquipoVirtual`
--

DROP TABLE IF EXISTS `EquipoVirtual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `EquipoVirtual` (
  `id_EquipoVirtual` int(11) NOT NULL AUTO_INCREMENT,
  `id_Cuchilla` int(11) NOT NULL,
  `id_Equipo` int(11) NOT NULL,
  PRIMARY KEY (`id_EquipoVirtual`),
  KEY `FK_idEquipo_EquipoVirtual_idx` (`id_Equipo`),
  CONSTRAINT `FK_idEquipo_EquipoVirtual` FOREIGN KEY (`id_Equipo`) REFERENCES `Equipo` (`id_Equipo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EquipoVirtual`
--

LOCK TABLES `EquipoVirtual` WRITE;
/*!40000 ALTER TABLE `EquipoVirtual` DISABLE KEYS */;
/*!40000 ALTER TABLE `EquipoVirtual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Fabricante`
--

DROP TABLE IF EXISTS `Fabricante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Fabricante` (
  `id_Fabricante` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(120) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id_Fabricante`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Fabricante`
--

LOCK TABLES `Fabricante` WRITE;
/*!40000 ALTER TABLE `Fabricante` DISABLE KEYS */;
INSERT INTO `Fabricante` VALUES (1,'Fabricante de Prueba');
/*!40000 ALTER TABLE `Fabricante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Funcionario`
--

DROP TABLE IF EXISTS `Funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Funcionario` (
  `id_Funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(120) CHARACTER SET latin1 NOT NULL,
  `password` varchar(120) CHARACTER SET latin1 NOT NULL,
  `tipo` varchar(50) CHARACTER SET latin1 NOT NULL,
  `id_Persona` int(11) NOT NULL,
  `id_AreaFuncional` int(11) NOT NULL,
  PRIMARY KEY (`id_Funcionario`),
  KEY `FK_idPersona_Persona_idx` (`id_Persona`),
  KEY `FK_idArea_Funcionario_idx` (`id_AreaFuncional`),
  CONSTRAINT `FK_idArea_Funcionario` FOREIGN KEY (`id_AreaFuncional`) REFERENCES `AreaFuncional` (`id_AreaFuncional`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idPersona_Persona` FOREIGN KEY (`id_Persona`) REFERENCES `Persona` (`id_Persona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Funcionario`
--

LOCK TABLES `Funcionario` WRITE;
/*!40000 ALTER TABLE `Funcionario` DISABLE KEYS */;
INSERT INTO `Funcionario` VALUES (1,'admin','admin','admin',13,1),(2,'norm','norm','norm',14,1);
/*!40000 ALTER TABLE `Funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `InstanciaBaseDeDatos`
--

DROP TABLE IF EXISTS `InstanciaBaseDeDatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `InstanciaBaseDeDatos` (
  `id_InstanciaBaseDeDatos` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(120) NOT NULL,
  `id_MotorBaseDeDatos` int(11) NOT NULL,
  `id_Plataforma` int(11) NOT NULL,
  PRIMARY KEY (`id_InstanciaBaseDeDatos`),
  KEY `FK_idMotor_Instancia_idx` (`id_MotorBaseDeDatos`),
  KEY `FK_idPlataforma_Instancia_idx` (`id_Plataforma`),
  CONSTRAINT `FK_idMotor_Instancia` FOREIGN KEY (`id_MotorBaseDeDatos`) REFERENCES `MotorBaseDeDatos` (`id_MotorBaseDeDatos`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idPlataforma_Instancia` FOREIGN KEY (`id_Plataforma`) REFERENCES `Plataforma` (`id_Plataforma`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `InstanciaBaseDeDatos`
--

LOCK TABLES `InstanciaBaseDeDatos` WRITE;
/*!40000 ALTER TABLE `InstanciaBaseDeDatos` DISABLE KEYS */;
/*!40000 ALTER TABLE `InstanciaBaseDeDatos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Lenguaje`
--

DROP TABLE IF EXISTS `Lenguaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Lenguaje` (
  `id_Lenguaje` int(11) NOT NULL AUTO_INCREMENT,
  `nombreLenguaje` varchar(100) CHARACTER SET latin1 NOT NULL,
  `framework` varchar(100) CHARACTER SET latin1 NOT NULL,
  `frontEnd` varchar(100) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_Lenguaje`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lenguaje`
--

LOCK TABLES `Lenguaje` WRITE;
/*!40000 ALTER TABLE `Lenguaje` DISABLE KEYS */;
INSERT INTO `Lenguaje` VALUES (1,'a','a','a');
/*!40000 ALTER TABLE `Lenguaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MotorBaseDeDatos`
--

DROP TABLE IF EXISTS `MotorBaseDeDatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `MotorBaseDeDatos` (
  `id_MotorBaseDeDatos` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `version` varchar(30) NOT NULL,
  `id_Equipo` int(11) NOT NULL,
  PRIMARY KEY (`id_MotorBaseDeDatos`),
  KEY `FK_idEquipo_Equipo_idx` (`id_Equipo`),
  CONSTRAINT `FK_idEquipo_Equipo` FOREIGN KEY (`id_Equipo`) REFERENCES `Equipo` (`id_Equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MotorBaseDeDatos`
--

LOCK TABLES `MotorBaseDeDatos` WRITE;
/*!40000 ALTER TABLE `MotorBaseDeDatos` DISABLE KEYS */;
/*!40000 ALTER TABLE `MotorBaseDeDatos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `NavegadorWeb`
--

DROP TABLE IF EXISTS `NavegadorWeb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `NavegadorWeb` (
  `id_NavegadorWeb` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(120) CHARACTER SET utf8 NOT NULL,
  `version` varchar(50) CHARACTER SET utf8 NOT NULL,
  `id_Fabricante` int(11) NOT NULL,
  PRIMARY KEY (`id_NavegadorWeb`),
  KEY `FK_NavegadorWeb_Fabricante_idx` (`id_Fabricante`),
  CONSTRAINT `FK_NavegadorWeb_Fabricante` FOREIGN KEY (`id_Fabricante`) REFERENCES `Fabricante` (`id_Fabricante`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `NavegadorWeb`
--

LOCK TABLES `NavegadorWeb` WRITE;
/*!40000 ALTER TABLE `NavegadorWeb` DISABLE KEYS */;
/*!40000 ALTER TABLE `NavegadorWeb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Persona`
--

DROP TABLE IF EXISTS `Persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Persona` (
  `id_Persona` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` varchar(11) CHARACTER SET latin1 NOT NULL,
  `nombre` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_Persona`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Persona`
--

LOCK TABLES `Persona` WRITE;
/*!40000 ALTER TABLE `Persona` DISABLE KEYS */;
INSERT INTO `Persona` VALUES (13,'10','Diego'),(14,'20','Juan');
/*!40000 ALTER TABLE `Persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Plataforma`
--

DROP TABLE IF EXISTS `Plataforma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Plataforma` (
  `id_Plataforma` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `tamanio` decimal(10,2) DEFAULT NULL,
  `usoDisco` decimal(5,2) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT '1',
  `id_TipoPlataforma` int(11) NOT NULL,
  `id_Admin` int(11) NOT NULL,
  `id_Operador` int(11) NOT NULL,
  `id_Fabricante` int(11) NOT NULL,
  `id_Equipo` int(11) NOT NULL,
  `id_Software` int(11) NOT NULL,
  PRIMARY KEY (`id_Plataforma`),
  KEY `FK_Plataforma_Admin_idx` (`id_Admin`),
  KEY `FK_Plataforma_Operador_idx` (`id_Operador`),
  KEY `FK_Plataforma_Fabricante_idx` (`id_Fabricante`),
  KEY `FK_Plataforma_Equipo_idx` (`id_Equipo`),
  KEY `FK_Plataforma_Software_idx` (`id_Software`),
  KEY `FK_Plataforma_TipoPlataforma_idx` (`id_TipoPlataforma`),
  CONSTRAINT `FK_Plataforma_Admin` FOREIGN KEY (`id_Admin`) REFERENCES `Funcionario` (`id_Funcionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Plataforma_Equipo` FOREIGN KEY (`id_Equipo`) REFERENCES `Equipo` (`id_Equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Plataforma_Fabricante` FOREIGN KEY (`id_Fabricante`) REFERENCES `Fabricante` (`id_Fabricante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Plataforma_Operador` FOREIGN KEY (`id_Operador`) REFERENCES `Funcionario` (`id_Funcionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Plataforma_Software` FOREIGN KEY (`id_Software`) REFERENCES `Software` (`id_Software`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Plataforma_TipoPlataforma` FOREIGN KEY (`id_TipoPlataforma`) REFERENCES `TipoPlataforma` (`id_TipoPlataforma`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Plataforma`
--

LOCK TABLES `Plataforma` WRITE;
/*!40000 ALTER TABLE `Plataforma` DISABLE KEYS */;
INSERT INTO `Plataforma` VALUES (1,'a',1.00,1.00,1,1,1,2,1,1,1);
/*!40000 ALTER TABLE `Plataforma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Procesador`
--

DROP TABLE IF EXISTS `Procesador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Procesador` (
  `id_Procesador` int(11) NOT NULL AUTO_INCREMENT,
  `tipoTecnologia` varchar(100) CHARACTER SET latin1 NOT NULL,
  `nucleo` varchar(45) CHARACTER SET latin1 NOT NULL,
  `cache` varchar(45) CHARACTER SET latin1 NOT NULL,
  `velocidad` varchar(45) CHARACTER SET latin1 NOT NULL,
  `memoria` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_Procesador`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Procesador`
--

LOCK TABLES `Procesador` WRITE;
/*!40000 ALTER TABLE `Procesador` DISABLE KEYS */;
INSERT INTO `Procesador` VALUES (1,'asd','asd','asd','asd','asd');
/*!40000 ALTER TABLE `Procesador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Requerimiento`
--

DROP TABLE IF EXISTS `Requerimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Requerimiento` (
  `id_Requerimiento` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(45) CHARACTER SET latin1 NOT NULL,
  `tipo` varchar(45) CHARACTER SET latin1 NOT NULL,
  `prioridad` varchar(45) CHARACTER SET latin1 NOT NULL,
  `descripcion` varchar(45) CHARACTER SET latin1 NOT NULL,
  `id_Solicitante` int(11) NOT NULL,
  `id_Aprobador` int(11) NOT NULL,
  PRIMARY KEY (`id_Requerimiento`),
  KEY `FK_idSolicitante_Funcionario_idx` (`id_Solicitante`),
  KEY `FK_idAprobador_idx` (`id_Aprobador`),
  CONSTRAINT `FK_idAprobador` FOREIGN KEY (`id_Aprobador`) REFERENCES `Funcionario` (`id_Funcionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idSolicitante_Funcionario` FOREIGN KEY (`id_Solicitante`) REFERENCES `Funcionario` (`id_Funcionario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Requerimiento`
--

LOCK TABLES `Requerimiento` WRITE;
/*!40000 ALTER TABLE `Requerimiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `Requerimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Respaldo`
--

DROP TABLE IF EXISTS `Respaldo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Respaldo` (
  `id_Respaldo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(100) NOT NULL,
  `periodicidad` varchar(100) NOT NULL,
  `tiempoHistorico` varchar(100) NOT NULL,
  `lugar` varchar(100) NOT NULL,
  `observacion` varchar(45) DEFAULT NULL,
  `id_Plataforma` int(11) NOT NULL,
  PRIMARY KEY (`id_Respaldo`),
  KEY `FK_Respaldo_Plataforma_idx` (`id_Plataforma`),
  CONSTRAINT `FK_Respaldo_Plataforma` FOREIGN KEY (`id_Plataforma`) REFERENCES `Plataforma` (`id_Plataforma`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Respaldo`
--

LOCK TABLES `Respaldo` WRITE;
/*!40000 ALTER TABLE `Respaldo` DISABLE KEYS */;
/*!40000 ALTER TABLE `Respaldo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ServidorDeAplicaciones`
--

DROP TABLE IF EXISTS `ServidorDeAplicaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ServidorDeAplicaciones` (
  `id_ServidorDeAplicaciones` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(120) CHARACTER SET utf8 NOT NULL,
  `id_Plataforma` int(11) NOT NULL,
  PRIMARY KEY (`id_ServidorDeAplicaciones`),
  KEY `FK_Servidor_Plataforma_idx` (`id_Plataforma`),
  CONSTRAINT `FK_Servidor_Plataforma` FOREIGN KEY (`id_Plataforma`) REFERENCES `Plataforma` (`id_Plataforma`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ServidorDeAplicaciones`
--

LOCK TABLES `ServidorDeAplicaciones` WRITE;
/*!40000 ALTER TABLE `ServidorDeAplicaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `ServidorDeAplicaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SistemaOperativo`
--

DROP TABLE IF EXISTS `SistemaOperativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SistemaOperativo` (
  `id_SistemaOperativo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) CHARACTER SET latin1 NOT NULL,
  `version` varchar(45) CHARACTER SET latin1 NOT NULL,
  `arquitectura` varchar(45) CHARACTER SET latin1 NOT NULL,
  `licencia` varchar(100) CHARACTER SET latin1 NOT NULL,
  `plataforma` varchar(45) CHARACTER SET latin1 NOT NULL,
  `id_Fabricante` int(11) NOT NULL,
  PRIMARY KEY (`id_SistemaOperativo`),
  KEY `FK_SO_Fabricante_idx` (`id_Fabricante`),
  CONSTRAINT `FK_SO_Fabricante` FOREIGN KEY (`id_Fabricante`) REFERENCES `Fabricante` (`id_Fabricante`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SistemaOperativo`
--

LOCK TABLES `SistemaOperativo` WRITE;
/*!40000 ALTER TABLE `SistemaOperativo` DISABLE KEYS */;
INSERT INTO `SistemaOperativo` VALUES (1,'asd','1','asd','123','123',1);
/*!40000 ALTER TABLE `SistemaOperativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Software`
--

DROP TABLE IF EXISTS `Software`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Software` (
  `id_Software` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) CHARACTER SET latin1 NOT NULL,
  `web` tinyint(1) NOT NULL DEFAULT '1',
  `version` varchar(45) CHARACTER SET latin1 NOT NULL,
  `descripcion` varchar(45) CHARACTER SET latin1 NOT NULL,
  `path` varchar(120) CHARACTER SET latin1 NOT NULL,
  `numUsers` int(11) NOT NULL,
  `id_Lenguaje` int(11) NOT NULL,
  `id_Dominio` int(11) NOT NULL,
  `id_Ambito` int(11) NOT NULL,
  `id_AreaFuncional` int(11) NOT NULL,
  `id_Clasificacion` int(11) NOT NULL,
  PRIMARY KEY (`id_Software`),
  KEY `FK_Software_Clasificacion_idx` (`id_Clasificacion`),
  KEY `FK_idAmbito_Software_idx` (`id_Ambito`),
  KEY `FK_idArea_Software_idx` (`id_AreaFuncional`),
  KEY `FK_idDominio_Software_idx` (`id_Dominio`),
  KEY `FK_idLenguaje_Software_idx` (`id_Lenguaje`),
  CONSTRAINT `FK_Software_Clasificacion` FOREIGN KEY (`id_Clasificacion`) REFERENCES `Clasificacion` (`id_Clasificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idAmbito_Software` FOREIGN KEY (`id_Ambito`) REFERENCES `Ambito` (`id_Ambito`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idArea_Software` FOREIGN KEY (`id_AreaFuncional`) REFERENCES `AreaFuncional` (`id_AreaFuncional`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idDominio_Software` FOREIGN KEY (`id_Dominio`) REFERENCES `Dominio` (`id_Dominio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_idLenguaje_Software` FOREIGN KEY (`id_Lenguaje`) REFERENCES `Lenguaje` (`id_Lenguaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Software`
--

LOCK TABLES `Software` WRITE;
/*!40000 ALTER TABLE `Software` DISABLE KEYS */;
INSERT INTO `Software` VALUES (1,'Software de Prueba',1,'1','1','1',10,1,1,1,1,1);
/*!40000 ALTER TABLE `Software` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SoftwareXEquipo`
--

DROP TABLE IF EXISTS `SoftwareXEquipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SoftwareXEquipo` (
  `id_SoftwareXEquipo` int(11) NOT NULL AUTO_INCREMENT,
  `id_Software` int(11) NOT NULL,
  `id_Equipo` int(11) NOT NULL,
  PRIMARY KEY (`id_SoftwareXEquipo`),
  KEY `FK_SoftwareEquipo_Equipo_idx` (`id_Equipo`),
  KEY `FK_SoftwareEquipo_Software` (`id_Software`),
  CONSTRAINT `FK_SoftwareEquipo_Equipo` FOREIGN KEY (`id_Equipo`) REFERENCES `Equipo` (`id_Equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_SoftwareEquipo_Software` FOREIGN KEY (`id_Software`) REFERENCES `Software` (`id_Software`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SoftwareXEquipo`
--

LOCK TABLES `SoftwareXEquipo` WRITE;
/*!40000 ALTER TABLE `SoftwareXEquipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `SoftwareXEquipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SoftwareXNavegadorWeb`
--

DROP TABLE IF EXISTS `SoftwareXNavegadorWeb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SoftwareXNavegadorWeb` (
  `id_SoftwareXNavegadorWeb` int(11) NOT NULL AUTO_INCREMENT,
  `id_Software` int(11) NOT NULL,
  `id_NavegadorWeb` int(11) NOT NULL,
  PRIMARY KEY (`id_SoftwareXNavegadorWeb`),
  KEY `FK_SxN_Software_idx` (`id_Software`),
  KEY `FK_SxN_NavegadorWeb_idx` (`id_NavegadorWeb`),
  CONSTRAINT `FK_SxN_NavegadorWeb` FOREIGN KEY (`id_NavegadorWeb`) REFERENCES `NavegadorWeb` (`id_NavegadorWeb`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_SxN_Software` FOREIGN KEY (`id_Software`) REFERENCES `Software` (`id_Software`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SoftwareXNavegadorWeb`
--

LOCK TABLES `SoftwareXNavegadorWeb` WRITE;
/*!40000 ALTER TABLE `SoftwareXNavegadorWeb` DISABLE KEYS */;
/*!40000 ALTER TABLE `SoftwareXNavegadorWeb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoPlataforma`
--

DROP TABLE IF EXISTS `TipoPlataforma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `TipoPlataforma` (
  `id_TipoPlataforma` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(120) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id_TipoPlataforma`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoPlataforma`
--

LOCK TABLES `TipoPlataforma` WRITE;
/*!40000 ALTER TABLE `TipoPlataforma` DISABLE KEYS */;
INSERT INTO `TipoPlataforma` VALUES (1,'servidor'),(2,'instancia');
/*!40000 ALTER TABLE `TipoPlataforma` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-16 22:58:30
