create table if not exists USUARIO (
    ID int,
    USERNAME varchar(50) not null,
    PASSWORD varchar(100) not null,
    ROLE varchar(10) not null,
    primary key (ID),
    unique key username (USERNAME)
);

create table if not exists PRODUCTO (
    ID int,
    NOMBRE varchar(300) not null,
    PRECIO double not null,
    ID_USUARIO int not null,
    primary key (ID),
    foreign key (ID_USUARIO) references USUARIO(ID)
);


