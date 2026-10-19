# Rediseño profesional de portafolio web — Java + Spring Boot

Actúa como un **Senior Frontend Engineer, UI/UX Designer y Creative Web Developer**, especializado en interfaces modernas, portafolios profesionales y aplicaciones web.

Quiero que realices un rediseño integral del frontend de mi portafolio personal, desarrollado con **Java y Spring Boot**, conservando completamente su funcionamiento actual.

## 1. Uso obligatorio de skills

En este proyecto tengo instaladas dos skills de diseño frontend:

- `frontend-design`, desarrollada por Anthropic.
- `frontend-design`, desarrollada por Vercel.

**Antes de comenzar, localiza, lee y utiliza ambas skills.**

Inspecciona las ubicaciones donde Claude Code descubre las skills del proyecto y determina cómo distinguir las dos implementaciones aunque compartan el mismo nombre.

No asumas que ambas skills son idénticas ni que sus rutas son las mismas.

Aplica de manera complementaria sus recomendaciones de diseño, composición, accesibilidad, responsive design, arquitectura CSS y calidad visual.

Si alguna skill no está disponible o no puede ejecutarse, informa cuál es el problema. No afirmes haberla utilizado si no pudiste acceder a ella.

## 2. Análisis del proyecto

Antes de realizar modificaciones:

1. Explora la estructura completa del proyecto.
2. Identifica los archivos HTML, CSS, JavaScript y recursos estáticos.
3. Identifica si se utiliza Thymeleaf, Bootstrap u otras tecnologías.
4. Examina las plantillas compartidas, fragmentos y layouts.
5. Analiza cómo se comunican las vistas con los controladores Spring Boot.
6. Identifica las páginas públicas y las páginas de administración.
7. Localiza los estilos globales y detecta reglas duplicadas, conflictos o problemas de especificidad.
8. Identifica los componentes que pueden reutilizarse.

**No reemplaces el stack tecnológico actual ni introduzcas React, Vue, Next.js u otro framework sin una justificación técnica y mi autorización.**

El objetivo es mejorar el frontend existente, no reconstruir innecesariamente el backend.

## 3. Objetivo visual

Quiero transformar mi portafolio actual en una experiencia moderna, elegante, distintiva y profesional.

La dirección visual será:

**Modern Developer Portfolio / Dark Premium / Creative Technology**

Características deseadas:

- Diseño oscuro sofisticado.
- Paleta de colores coherente, con azul profundo y acentos eléctricos.
- Tipografía moderna con excelente jerarquía visual.
- Composición editorial con espacios equilibrados.
- Secciones visualmente diferenciadas.
- Tarjetas con bordes sutiles y superficies elegantes.
- Gradientes suaves utilizados estratégicamente.
- Microinteracciones profesionales.
- Animaciones fluidas y discretas.
- Excelente experiencia tanto en escritorio como en móvil.

Evita que el resultado parezca una plantilla genérica generada por IA.

No abuses de efectos glow, glassmorphism, sombras exageradas, gradientes multicolor o animaciones innecesarias.

Prioriza una identidad visual memorable y consistente.

## 4. Rediseño de la página principal

### Hero

Rediseña completamente la primera sección.

Quiero que incluya:

- Mi nombre con tipografía destacada.
- Mi especialidad profesional.
- Una descripción breve y convincente.
- Una fotografía o avatar integrado de forma elegante.
- Botones para explorar proyectos y contactar.
- Accesos a redes profesionales cuando existan.
- Un fondo con profundidad visual, sin distraer del contenido.

Considera una composición de dos columnas para escritorio, con contenido textual a la izquierda y elemento visual a la derecha.

En dispositivos móviles, adapta la composición correctamente.

Puedes utilizar animaciones de entrada discretas y detalles visuales relacionados con desarrollo de software.

### Sobre mí

Transforma esta sección en una presentación profesional.

Evita repetir exactamente la descripción del hero.

Utiliza una composición con mejor jerarquía, distribución y lectura.

### Habilidades

Rediseña completamente las tarjetas de habilidades.

Considera agruparlas por categorías, si los datos existentes lo permiten:

- Backend.
- Frontend.
- Bases de datos.
- Herramientas y control de versiones.

Utiliza iconografía consistente y tarjetas modernas.

Si existen porcentajes de dominio, conserva los datos y preséntalos de manera elegante, sin inventar niveles de experiencia.

Implementa efectos hover discretos.

### Experiencia profesional

Sustituye la presentación básica actual por una composición más profesional.

Puedes utilizar una línea de tiempo vertical o tarjetas editoriales.

Destaca:

- Cargo.
- Empresa.
- Periodo.
- Actividades.
- Tecnologías utilizadas, cuando existan.

Mejora especialmente el tamaño y contraste de los textos.

### Proyectos

Convierte esta sección en uno de los elementos visuales más importantes del portafolio.

Cada proyecto debe contar con una tarjeta que pueda mostrar:

- Nombre.
- Descripción.
- Tecnologías.
- Imagen o vista previa, si existe.
- Enlace al repositorio, si está disponible.
- Enlace a demostración, si existe.

No inventes proyectos, capturas ni enlaces.

Si no existen imágenes, crea un tratamiento visual elegante que no dependa de recursos falsos.

### Educación y contacto

Rediseña ambas secciones con el mismo sistema visual.

El contacto debe ser sencillo, accesible y funcional.

## 5. Rediseño de las páginas administrativas

