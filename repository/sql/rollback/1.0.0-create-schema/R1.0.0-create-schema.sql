
DROP TABLE IF EXISTS exercises;

DROP TABLE IF EXISTS panels;

DROP TABLE IF EXISTS columns;

DROP TABLE IF EXISTS  panels_exercises;

DROP TABLE IF EXISTS  media;


DROP SEQUENCE exercises_seq;
DROP SEQUENCE panels_seq;
DROP SEQUENCE columns_seq;
DROP SEQUENCE media_seq;

DELETE FROM flyway_schema_history WHERE version like '1.0.0';