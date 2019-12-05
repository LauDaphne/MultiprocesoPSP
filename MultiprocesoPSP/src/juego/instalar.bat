@echo off
REM Habilitar tildes y ñ
chcp 65001
echo Bienvenido al programa de instalación
REM Crear Ubicaciones
mkdir "C:\Program Files\CarmenSanDiego
REM Mover los ficheros
robocopy "%userprofile%\Desktop\CarmenSanDiego" "C:\Program Files\CarmenSanDiego" /E
cd "C:\Program Files\CarmenSanDiego"
REM Montar la BD
echo Montando la base de datos: Introduzca clave de root
mysql -u root -p -e "CREATE DATABASE carmensandiego CHARACTER SET utf8 COLLATE utf8_spanish2_ci;"
echo Importando la base de datos: Introduzca clave de root
mysql -u root -p carmensandiego<carmensandiego.sql
echo Creando el usuario: Introduzca clave de root
mysql -u root -p -e "CREATE USER 'remoto'@'localhost' IDENTIFIED BY 'Studium2018;'"
echo Dando permisos al usuario: Introduzca clave de root
mysql -u root -p -e "GRANT ALL ON carmensandiego.* TO 'remoto'@'localhost'"
