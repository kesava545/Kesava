select e.ENAME,d.DEPTNO,d.LOC
from emp e
join
dept d
on e.DEPTNO = d.DEPTNO and (d.LOC='chicago') ;


select e.ENAME,d.DEPTNO,d.LOC
from emp e
join
dept d
on e.DEPTNO = d.DEPTNO
order by d.LOC;


select e.ENAME,d.DNAME
from emp e
join
dept d
on e.DEPTNO = d.DEPTNO;

select employee.ename as 'Emplyoee' --, manager.ename as 'Manager'
from emp employee 
join
emp manager
on manager.empno = employee.mgr and employee.HIREDATE < manager.HIREDATE;


SELECT ENAME,HIREDATE ,STARTDATE ,ENDDATE
FROM EMP 
join
JOBHIST
on HIREDATE BETWEEN STARTDATE AND ENDDATE;