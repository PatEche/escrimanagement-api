
CREATE TABLE persons (
                         id UUID PRIMARY KEY,
                         person_type VARCHAR(20) NOT NULL,

                         first_name VARCHAR(100),
                         last_name VARCHAR(100),
                         document_number VARCHAR(8) UNIQUE,

                         business_name VARCHAR(150),
                         cuit VARCHAR(11) UNIQUE,

                         email VARCHAR(150),
                         phone VARCHAR(30),
                         address VARCHAR(255),

                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP NOT NULL
);
