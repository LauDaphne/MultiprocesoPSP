-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: gestion
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clases`
--

DROP TABLE IF EXISTS `clases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `clases` (
  `idClase` int(11) NOT NULL AUTO_INCREMENT,
  `nivelClase` varchar(20) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `horaClase` int(2) DEFAULT NULL,
  `precioClase` decimal(4,2) DEFAULT NULL,
  `idProfesorFK` int(11) DEFAULT NULL,
  PRIMARY KEY (`idClase`),
  KEY `clases_ibfk_1` (`idProfesorFK`),
  CONSTRAINT `clases_ibfk_1` FOREIGN KEY (`idProfesorFK`) REFERENCES `profesores` (`idprofesor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clases`
--

LOCK TABLES `clases` WRITE;
/*!40000 ALTER TABLE `clases` DISABLE KEYS */;
/*!40000 ALTER TABLE `clases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `profesores` (
  `idProfesor` int(11) NOT NULL AUTO_INCREMENT,
  `nombreProfesor` varchar(20) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido1Profesor` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido2Profesor` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dniProfesor` int(8) DEFAULT NULL,
  `nivelProfesor` varchar(10) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idProfesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socios`
--

DROP TABLE IF EXISTS `socios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `socios` (
  `idSocio` int(11) NOT NULL AUTO_INCREMENT,
  `nombreSocio` varchar(20) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido1Socio` varchar(20) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido2Socio` varchar(20) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dniSocio` int(8) DEFAULT NULL,
  `telefonoSocio` int(9) DEFAULT NULL,
  PRIMARY KEY (`idSocio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socios`
--

LOCK TABLES `socios` WRITE;
/*!40000 ALTER TABLE `socios` DISABLE KEYS */;
/*!40000 ALTER TABLE `socios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudes`
--

DROP TABLE IF EXISTS `solicitudes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `solicitudes` (
  `idSolicitud` int(11) NOT NULL AUTO_INCREMENT,
  `idClaseFK` int(11) DEFAULT NULL,
  `idSocioFK` int(11) DEFAULT NULL,
  PRIMARY KEY (`idSolicitud`),
  KEY `solicitudes_ibfk_1` (`idClaseFK`),
  KEY `solicitudes_ibfk_2` (`idSocioFK`),
  CONSTRAINT `solicitudes_ibfk_1` FOREIGN KEY (`idClaseFK`) REFERENCES `clases` (`idclase`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `solicitudes_ibfk_2` FOREIGN KEY (`idSocioFK`) REFERENCES `socios` (`idsocio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudes`
--

LOCK TABLES `solicitudes` WRITE;
/*!40000 ALTER TABLE `solicitudes` DISABLE KEYS */;
/*!40000 ALTER TABLE `solicitudes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `tipoUsuario` int(2) DEFAULT NULL,
  `nombreUsuario` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `claveUsuario` varchar(300) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `emailUsuario` varchar(200) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,0,'Laura','88245df90ff712430e642f3a7e4bfa58','laura.arnolfini@gmail.com'),(2,1,'Jose','88245df90ff712430e642f3a7e4bfa58','jm.platero@hotmail.com'),(3,0,'Admin','e3afed0047b08059d0fada10f400c1e5','admin@gmail.com'),(4,1,'User','8f9bfe9d1345237cb3b2b205864da075','user@gmail.com');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-08 20:41:07
