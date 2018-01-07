use chapter8;

create table t_role (
	id int(11) not null auto_increment,
	role_name varchar(60) not null,
	create_date datetime not null default current_timestamp,
    note varchar(512) default null,
    primary key (id)
);

create table t_user (
	id int(11) not null auto_increment,
    user_name varchar(60) not null,
    birthday date not null,
    sex varchar(2) not null,
    mobile varchar(20) not null,
    email varchar(60) default null,
    note varchar(512) default null,
    primary key (id)
);