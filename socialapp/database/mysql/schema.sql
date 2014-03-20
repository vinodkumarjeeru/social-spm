
create table spm_district (
   dis_id 				bigint(10) not null auto_increment,   
   dis_guid 			varchar(255) not null,
   dis_districtid 		bigint(10) not null,
   dis_name 		    varchar(255),
   dis_capital 		    varchar(255),
   dis_state 		    varchar(255),   
   dis_created_on 	    datetime not null,
   dis_created_by 		bigint(10),
   dis_modified_on 	    datetime not null,
   dis_modified_by 		bigint(10),
   dis_active 			bigint(10) not null,
   dis_map 				mediumblob,
   PRIMARY KEY (dis_id)
) ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;



create table spm_assembly(
	asmc_id 			   bigint(10) not null auto_increment,
	asmc_guid 			   varchar(255) not null,
	asmc_constituancyid    bigint(10) not null,
	asmc_constituancyname  varchar(255) not null,
    asmc_created_on 	   datetime not null,
    asmc_created_by 	   bigint(10),
    asmc_modified_on 	   datetime not null,
    asmc_modified_by       bigint(10),
    asmc_active 		   bigint(10) not null,
    PRIMARY KEY (asmc_id)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;


create table spm_parliment(
	pmc_id 				  bigint(10) not null auto_increment,
	pmc_guid 			  varchar(255) not null,
	pmc_constituancyid    bigint(10) not null,
	pmc_constituancyname  varchar(255) not null,
    pmc_created_on 	  datetime not null,
    pmc_created_by 		  bigint(10),
    pmc_modified_on 	  datetime not null,
    pmc_modified_by 	  bigint(10),
    pmc_active 			  bigint(10) not null,
    PRIMARY KEY (pmc_id)
)ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;


create table spm_xuser (
   xsr_id 				bigint(10) not null auto_increment,   
   xsr_guid 			varchar(255) not null,
   xsr_email			varchar(255),
   xsr_firstname 		varchar(255) ,
   xsr_lastname 		    varchar(255),
   xsr_password 		    varchar(255),
   xsr_district 		    varchar(255), 
   xsr_mobile 		    varchar(255),
   xsr_question 		    varchar(255),
   xsr_answer 		    varchar(255), 
   xsr_profilepic 				mediumblob,
   xsr_created_on 	    datetime not null,
   xsr_created_by 		bigint(10),
   xsr_modified_on 	    datetime not null,
   xsr_modified_by 		bigint(10),
   xsr_active 			bigint(10) not null,  
   PRIMARY KEY (xsr_id)
) ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;

create table spm_fbuser (
   fb_id 				bigint(10) not null auto_increment,   
   fb_guid 				varchar(255) not null,
   fb_fbid    			varchar(255),
   fb_userName			varchar(255),
   fb_firstname 		varchar(255) ,
   fb_lastname 		    varchar(255),
   fb_gender			varchar(255),
   fb_district 		    varchar(255), 
   fb_created_on 	    datetime not null,
   fb_created_by 		bigint(10),
   fb_modified_on 	    datetime not null,
   fb_modified_by 		bigint(10),
   fb_active 			bigint(10) not null,  
   PRIMARY KEY (fb_id)
) ENGINE = InnoDB DEFAULT CHARSET=UTF8 COLLATE=UTF8_UNICODE_CI;

