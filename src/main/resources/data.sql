
-- INFORMACIÓN PERSONAL
INSERT INTO personal_info (
    first_name, last_name, title,
    profile_description, profile_image_url,
    years_of_experience, email, phone,
    linkedin_url, github_url
)
VALUES (
           'Guillermo',
           'Mora Martínez',
           'Desarrollador Backend Java | Spring Boot',
           'Egresado de la Licenciatura en Tecnologías de la Información, con experiencia en análisis de sistemas, gestión de datos, automatización de procesos y desarrollo backend. Conocimientos en Java, Spring Boot, SQL, APIs REST y entornos Unix/Linux. Interesado en el desarrollo de soluciones tecnológicas y la mejora continua.',
           NULL,
           NULL,
           'guillermo_moram@outlook.es',
           '+52 556 96 38 323',
           'https://linkedin.com/in/guillermo-mora',
           'https://github.com/GuillermoMora03'
       );

-- HABILIDADES TÉCNICAS
INSERT INTO skills (
    name, level_percentage, icon_class, personal_info_id
)
VALUES
    ('Java', NULL, 'img/logos/java.png', 1),
    ('Spring Boot', NULL, NULL, 1),
    ('SQL', NULL, 'img/logos/servidor-sql.png', 1),
    ('Unix/Linux', NULL, NULL, 1),
    ('Python', NULL, NULL, 1),
    ('PHP', NULL, NULL, 1),
    ('Git', NULL, 'img/logos/github.png', 1),
    ('Spring Data JPA', NULL, NULL, 1),
    ('Postman', NULL, NULL, 1),
    ('Swagger/OpenAPI', NULL, NULL, 1);

-- EDUCACIÓN
INSERT INTO educations (
    degree, institution, start_date,
    end_date, description, personal_info_id
)
VALUES (
           'Licenciatura en Tecnologías de la Información',
           'Universidad Autónoma del Estado de Hidalgo',
           '2021-08-01',
           '2025-12-01',
           'Egresado con promedio de 9.2. Titulación mediante artículo científico en proceso.',
           1
       );

-- EXPERIENCIA PROFESIONAL
INSERT INTO experiences (
    job_title, company_name, start_date,
    end_date, description, personal_info_id
)
VALUES
    (
        'Analista Programador',
        'GSM - Proyecto E-Global',
        '2026-01-01',
        NULL,
        'Ejecución y supervisión de procesos batch para transacciones financieras, validación de reglas de negocio e integridad de datos mediante Informix/SQL. Mantenimiento de scripts Unix/Linux para automatización de procesos. Colaboración con el Technical Lead en diagnóstico de incidencias, optimización de consultas y elaboración de reportes.',
        1
    ),
    (
        'Practicante de Desarrollo de Software',
        '1071 Digital',
        '2025-08-01',
        '2025-11-30',
        'Participación en el diseño y desarrollo de una plataforma web de gestión de eventos utilizando PHP y Bootstrap. Implementación de funcionalidades administrativas, comunicación cliente-servidor, análisis de requerimientos, pruebas y despliegue.',
        1
    );

-- PROYECTOS
INSERT INTO projects (
    title, description, image_url,
    project_url, personal_info_id
)
VALUES
    (
        'API REST para Gestión de Eventos',
        'API REST desarrollada con Java y Spring Boot. Implementación de operaciones CRUD, persistencia mediante Spring Data JPA, manejo de excepciones, documentación con Swagger/OpenAPI y pruebas funcionales utilizando Postman.',
        NULL,
        NULL,
        1
    ),
    (
        'Portafolio Personal',
        'Aplicación web desarrollada con Java, Spring Boot y Spring MVC, con persistencia de datos mediante Hibernate/JPA y PostgreSQL. Incluye panel de administración para gestionar información profesional, experiencia, educación, habilidades y proyectos.',
        NULL,
        'https://github.com/GuillermoMora03/my-portfolio',
        1
    );

-- USUARIO ADMINISTRADOR ORIGINAL
INSERT INTO users (username, password, enable)
VALUES (
           'admin',
           '$2a$10$fnJ5Jbl37aQW6phjcFc.H.Ech8Q3lX6NouBj5hVqxd/uu8nIiIFI6',
           TRUE
       );
