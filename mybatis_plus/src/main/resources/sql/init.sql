create table if not exists person_info(
    id  varchar(64) not null  primary key,
    name varchar(64),
    age varchar(64)

);

comment on table person_info is '人员信息';
comment on column person_info.id is '人员id';
comment on column person_info.name is '人员姓名';
comment on column person_info.age is '人员年龄';