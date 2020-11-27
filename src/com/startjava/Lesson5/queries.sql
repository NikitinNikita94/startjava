SELECT * FROM Robots;

SELECT * FROM Robots WHERE status = 'Active';

SELECT * FROM Robots WHERE mark IN ('Mark-1','Mark-6');

SELECT * FROM Robots ORDER BY mark;

SELECT * FROM Robots WHERE launch = (select MAX(launch) FROM Robots);

SELECT * FROM Robots WHERE kaijuKill = (select MIN(kaijuKill) FROM Robots);

SELECT round(AVG(weight),2) FROM Robots ;

UPDATE Robots SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';

SELECT FROM Robots WHERE status = 'Destroyed';