Mi aplicación también contiene formularios y vistas CRUD para administrar la información del portafolio.

Quiero que estas pantallas se sientan como un panel administrativo profesional.

### Diseño general

Implementa un layout administrativo coherente con:

- Navegación clara.
- Encabezados bien definidos.
- Contenedores con ancho adecuado.
- Separación consistente.
- Botones reutilizables.
- Mensajes de éxito y error.
- Estados de carga cuando correspondan.
- Buen comportamiento responsive.

### Formularios

Rediseña todos los formularios conservando sus campos y funcionalidades.

Mejora:

- Etiquetas visibles.
- Espaciado.
- Campos de entrada.
- Selectores.
- Estados focus.
- Mensajes de validación.
- Botones guardar y cancelar.
- Organización visual de campos relacionados.

No modifiques los nombres de campos, bindings, rutas, métodos HTTP, tokens CSRF ni reglas de validación existentes.

### Tablas

Rediseña las listas administrativas.

Actualmente algunas tablas aparecen demasiado pequeñas y alineadas hacia la izquierda.

Quiero:

- Mejor aprovechamiento del ancho.
- Cabeceras legibles.
- Filas con espaciado adecuado.
- Acciones editar y eliminar diferenciadas.
- Confirmación antes de eliminar, sin alterar la lógica existente.
- Estados vacíos bien diseñados.
- Desplazamiento horizontal controlado en pantallas pequeñas cuando sea necesario.

No elimines columnas ni funciones existentes.

## 6. Sistema de diseño

Crea un sistema visual reutilizable basado en variables CSS.

Incluye tokens para:

- Colores.
- Tipografía.
- Espaciado.
- Radios de borde.
- Sombras.
- Transiciones.
- Estados interactivos.
- Anchos máximos.

Utiliza una escala tipográfica coherente y tamaños accesibles.

Puedes incorporar fuentes de Google Fonts o recursos externos confiables cuando sean adecuados, considerando rendimiento y disponibilidad.

Evita estilos inline innecesarios y duplicación de código.

## 7. Responsive design

El diseño debe funcionar correctamente en:

- Teléfonos móviles.
- Tablets.
- Laptops.
- Monitores grandes.

No debe presentar desbordamientos horizontales accidentales.

Asegúrate de que los menús, botones, formularios, tarjetas y tablas puedan utilizarse cómodamente en pantallas pequeñas.

## 8. Animaciones e interacciones

Agrega microinteracciones de alta calidad:

- Hover en botones y tarjetas.
- Transiciones de navegación.
- Aparición sutil de secciones.
- Indicadores de foco.
- Desplazamiento suave cuando corresponda.

Respeta `prefers-reduced-motion`.

No agregues librerías pesadas de animación si CSS y JavaScript nativo son suficientes.

## 9. Restricciones técnicas

Estas condiciones son obligatorias:

1. Mantener Java y Spring Boot.
2. Conservar controladores, servicios, repositorios y entidades.
3. Mantener la integración con la base de datos.
4. Preservar todos los endpoints existentes.
5. No romper Thymeleaf ni sus expresiones.
6. Mantener el login y las sesiones.
7. Conservar las operaciones CRUD.
8. No modificar dependencias innecesariamente.
9. No introducir datos ficticios.
10. No eliminar funcionalidades existentes.
11. Evitar cambios de backend salvo que sean imprescindibles y estén justificados.
12. No ejecutar acciones destructivas sobre datos o repositorios.

## 10. Implementación

Quiero que realices el trabajo, no solamente que generes recomendaciones.

Primero, inspecciona el proyecto y prepara un plan breve de implementación.

Después, realiza los cambios directamente sobre los archivos correspondientes, trabajando por etapas:

**Etapa 1:** sistema de diseño y estilos globales.

**Etapa 2:** navegación, hero y página principal.

**Etapa 3:** habilidades, experiencia, educación y proyectos.

**Etapa 4:** formularios, tablas y panel administrativo.

**Etapa 5:** responsive, accesibilidad y animaciones.

**Etapa 6:** revisión de calidad y verificación funcional.

Trabaja de manera incremental y revisa posibles regresiones entre etapas.

No te detengas después del análisis: continúa con la implementación, salvo que encuentres un cambio destructivo, una decisión arquitectónica importante o una dependencia que requiera mi autorización.

## 11. Verificación

Al finalizar:

- Ejecuta las verificaciones y pruebas disponibles.
- Comprueba que el proyecto compile, si el entorno lo permite.
- Revisa posibles errores de HTML, CSS y JavaScript.
- Verifica que las expresiones Thymeleaf se mantengan intactas.
- Comprueba que las rutas y formularios sigan funcionando.
- Si tienes acceso a herramientas de navegador, inspecciona las páginas renderizadas en escritorio y móvil.
- Si no puedes probar algo, indícalo claramente.

No afirmes que una pantalla funciona si no pudiste verificarla.

## 12. Resultado esperado

Quiero que mi portafolio deje de parecer un proyecto básico de práctica y se convierta en una aplicación visualmente sólida que pueda utilizar para presentarme profesionalmente.

La experiencia pública debe transmitir creatividad y capacidad técnica.

Las pantallas administrativas deben transmitir organización, claridad y calidad de producto.

**Prioriza diseño excepcional, legibilidad, coherencia visual, mantenimiento del código y funcionamiento real.**

Al terminar, entrega un resumen de los archivos modificados, las mejoras implementadas, las pruebas realizadas y los puntos pendientes.