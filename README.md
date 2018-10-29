# SistemaEmpleoLujan
Desarrollo del sistema de la oficina de empleos de la comision 2

PASOS PARA CONECTAR LA BD
1- Abrimos el archivo SQl adjuntado. Pegamos el contenido en un SQLFile (Mysql WorkBench) y lo ejecutamos.
2- Agregamos librerias al projecto de netbeans: Mysqk connector ver.5.1.47
						Hibernate ver. 5.2.10
3- En la clase Util reemplazar lineas "AnnotationConfiguration" por "Configuration".
4- Eliminamos y volvemos a crear hibernate.cfg.xml.
