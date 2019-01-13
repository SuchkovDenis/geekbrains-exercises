-- список фильмов, для каждого — с указанием 
-- 	общего числа посетителей за все время, 
--  среднего числа зрителей за сеанс 
--  и общей суммы сборов по каждому фильму (отсортировать по убыванию прибыли). 
-- Внизу таблицы должна быть строчка «итого», содержащая данные по всем фильмам сразу;

(SELECT 
	f.title as `фильм`, 
    count(*) as  `общее количество посетивших`, 
    count(*)/count(distinct(s.id)) as `среднее число зрителей за сеанс`,
    sum(s.price) as `сборы`
FROM sessions AS s
LEFT JOIN films AS f
ON f.id = s.film_id
RIGHT JOIN tickets AS t
ON s.id = t.session_id
GROUP BY f.title
ORDER BY `сборы` DESC)
UNION
(SELECT 'Итого', count(*), count(*)/count(distinct(s.id)), sum(s.price)
FROM sessions AS s
LEFT JOIN films AS f
ON f.id = s.film_id
RIGHT JOIN tickets AS t
ON s.id = t.session_id);