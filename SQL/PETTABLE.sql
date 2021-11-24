create table PET 
(petid INT NOT NULL,
petname varchar(10),
pettype varchar(10),
petage INT NOT NULL,
petowner varchar(10),visitdate DATE,
PROCE varchar(10))

INSERT INTO PET (petid,petname ,pettype ,petage ,petowner ,visitdate ,PROCE)
VALUES (246,'ROVER','DOG',11,' SAM COOK','11-02-2020', 'RABIESVACC');

INSERT INTO PET (petid,petname ,pettype ,petage ,petowner ,visitdate ,PROCE)
VALUES (247,'BILL','DOG',11,' SAM','11-02-2020', 'WORMS');

INSERT INTO PET (petid,petname ,pettype ,petage ,petowner ,visitdate ,PROCE)
VALUES (247,'SONY','CAT',11,'JAMES','12-03-2020', 'SKINPRB');

SELECT * FROM PET;