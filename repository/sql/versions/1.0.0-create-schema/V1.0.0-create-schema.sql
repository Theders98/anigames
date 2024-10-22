
CREATE SEQUENCE exercises_seq
CREATE SEQUENCE panels_seq
CREATE SEQUENCE columns_seq
CREATE SEQUENCE media_seq

CREATE TABLE exercises (
    id INTEGER DEFAULT NEXTVAL ('exercises_seq') NOT NULL,
    public_name VARCHAR(50),
    description VARCHAR(255)
    constraint exercises_PK primary key (id)
);

CREATE TABLE panels (
    id INTEGER DEFAULT NEXTVAL ('panels_seq') NOT NULL,
    public_name VARCHAR(50),
    properties JSON,
    constraint panels_PK primary key (id)
);

CREATE TABLE columns (
    id INTEGER DEFAULT NEXTVAL ('columns_seq') NOT NULL,
    name VARCHAR(50),
    order INTEGER,
    constraint columns_PK primary key (id)
);

CREATE TABLE panels_exercises (
    id_exercise INTEGER NOT NULL,
    id_panel INTEGER NOT NULL,
    id_column integer NOT NULL,
    id_user VARCHAR(50)
    constraint panels_exercises_PK primary key (id_exercises, id_panels, id_column, id_user)
);

CREATE TABLE media (
     id INTEGER DEFAULT NEXTVAL ('media_seq') NOT NULL,
     media TEXT,
     id_exercise INTEGER NOT NULL
     constraint columns_PK primary key (id)
);

ALTER TABLE panels_exercises
    add constraint FK_exercises_panels_exercises foreign key (id_exercise)
    references exercises (id);

ALTER TABLE panels_exercises
    add constraint FK_exercises_panels_columns foreign key (id_column)
        references columns (id);

ALTER TABLE panels_exercises
    add constraint FK_exercises_panels_panels foreign key (id_panel)
        references panels (id);

ALTER TABLE media
    add constraint FK_media_exercises foreign key (id_exercise)
        references exercises (id);
