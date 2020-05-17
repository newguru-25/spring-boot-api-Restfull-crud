-- Usuario
-- Normal USUARIO: username: user, password: user, role: USER
insert into USUARIO (id, username, password, role) values (1, 'user1', '$2a$10$UcSltcvIoORWLKcCxo.4quqBWSoD0ZdC86caU..NSzNJdOdqgrKx2', 'USER');
insert into USUARIO (id, username, password, role) values (2, 'user2', '$2a$10$egfNXcVS6VnfxpoJrqNIJO2za/OyfQbPU81YgqH8eqdKFN6F8fcs6', 'USER');
-- Admin / Super User: username: admin, password: admin, role: ADMIN
insert into USUARIO (id, username, password, role) values (3, 'admin', '$2a$10$1e2I81sXJW0gJDKyDZxhc.JXXIpK1Y0T4AKp0GwNs32370Wa2bDqK', 'ADMIN');


insert into PRODUCTO (id, NOMBRE, PRECIO, ID_USUARIO) values (22, 'COLXXXN SAN FRXXXISCO GIANTS 24 CAN SOFT SIDED COOLER/LUNCHBOX MLB', 29.99, 2);
insert into PRODUCTO (id, NOMBRE, PRECIO, ID_USUARIO) values (23, 'AMERIXXWARE PSGAUS45 45 MM AUSTIN SNOW GLOBE', 10.11, 2);
insert into PRODUCTO (id, NOMBRE, PRECIO, ID_USUARIO) values (24, '24 IN. W X 24 IN. H ROXXD XXBLE VENT LOXXER&#44; FUNCTIONAL', 73.24, 2);