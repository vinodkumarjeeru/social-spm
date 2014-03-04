
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



create table spm_assembly(
	asmc_id 			   bigint(10) not null auto_increment,
	asmc_guid 			   varchar(255) not null,
	asmc_constituancyid    bigint(10) not null,
	asmc_constituancyname  varchar(255) not null,
    asmc_created_date 	   datetime not null,
    asmc_created_by 	   bigint(10),
    asmc_modified_date 	   datetime not null,
    asmc_modified_by       bigint(10),
    asmc_active 		   bigint(10) not null,
    PRIMARY KEY (asmc_id)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;


create table spm_parliment(

	pmc_id 				  bigint(10) not null auto_increment,
	pmc_guid 			  varchar(255) not null,
	pmc_constituancyid    bigint(10) not null,
	pmc_constituancyname  varchar(255) not null,
    pmc_created_date 	  datetime not null,
    pmc_created_by 		  bigint(10),
    pmc_modified_date 	  datetime not null,
    pmc_modified_by 	  bigint(10),
    pmc_active 			  bigint(10) not null,
    PRIMARY KEY (pmc_id)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;