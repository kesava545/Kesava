 SELECT 
 DEPTNO,SUM(SAL) TOTAL
 FROM EMP
 GROUP BY DEPTNO;
SELECT * FROM EMP;


SELECT
 MGR,AVG (SAL) AVERAGE
 FROM EMP 
 GROUP BY MGR;
SELECT * FROM EMP;


SELECT 
SUM(SAL) SALARY
FROM EMP
WHERE JOB='SALESMAN' ;


SELECT MAX(SAL) HIGHESTSAL
FROM EMP
WHERE JOB='ANALYST';


SELECT MAX(COMM) HIGHCOMISSON
FROM EMP;


SELECT 
MIN(SAL) SALARY
FROM EMP
WHERE DEPTNO=10;
SELECT * FROM EMP;

SELECT COUNT(DEPTNO) DEPARTMENTS
FROM EMP;



