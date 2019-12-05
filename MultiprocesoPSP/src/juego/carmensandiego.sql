-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: carmensandiego
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
-- Table structure for table `casos`
--

DROP TABLE IF EXISTS `casos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `casos` (
  `idCaso` int(11) NOT NULL AUTO_INCREMENT,
  `puntosCaso` int(3) DEFAULT NULL,
  `idSospechosoFK` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCaso`),
  KEY `casos_ibfk_1` (`idSospechosoFK`),
  CONSTRAINT `casos_ibfk_1` FOREIGN KEY (`idSospechosoFK`) REFERENCES `sospechosos` (`idsospechoso`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `casos`
--

LOCK TABLES `casos` WRITE;
/*!40000 ALTER TABLE `casos` DISABLE KEYS */;
/*!40000 ALTER TABLE `casos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ciudades` (
  `idCiudad` int(11) NOT NULL AUTO_INCREMENT,
  `nombreCiudad` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `banderaCiudad` varchar(200) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `monumentoCiudad` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dineroCiudad` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `descripcionCiudad` longtext COLLATE utf8_spanish2_ci,
  `fotoCiudad` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idCiudad`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudades`
--

LOCK TABLES `ciudades` WRITE;
/*!40000 ALTER TABLE `ciudades` DISABLE KEYS */;
INSERT INTO `ciudades` VALUES (1,'Abu Dhabi','roja la franja vertical en la izquierda y verde, blanca y negra las franjas horizontales de la derecha','Sheikh Zayed','dirhams','Abu Dabhi es la capital y segunda ciudad más poblada de los Emiratos Árabes Unidos. Abu Dabhi se encuentra en una isla en forma de T al sureste del golfo Pérsico.','abudabi.jpg'),(2,'Agra','con franjas horizontales, naranja, blanca y verde, con un simbolo azul en el centro','Taj Mahal','rupias','Agra está situada a orillas del río Yamuna, en la India. Es una de las ciudades más pobladas del Estado de Uttar Pradesh y la vigésima cuarta más poblada del país.','agra.jpg'),(3,'Bangkok','con franjas horizontales, roja, blanca, azul, blanca y roja','Buda de oro','bahts','Bangkok es la capital y la ciudad más poblada de Tailandia. Aunque el nombre oficial no es Bangkok, es empleado internacionalmente para referirse a la ciudad.','bangkok.jpg'),(4,'Buenos Aires','con franjas horizontales, azul, blanca y azul, con un simbolo en el centro','El Obelisco','pesos','Buenos Aires es una ciudad de la República Argentina. Está situada en la región centro-este del país, sobre la orilla occidental del Río de la Plata, en pampeana.','buenosaires.jpg'),(5,'Ciudad de México','con franjas verticales, verde, blanca y roja, con un simbolo en el centro','Zócalo','pesos','Ciudad de México, anteriormente denominada como Distrito Federal, es una de las 32 entidades federativas. Se localiza en el Valle de México, a una altitud de 2240 m.','ciudaddemexico.jpg'),(6,'Erevan','con franjas horizontales, roja, azul y amarilla','Tsitsernakaberd','dram','Ereván, capital de Armenia, se caracteriza por su arquitectura de la época soviética. La biblioteca Matenadaran, alberga miles de manuscritos griegos y armenios.','erevan.jpg'),(7,'Londres','azul de fondo y barras rojas y blancas cruzandose','Big Ben','libras','Londres es la capital y mayor ciudad de Inglaterra y del Reino Unido. Situada a orillas del río Támesis, fue fundada por los romanos como Londinium hace dos milenios.','londres.jpg'),(8,'Luanda','con franjas horizontales, roja y negra, con un simbolo en el centro','Mausoleum of Agostinho Neto','kwanzas','Luanda, capital de Angola, ciudad portuaria ubicada en la costa occidental del sur del continente africano. Fue fundada en 1576 por el portugués Paulo Dias de Novais.','luanda.jpg'),(9,'Moscú','con franjas horizontales, blanca, azul y roja','Kremlin','rublos','Moscú es la capital y la entidad federal más poblada de Rusia. La ciudad es un importante centro político, económico, cultural y científico de Rusia y del continente.','moscu.jpg'),(10,'Nueva York','con barras rojas y blancas horizontales y un rectangulo azul con estrellas en una esquina','Estatua de la libertad','dolares','Nueva York, es la ciudad más poblada y grande de los Estados Unidos de Ámerica, del continente y del mundo. Es uno de los centros de la economía mundial.','nuevayork.jpg'),(11,'París','con franjas horizontales, azul, blanca y roja','Torre Eiffel','euros','París, capital de Francia, es una importante ciudad europea y un centro mundial de arte, moda, gastronomía y cultura. Su paisaje está entrecruzado por el río Sena.','paris.jpg'),(12,'Sidney','azul de fondo,con estrellas blancas desiguales, y un rectangulo en una esquina con barras blancas y rojas cruzandose','Casa de la Ópera','dolares','Sidney, capital de Nueva Gales del Sur, es de las ciudades más grandes de Australia. Famosa por su Casa de la Ópera junto al puerto, con un diseño con forma de velas.','sidney.jpg'),(13,'Tokio','blanca de fondo con un punto rojo','Senso-ji','yenes','Tokio, capital de Japón, mezcla lo ultramoderno y lo ultra tradicional. El santuario Shinto Meiji es conocido por su puerta altísima y los bosques circundantes.','tokio.jpg'),(14,'Xian','roja de fondo con estrellas amarillas','Guerreros de terracota','yuanes','Xi\'an, capital de Shaanti, China central. Fue llamada Chang\'an (Paz Eterna) y marca el extremo oriental de la Ruta de la Seda. Donde se encuentra el Bigmayong.','xian.jpg'),(15,'Zúrich','roja de fondo con una cruz blanca','Opernhaus','francos','Zúrich, la mayor ciudad de la Confederación Suiza. Capital del cantón de Zúrich y ubicada en el distrito de Zúrich, en la llanura central de Suiza, proxima a los Alpes.','zurich.jpg');
/*!40000 ALTER TABLE `ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugadores`
--

DROP TABLE IF EXISTS `jugadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `jugadores` (
  `idJugador` int(11) NOT NULL AUTO_INCREMENT,
  `apodoJugador` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `puntosTotalesJugador` int(6) DEFAULT NULL,
  PRIMARY KEY (`idJugador`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugadores`
--

LOCK TABLES `jugadores` WRITE;
/*!40000 ALTER TABLE `jugadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `jugadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sospechosos`
--

DROP TABLE IF EXISTS `sospechosos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sospechosos` (
  `idSospechoso` int(11) NOT NULL AUTO_INCREMENT,
  `nombreSospechoso` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `generoSospechoso` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `colorPeloSospechoso` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `hobbySospechoso` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `ocupacionSospechoso` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `cocheSospechoso` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `caracteristicaSospechoso` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idSospechoso`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sospechosos`
--

LOCK TABLES `sospechosos` WRITE;
/*!40000 ALTER TABLE `sospechosos` DISABLE KEYS */;
INSERT INTO `sospechosos` VALUES (1,'Carmen Sandiego','femenino','castaño','tenis','Antigua agente del servicio de espionaje de Mónaco','un descapotable','una joya muy cara'),(2,'Merey LaRoc','femenino','castaño','alpinismo','Bailarina profesional de aerobic','una limusina','una joya muy cara'),(3,'Dazzle Annie Nonker','femenino','rubio','tenis','Propietaria de un bar de yogurt','una limusina','un tatuaje'),(4,'Lady Agatha Wayland','femenino','rojizo','tenis','Lectora de novelas de misterio','un deportivo','un anillo muy caro'),(5,'Katherine Drib','femenino','castaño','alpinismo','Piloto de carreras de moto-ciclismo','una moto','un tatuaje'),(6,'Len \'Red\' Bulk','masculino','rojizo','alpinismo','Ex-jugador de hockey profesional','un descapotable','un tatuaje'),(7,'Scar Graynolt','masculino','rojizo','croquet','Guitarrista de Folk','una limusina','un anillo muy caro'),(8,'Ihor Ihorovitch','masculino','rubio','croquet','Aspirante al trono zarista','una limusina','un tatuaje'),(9,'Fast Eddie B','masculino','negro','croquet','Jugador mundial de croquet','un descapotable','una joya muy cara'),(10,'Nick Brunck','masculino','negro','alpinismo','Ex-detective privado','una moto','un anillo muy caro'),(11,'Amanda Lockheart','femenino','negro','croquet','Ex-bombera','una moto','una joya muy cara'),(12,'Kevin Richard','masculino','castaño','alpinismo','Profesor de quimica','un deportivo','una joya muy cara'),(13,'Jacob Capaldi','masculino','negro','tenis','Modista en París','una moto','una joya muy cara'),(14,'Matt Smith','masculino','rubio','tenis','Ex-vigilante de museos','un deportivo','un tatuaje'),(15,'David Tenant','masculino','castaño','tenis','Piloto de avión','un descapotable','un anillo muy caro'),(16,'Emily Pond','femenino','negro','croquet','Ex-policia de trafico','un deportivo','un anillo muy caro'),(17,'Sophia Stark','femenino','rubio','croquet','Administrativa en una gram empresa','un descapotable','un tatuaje'),(18,'Hannah Russo','femenino','rojizo','alpinismo','Ex-politica','una moto','un anillo muy caro');
/*!40000 ALTER TABLE `sospechosos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viajes`
--

DROP TABLE IF EXISTS `viajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `viajes` (
  `idViaje` int(11) NOT NULL AUTO_INCREMENT,
  `idCasoFK` int(11) DEFAULT NULL,
  `idCiudadActualFK` int(11) DEFAULT NULL,
  `idCiudad1FK` int(11) DEFAULT NULL,
  `idCiudad2FK` int(11) DEFAULT NULL,
  `idCiudad3FK` int(11) DEFAULT NULL,
  PRIMARY KEY (`idViaje`),
  KEY `viajes_ibfk_1` (`idCasoFK`),
  KEY `viajes_ibfk_2` (`idCiudadActualFK`),
  KEY `viajes_ibfk_3` (`idCiudad1FK`),
  KEY `viajes_ibfk_4` (`idCiudad2FK`),
  CONSTRAINT `viajes_ibfk_1` FOREIGN KEY (`idCasoFK`) REFERENCES `casos` (`idcaso`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `viajes_ibfk_2` FOREIGN KEY (`idCiudadActualFK`) REFERENCES `ciudades` (`idciudad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `viajes_ibfk_3` FOREIGN KEY (`idCiudad1FK`) REFERENCES `ciudades` (`idciudad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `viajes_ibfk_4` FOREIGN KEY (`idCiudad2FK`) REFERENCES `ciudades` (`idciudad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viajes`
--

LOCK TABLES `viajes` WRITE;
/*!40000 ALTER TABLE `viajes` DISABLE KEYS */;
/*!40000 ALTER TABLE `viajes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-17 22:58:57
