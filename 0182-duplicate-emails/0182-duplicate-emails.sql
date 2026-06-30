# Write your MySQL query statement below
SELECT email as Email FROM PERSON
GROUP BY email having count(email)>1;