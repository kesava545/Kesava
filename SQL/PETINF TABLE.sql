CREATE TABLE PETINF (
 PETID                 int NOT NULL,
 PETNAME               VARCHAR(14),
 PETTYPE               VARCHAR(13),
 PETAGE                 int NOT NULL,
 PETOWNER	         	VARCHAR(14),
 VISTDATE				DATE
CONSTRAINT PETINF_PRIMARY_KEY PRIMARY KEY (PETID));

INSERT INTO PETINF VALUES (1,'DOG','MALE',13,'SHYAM','26-06-2021');
INSERT INTO PETINF VALUES (2,'RABBIT','MALE',16,'SAI','26-06-2021');
INSERT INTO PETINF VALUES (3,'CAT','FEMALE',17,'SANJU','26-06-2021');
INSERT INTO PETINF VALUES (4,'SANKE','MALE',31,'NANI','26-06-2021');
INSERT INTO PETINF VALUES (5,'RAT','MALE',18,'SIRISHA','26-06-2021');
INSERT INTO PETINF VALUES (6,'PARROT','FEMALE',25,'JUNISHA','26-06-2021');