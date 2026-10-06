# Práctica 2: Aplicación sobre IDEs y herramientas

## Enunciado

Se trata de crear un servicio REST que exponga un recurso en el que se recibirá como parámetro el nombre de un lenguaje/tecnología de programación elegido por el usuario.

El servicio responderá con una lista de entornos de desarrollo integrados (IDE) y herramientas auxiliares que puede utilizar para programar con ese lenguaje/tecnología. Entre los datos que se incluirán en la respuesta para cada herramienta se deberán incluir, al menos, el nombre del IDE/herramienta, dirección de descarga y breve descripción de para qué sirve.

**Desarrollo de la práctica**: al finalizar el Tema 3.

## Ejemplos de uso

El servicio expone un único recurso:

```
GET /api/ides?lenguaje={lenguaje}
```

| Parámetro | Obligatorio | Descripción |
|---|---|---|
| `lenguaje` | Sí | Nombre del lenguaje o tecnología de programación |

### Desde el navegador

- http://localhost:8002/api/ides?lenguaje=Java
- http://localhost:8002/api/ides?lenguaje=Python
- http://localhost:8002/api/ides?lenguaje=Delphi

### Desde la línea de comandos

```bash
curl "http://localhost:8002/api/ides?lenguaje=Java"

# Con espacios en el nombre, dejando que curl codifique el parámetro
curl -G "http://localhost:8002/api/ides" --data-urlencode "lenguaje=Spring Boot"
```

### Respuesta

Ejemplo de respuesta para `lenguaje=Java` (el contenido lo genera el modelo y puede variar entre llamadas):

```json
{
  "herramientas": [
    {
      "nombre": "IntelliJ IDEA",
      "urlDescarga": "https://www.jetbrains.com/idea/download/",
      "descripcion": "IDE completo para Java y Kotlin con refactorización, depuración e integración con Maven y Gradle.",
      "licencia": "Freemium"
    },
    {
      "nombre": "Eclipse IDE",
      "urlDescarga": "https://www.eclipse.org/downloads/",
      "descripcion": "IDE extensible mediante plugins, muy utilizado para desarrollo Java empresarial.",
      "licencia": "Open source"
    },
    {
      "nombre": "Apache Maven",
      "urlDescarga": "https://maven.apache.org/download.cgi",
      "descripcion": "Herramienta de construcción y gestión de dependencias para proyectos Java.",
      "licencia": "Open source"
    }
  ]
}
```

Cada herramienta incluye:

| Campo | Descripción |
|---|---|
| `nombre` | Nombre del IDE o herramienta |
| `urlDescarga` | Dirección oficial de descarga |
| `descripcion` | Breve descripción de para qué sirve |
| `licencia` | Tipo de licencia: Gratuita, Open source, De pago o Freemium |

Si no se envía el parámetro `lenguaje`, el servicio responde con `400 Bad Request`.

## Cómo empezar

1. Pulsa el botón **`Use this template`** (arriba a la derecha de este repositorio) → **`Create a new repository`**.
2. Elige **tu cuenta personal** como propietario (no la organización del curso).
3. Nombra tu repositorio como: `practica-02-ides-herramientas-<tu-nombre>`.
4. Clona tu nuevo repositorio y desarrolla la práctica sobre él.
5. Haz commits descriptivos a medida que avanzas.

## Entrega

Copia el enlace de tu repositorio y pégalo en la entrega correspondiente de la plataforma.

Este ejercicio es voluntario y está pensado para que pongas en práctica los conocimientos adquiridos y consolides lo aprendido en los módulos teóricos.

- 📌 La entrega de estos ejercicios es completamente opcional y no influye en la nota final del curso.
- 📌 Si decides realizarlos, el profesor los corregirá y te dará feedback personalizado sobre tu trabajo.
- 📌 Estos ejercicios tampoco afectan a la bonificación del curso a través de Fundae.
- 📌 En caso de completar los ejercicios voluntarios y obtener una calificación igual o superior a 5, TrainingIT emitirá un certificado adicional e independiente al de Fundae, reflejando una evaluación positiva de las acciones prácticas realizadas durante el curso.
