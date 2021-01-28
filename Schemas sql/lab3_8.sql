drop schema lab_3_8;
create schema lab_3_8;
use lab_3_8;

create table member (
	id int auto_increment not null,
    name varchar(255),
    status varchar(255),
    renewal_date date,
    primary key(id)
);

create table chapter (
	id int auto_increment not null,
    name varchar(255),
    district varchar(255),
    president int,
    primary key(id),
    foreign key(president) references member(id)
);

create table chapter_member (
	chapter_id INT,
    member_id int,
    foreign key(chapter_id) references chapter(id),
    foreign key(member_id) references member(id)
);


