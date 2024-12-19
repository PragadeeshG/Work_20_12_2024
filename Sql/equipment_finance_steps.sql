create table if not exists equipment_finance_steps(
step_id bigint not null,
finance_code bigint null,
process_steps varchar(255) null,
bnpl_scheme varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint equipment_finance_steps_pk primary key(step_id));