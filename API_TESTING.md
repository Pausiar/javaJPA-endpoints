# API REST Testing - Valorant API

## Base URL
```
http://localhost:8080
```

---

## PERSONATGES

### GET - Listar todos
- **URL:** `http://localhost:8080/api/personatges`
- **Method:** GET

### GET - Obtener por ID
- **URL:** `http://localhost:8080/api/personatges/1`
- **Method:** GET

### POST - Crear personatge
- **URL:** `http://localhost:8080/api/personatges`
- **Method:** POST
- **Body:**
```json
{
    "nom": "Neon",
    "rol": "Duelista",
    "descripcio": "Agent filipina amb velocitat electrica",
    "imatge": "/img/neon.jpg"
}
```

### PUT - Actualizar personatge
- **URL:** `http://localhost:8080/api/personatges/1`
- **Method:** PUT
- **Body:**
```json
{
    "nom": "Jett Modificada",
    "rol": "Duelista",
    "descripcio": "Agent coreana actualitzada",
    "imatge": "/img/jett_v2.jpg"
}
```

### DELETE - Eliminar personatge
- **URL:** `http://localhost:8080/api/personatges/1`
- **Method:** DELETE

---

## ARMES

### GET - Listar todas
- **URL:** `http://localhost:8080/api/armes`
- **Method:** GET

### GET - Obtener por ID
- **URL:** `http://localhost:8080/api/armes/1`
- **Method:** GET

### POST - Crear arma
- **URL:** `http://localhost:8080/api/armes`
- **Method:** POST
- **Body:**
```json
{
    "nom": "Outlaw",
    "categoria": "Sniper",
    "preu": 2400,
    "descripcio": "Nou franctirador de dos trets",
    "imatge": "/img/outlaw.jpg"
}
```

### PUT - Actualizar arma
- **URL:** `http://localhost:8080/api/armes/1`
- **Method:** PUT
- **Body:**
```json
{
    "nom": "Classic Pro",
    "categoria": "Pistola",
    "preu": 0,
    "descripcio": "Pistola inicial millorada",
    "imatge": "/img/classic_pro.jpg"
}
```

### DELETE - Eliminar arma
- **URL:** `http://localhost:8080/api/armes/1`
- **Method:** DELETE

---

## MAPES

### GET - Listar todos
- **URL:** `http://localhost:8080/api/mapes`
- **Method:** GET

### GET - Obtener por ID
- **URL:** `http://localhost:8080/api/mapes/1`
- **Method:** GET

### POST - Crear mapa
- **URL:** `http://localhost:8080/api/mapes`
- **Method:** POST
- **Body:**
```json
{
    "nom": "Abyss",
    "descripcio": "Nou mapa sense barreres",
    "imatge": "/img/abyss.jpg"
}
```

### PUT - Actualizar mapa
- **URL:** `http://localhost:8080/api/mapes/1`
- **Method:** PUT
- **Body:**
```json
{
    "nom": "Ascent Reformat",
    "descripcio": "Mapa italia amb canvis",
    "imatge": "/img/ascent_v2.jpg"
}
```

### DELETE - Eliminar mapa
- **URL:** `http://localhost:8080/api/mapes/1`
- **Method:** DELETE

---

## HABILITATS

### GET - Listar todas
- **URL:** `http://localhost:8080/api/habilitats`
- **Method:** GET

### GET - Obtener por ID
- **URL:** `http://localhost:8080/api/habilitats/1`
- **Method:** GET

### POST - Crear habilitat
- **URL:** `http://localhost:8080/api/habilitats`
- **Method:** POST
- **Body:**
```json
{
    "nom": "Nova Habilitat",
    "descripcio": "Habilitat de prova",
    "tecla": "E",
    "imatge": "/img/habilitat.jpg"
}
```

### PUT - Actualizar habilitat
- **URL:** `http://localhost:8080/api/habilitats/1`
- **Method:** PUT
- **Body:**
```json
{
    "nom": "Cloudburst Millorat",
    "descripcio": "Fum mes gran i dura mes",
    "tecla": "C",
    "imatge": "/img/cloudburst_v2.jpg"
}
```

### DELETE - Eliminar habilitat
- **URL:** `http://localhost:8080/api/habilitats/1`
- **Method:** DELETE

---

## MODOS DE JUEGO

### GET - Listar todos
- **URL:** `http://localhost:8080/api/modosjuego`
- **Method:** GET

### GET - Obtener por ID
- **URL:** `http://localhost:8080/api/modosjuego/1`
- **Method:** GET

### POST - Crear modo de juego
- **URL:** `http://localhost:8080/api/modosjuego`
- **Method:** POST
- **Body:**
```json
{
    "nom": "Team Deathmatch",
    "descripcio": "Nou mode 5v5 sense bomba"
}
```

### PUT - Actualizar modo de juego
- **URL:** `http://localhost:8080/api/modosjuego/1`
- **Method:** PUT
- **Body:**
```json
{
    "nom": "Competitiu Actualitzat",
    "descripcio": "Mode ranquit amb millores"
}
```

### DELETE - Eliminar modo de juego
- **URL:** `http://localhost:8080/api/modosjuego/1`
- **Method:** DELETE

---

## Configuración en Postman

1. Selecciona el método (GET/POST/PUT/DELETE)
2. Pega la URL
3. Para POST y PUT:
   - Ve a **Body** → **raw** → selecciona **JSON**
   - Pega el JSON correspondiente
4. Click en **Send**

