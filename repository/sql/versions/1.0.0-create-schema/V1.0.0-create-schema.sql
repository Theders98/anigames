CREATE SEQUENCE games_seq
CREATE SEQUENCE characters_seq
CREATE SEQUENCE panels_seq


CREATE TABLE games (
    id INTEGER DEFAULT NEXTVAL ('games_seq') NOT NULL,
    public_name VARCHAR(50),
    logo VARCHAR(200),
    description VARCHAR(255),
    difficulty INTEGER NOT NULL
    constraint games_PK primary key (id)
);

CREATE TABLE panels (
    id INTEGER DEFAULT NEXTVAL ('panels_seq') NOT NULL,
    public_name VARCHAR(50),
    properties JSON,
    constraint panels_PK primary key (id)
);

CREATE TABLE characters (
    id INTEGER DEFAULT NEXTVAL ('characters_seq') NOT NULL,
    name VARCHAR(50),
    order INTEGER,
    constraint characters_PK primary key (id)
);
