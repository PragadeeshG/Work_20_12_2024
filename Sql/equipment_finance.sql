create table if not exists equipment_finance(
id bigint not null,
machinery_type varchar(255) null,
remarks varchar(255) null,
other_asset_type varchar(255) null,
operational_needs varchar(255) null,
capital_expenditure_needs varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint equipment_finance_pk primary key(id));