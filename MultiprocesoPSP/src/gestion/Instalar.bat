@echo off
REM Habilitar tildes y ñ
chcp 65001
echo Bienvenido al programa de instalación
REM Crear Ubicaciones
mkdir "C:\Program Files\ClubDeTenis"
REM Mover los ficheros
robocopy "%userprofile%\Desktop\ClubDeTenis" "C:\Program Files\ClubDeTenis" /E
cd "C:\Program Files\ClubDeTenis"
REM Montar la BD
echo Montando la base de datos: Introduzca clave de root
mysql -u root -p -e "CREATE DATABASE gestion CHARACTER SET utf8 COLLATE utf8_spanish2_ci;"
echo Importando la base de datos: Introduzca clave de root
mysql -u root -p gestion<gestion.sql
echo Creando el usuario: Introduzca clave de root
mysql -u root -p -e "CREATE USER 'remoto'@'localhost' IDENTIFIED BY 'Studium2018;'"
echo Dando permisos al usuario: Introduzca clave de root
mysql -u root -p -e "GRANT ALL ON gestion.* TO 'remoto'@'localhost'"
REM Iniciar