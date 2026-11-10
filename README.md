# Portafolio personal | Guillermo Mora Martínez

Aplicación web de portafolio profesional desarrollada con **Java 21, Spring Boot y Thymeleaf**. Presenta mi perfil, formación académica, experiencia laboral, habilidades y proyectos. Incluye un **panel de administración** para mantener el contenido actualizado sin modificar el código de las vistas.

**[🌐 Visitar portafolio en producción](https://guillermo-mora-martinez.up.railway.app/)** · **[💻 Repositorio en GitHub](https://github.com/GuillermoMora03/my-portfolio)**

## Características

- Página pública con información personal, educación, experiencia, habilidades y proyectos.
- Panel privado para **crear, consultar, editar y eliminar** los registros administrables.
- Autenticación mediante **Spring Security**, sesiones y contraseñas cifradas con **BCrypt**.
- Validación de formularios mediante **Jakarta Bean Validation**.
- Imágenes de proyectos referenciadas mediante **URL** (por ejemplo, enlaces de Cloudinary).
- Formulario de contacto integrado con **Formspree**.
- Persistencia en **PostgreSQL**, utilizando **Spring Data JDBC / `JdbcTemplate`** y repositorios con consultas SQL.
- Despliegue en **Railway** y base de datos alojada en **Neon**.

## Tecnologías

| Capa | Tecnologías |
| --- | --- |
| Lenguaje y backend | Java 21, Spring Boot 4.1.1, Spring MVC |
| Vistas y estilos | Thymeleaf, HTML, CSS, JavaScript |
| Persistencia | Spring Data JDBC, `JdbcTemplate`, PostgreSQL (Neon) |
| Seguridad | Spring Security, BCrypt, protección CSRF de Spring Security |
| Validación | Jakarta Bean Validation |
| Herramientas | Maven, Lombok, Git y GitHub |
| Servicios externos | Railway, Cloudinary (URLs de imágenes), Formspree |

## Arquitectura

La aplicación sigue una organización por capas y utiliza **Spring MVC** para renderizar vistas del lado del servidor:

```text
Navegador
   │
   ▼
Spring MVC (controllers) ──► Thymeleaf (templates)
   │
   ▼
DTOs y Mappers
   │
   ▼
Services
   │
   ▼
Repositories (JdbcTemplate + SQL)
   │
   ▼
PostgreSQL (Neon)
```

Estructura principal:

```text
src/main/
├── java/com/porfolio/my_portfolio_backend/
│   ├── config/        # Configuración de Spring Security
│   ├── controller/    # Vistas públicas y administración
│   ├── dto/           # Objetos para formularios y transferencia de datos
│   ├── mapper/        # Conversiones entre DTO y modelo
│   ├── model/         # Modelos de dominio
│   ├── repository/    # Acceso a PostgreSQL mediante JdbcTemplate
│   ├── rest/          # Controladores REST incluidos en el proyecto
│   └── service/       # Lógica de aplicación
└── resources/
    ├── templates/     # Vistas y fragmentos Thymeleaf
    ├── static/        # CSS, JavaScript e iconos
    ├── application.properties
    ├── schema.sql
    └── data.sql
```

> **Nota:** este proyecto utiliza **Spring Data JDBC y `JdbcTemplate`** como mecanismo de persistencia de sus repositorios.

## Requisitos para ejecución local

- **JDK 21**.
- Acceso a una base de datos **PostgreSQL** con las tablas del proyecto.
- Credenciales de conexión configuradas como variables de entorno.
- No es obligatorio instalar Maven globalmente: el proyecto incluye **Maven Wrapper**.

### 1. Clonar el repositorio

```bash
git clone https://github.com/GuillermoMora03/my-portfolio.git
cd my-portfolio
```

### 2. Configurar variables de entorno

En el entorno de ejecución del IDE o en la terminal, configurar:

| Variable | Descripción |
| --- | --- |
| `DATABASE_URL` | URL **JDBC** de PostgreSQL, por ejemplo `jdbc:postgresql://HOST/BASE?sslmode=require` |
| `DATABASE_USERNAME` | Nombre de usuario de PostgreSQL |
| `DATABASE_PASSWORD` | Contraseña del usuario de PostgreSQL |
| `SESSION_COOKIE_SECURE` | `false` para HTTP local; `true` detrás de HTTPS en producción |
| `PORT` | Opcional: puerto HTTP; predeterminado `8080` |

Ejemplo **sin credenciales reales**:

```dotenv
DATABASE_URL=jdbc:postgresql://HOST/BASE?sslmode=require
DATABASE_USERNAME=USUARIO
DATABASE_PASSWORD=CONTRASENA_PRIVADA
SESSION_COOKIE_SECURE=false
```

En IntelliJ IDEA se pueden definir desde **Run → Edit Configurations → Environment variables**. Spring Boot resuelve los valores en `application.properties` mediante `${VARIABLE}`; un archivo `.env` por sí solo **no se carga automáticamente**.


### 3. Preparar la base de datos

La base de datos debe disponer de las tablas `personal_info`, `educations`, `experiences`, `skills`, `projects` y `users`.

El proyecto incluye `schema.sql` y `data.sql` como scripts de referencia. `schema.sql` contiene instrucciones `DROP TABLE` que eliminan tablas y datos. En la configuración de la aplicación se mantiene:

```properties
spring.sql.init.mode=never
```

Esto desactiva la ejecución automática de esos scripts en cada arranque. Para una instalación nueva, revisa y adapta el esquema antes de aplicarlo sobre **una base vacía** y crea tu propio usuario administrador de forma segura.

### 4. Iniciar la aplicación

Linux/macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Abre **http://localhost:8080** (o el puerto configurado).

## Panel de administración

La aplicación cuenta con un formulario de inicio de sesión en `/login`. Tras autenticarse, el administrador puede gestionar información personal, educación, experiencia, habilidades y proyectos. Los cambios se guardan en PostgreSQL y permanecen después de reiniciar la aplicación.

La configuración de seguridad permite la página principal y los recursos estáticos públicos, y exige autenticación para el resto de las rutas. El formulario de proyectos acepta una **URL de imagen**, de modo que los recursos multimedia pueden servirse desde Cloudinary sin almacenar el archivo en el servidor de Spring Boot.

## Despliegue

La versión pública se ejecuta en **Railway**, conectada a **Neon PostgreSQL**. La propia aplicación Spring Boot sirve las vistas Thymeleaf; no requiere un frontend desplegado por separado.

**Aplicación en vivo:** https://guillermo-mora-martinez.up.railway.app/

## Pruebas

El repositorio contiene pruebas bajo `src/test/`. Para ejecutarlas desde una terminal:

```bash
./mvnw test
```

## Autor

**Guillermo Mora Martínez**  
[GitHub](https://github.com/GuillermoMora03) · [LinkedIn](https://www.linkedin.com/in/guillermo-mora/) · [Portafolio](https://guillermo-mora-martinez.up.railway.app/)
