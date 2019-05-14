create table hibernate_sequence (;

next_val bigint;

) engine=InnoDB;

insert into hibernate_sequence values (;

1;

);

insert into hibernate_sequence values (;

1;

);

insert into hibernate_sequence values (;

1;

);

create table T_ADMIN_CUSTOMER (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(;

255;

),;

version bigint not null,;

TEXT varchar(;

255;

),;

C_NAME varchar(;

255;

),;

C_TELEPHONE varchar(;

255;

),;

PARENT_ID bigint,;

primary key (;

ID;

);

) engine=InnoDB;

create table T_ADMIN_ENWRAP (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(;

255;

),;

version bigint not null,;

ADDRESS_END varchar(;

255;

),;

ADDRESS_ORIGIN varchar(;

255;

),;

ENWRAP_ID varchar(;

255;

),;

ENWRAP_TYPE varchar(;

255;

),;

CUSTOMER_ID bigint,;

SELLER_ID bigint,;

primary key (;

ID;

);

) engine=InnoDB;

create table T_ADMIN_SELLER (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(;

255;

),;

version bigint not null,;

S_NAME varchar(;

255;

),;

S_TELEPHONE varchar(;

255;

),;

primary key (;

ID;

);

) engine=InnoDB;

alter table T_ADMIN_CUSTOMER;

add constraint FK871h8qjch7e464wiulwie9ls foreign key (;

PARENT_ID;

);

references T_ADMIN_CUSTOMER (;

ID;

);

alter table T_ADMIN_ENWRAP;

add constraint FKcbko3mp85hx75h4mj1a8rfy8e foreign key (;

CUSTOMER_ID;

);

references T_ADMIN_CUSTOMER (;

ID;

);

alter table T_ADMIN_ENWRAP;

add constraint FKrrn2q48w3c73tld3map5nh5co foreign key (;

SELLER_ID;

);

references T_ADMIN_SELLER (;

ID;

);

create table hibernate_sequence (;

next_val bigint;

) engine=InnoDB;

insert into hibernate_sequence values (;

1;

);

insert into hibernate_sequence values (;

1;

);

insert into hibernate_sequence values (;

1;

);

create table T_ADMIN_CUSTOMER (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(;

255;

),;

version bigint not null,;

TEXT varchar(;

255;

),;

C_NAME varchar(;

255;

),;

C_TELEPHONE varchar(;

255;

),;

PARENT_ID bigint,;

primary key (;

ID;

);

) engine=InnoDB;

create table T_ADMIN_ENWRAP (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(;

255;

),;

version bigint not null,;

ADDRESS_END varchar(;

255;

),;

ADDRESS_ORIGIN varchar(;

255;

),;

ENWRAP_ID varchar(;

255;

),;

ENWRAP_TYPE varchar(;

255;

),;

CUSTOMER_ID bigint,;

SELLER_ID bigint,;

primary key (;

ID;

);

) engine=InnoDB;

create table T_ADMIN_SELLER (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(;

255;

),;

version bigint not null,;

S_NAME varchar(;

255;

),;

S_TELEPHONE varchar(;

255;

),;

primary key (;

ID;

);

) engine=InnoDB;

alter table T_ADMIN_CUSTOMER;

add constraint FK871h8qjch7e464wiulwie9ls foreign key (;

PARENT_ID;

);

references T_ADMIN_CUSTOMER (;

ID;

);

alter table T_ADMIN_ENWRAP;

add constraint FKcbko3mp85hx75h4mj1a8rfy8e foreign key (;

CUSTOMER_ID;

);

references T_ADMIN_CUSTOMER (;

ID;

);

alter table T_ADMIN_ENWRAP;

add constraint FKrrn2q48w3c73tld3map5nh5co foreign key (;

SELLER_ID;

);

references T_ADMIN_SELLER (;

ID;

);

create table hibernate_sequence (;

next_val bigint;

) engine=InnoDB;

insert into hibernate_sequence values (;

1;

);

