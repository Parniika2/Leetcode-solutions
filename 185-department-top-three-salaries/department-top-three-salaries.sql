# Write your MySQL query statement below
select Department ,Employee,Salary
from(
    select d.name as department,e.name as employee,e.salary as salary,
    dense_rank() over(partition by d.id order by e.salary desc) as r
    from Employee e
    join Department d
    on e.departmentId=d.id
)t
where r<=3
