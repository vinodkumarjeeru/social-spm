
create table spm_district (
   dis_id 				bigint(10) not null auto_increment,   
   dis_guid 			varchar(255) not null,
   dis_districtid 		bigint(10) not null
   dis_name 		    varchar(255),
   dis_capital 		    varchar(255),
   dis_state 		    varchar(255),   
   dis_created_date 	datetime not null,
   dis_created_by 		bigint(10),
   dis_modified_date 	datetime not null,
   dis_modified_by 		bigint(10),
   dis_active 			bigint(10) not null,
   PRIMARY KEY (dis_id)
) ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;

