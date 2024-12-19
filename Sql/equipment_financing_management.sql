create table if not exists equipment_financing_management(
equipment_financing_code bigint not null,
screen_name varchar(255) null,
screen_id bigint null,
refernce_code bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint equipment_financing_management_pk primary key(equipment_financing_code));