insert into hibernate_sequence values (;

1;

);

insert into hibernate_sequence values (;

1;

);

create table T_ADMIN_CUSTOMER (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(
	255
),;

version bigint not null,;

TEXT varchar(
	255
),;

C_NAME varchar(
	255
),;

C_TELEPHONE varchar(
	255
),;

PARENT_ID bigint,;

primary key (
	ID
);

) engine=InnoDB;

create table T_ADMIN_ENWRAP (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(
	255
),;

version bigint not null,;

ADDRESS_END varchar(
	255
),;

ADDRESS_ORIGIN varchar(
	255
),;

ENWRAP_ID varchar(
	255
),;

ENWRAP_TYPE varchar(
	255
),;

CUSTOMER_ID bigint,;

SELLER_ID bigint,;

primary key (
	ID
);

) engine=InnoDB;

create table T_ADMIN_SELLER (;

ID bigint not null,;

DATECREATED datetime,;

DATEMODIFIED datetime,;

DELETED bit,;

ENTITY_NAME varchar(
	255
),;

version bigint not null,;

S_NAME varchar(
	255
),;

S_TELEPHONE varchar(
	255
),;

primary key (
	ID
);

) engine=InnoDB;

alter table T_ADMIN_CUSTOMER;

add constraint FK871h8qjch7e464wiulwie9ls foreign key (
	PARENT_ID
);

references T_ADMIN_CUSTOMER (
	ID
);

alter table T_ADMIN_ENWRAP;

add constraint FKcbko3mp85hx75h4mj1a8rfy8e foreign key (
	CUSTOMER_ID
);

references T_ADMIN_CUSTOMER (
	ID
);

alter table T_ADMIN_ENWRAP;

add constraint FKrrn2q48w3c73tld3map5nh5co foreign key (
	SELLER_ID
);

references T_ADMIN_SELLER (
	ID
);

create table hibernate_sequence (
	next_val bigint
) engine=InnoDB;

insert into hibernate_sequence values (
	 1 
);

insert into hibernate_sequence values (
	 1 
);

insert into hibernate_sequence values (
	 1 
);

create table T_ADMIN_CUSTOMER (
	ID bigint not null,
	DATECREATED datetime,
	DATEMODIFIED datetime,
	DELETED bit,
	ENTITY_NAME varchar(255),
	version bigint not null,
	TEXT varchar(255),
	C_NAME varchar(255),
	C_TELEPHONE varchar(255),
	PARENT_ID bigint,
	primary key (ID)
) engine=InnoDB;

create table T_ADMIN_ENWRAP (
	ID bigint not null,
	DATECREATED datetime,
	DATEMODIFIED datetime,
	DELETED bit,
	ENTITY_NAME varchar(255),
	version bigint not null,
	ADDRESS_END varchar(255),
	ADDRESS_ORIGIN varchar(255),
	ENWRAP_TYPE varchar(255),
	C_ID bigint,
	S_ID bigint,
	primary key (ID)
) engine=InnoDB;

create table T_ADMIN_SELLER (
	ID bigint not null,
	DATECREATED datetime,
	DATEMODIFIED datetime,
	DELETED bit,
	ENTITY_NAME varchar(255),
	version bigint not null,
	S_NAME varchar(255),
	S_TELEPHONE varchar(255),
	primary key (ID)
) engine=InnoDB;

alter table T_ADMIN_CUSTOMER
	add constraint FK871h8qjch7e464wiulwie9ls foreign key (PARENT_ID)
	references T_ADMIN_CUSTOMER (ID);

alter table T_ADMIN_ENWRAP
	add constraint FKsawu5yp8e8fqcudacmt6wef3c foreign key (C_ID)
	references T_ADMIN_CUSTOMER (ID);

alter table T_ADMIN_ENWRAP
	add constraint FKed1el53llaq132wu7vq53h93e foreign key (S_ID)
	references T_ADMIN_SELLER (ID);

