SELECT a.BOOK_ID,b.AUTHOR_NAME, DATE_FORMAT(a.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK AS a
JOIN AUTHOR as b
ON a.AUTHOR_ID = b.AUTHOR_ID
WHERE a.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE