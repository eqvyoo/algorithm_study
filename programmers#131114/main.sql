SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N') AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS like '경기도%'