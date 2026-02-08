# API REST - Documentació dels Endpoints

## ARMES

### GET /api/armes (llistar totes)
```java
@GetMapping("/armes")
public List<Arma> obtindreArmes() {
    return (List<Arma>) armaRepository.findAll();
}
```

### GET /api/armes/{id} (obtindre una per id)
```java
@GetMapping("/armes/{id}")
public Arma obtindreArmaPerId(@PathVariable Long id) {
    return armaRepository.findById(id).orElse(null);
}
```

### POST /api/armes (crear)
```java
@PostMapping("/armes")
public Arma afegirArma(@RequestBody Arma arma) {
    return armaRepository.save(arma);
}
```

### PUT /api/armes/{id} (actualitzar)
```java
@PutMapping("/armes/{id}")
public Arma actualitzarArma(@PathVariable Long id, @RequestBody Arma arma) {
    if (!armaRepository.existsById(id)) {
        return null;
    }
    arma.setId(id);
    return armaRepository.save(arma);
}
```

### DELETE /api/armes/{id} (eliminar)
```java
@DeleteMapping("/armes/{id}")
public void eliminarArma(@PathVariable Long id) {
    armaRepository.deleteById(id);
}
```

---

## HABILITATS

### GET /api/habilitats (llistar totes)
```java
@GetMapping("/habilitats")
public List<Habilitat> obtindreHabilitats() {
    return (List<Habilitat>) habilitatRepository.findAll();
}
```

### GET /api/habilitats/{id} (obtindre una per id)
```java
@GetMapping("/habilitats/{id}")
public Habilitat obtindreHabilitatPerId(@PathVariable Long id) {
    return habilitatRepository.findById(id).orElse(null);
}
```

### POST /api/habilitats (crear)
```java
@PostMapping("/habilitats")
public Habilitat afegirHabilitat(@RequestBody Habilitat habilitat) {
    return habilitatRepository.save(habilitat);
}
```

### PUT /api/habilitats/{id} (actualitzar)
```java
@PutMapping("/habilitats/{id}")
public Habilitat actualitzarHabilitat(@PathVariable Long id, @RequestBody Habilitat habilitat) {
    if (!habilitatRepository.existsById(id)) {
        return null;
    }
    habilitat.setId(id);
    return habilitatRepository.save(habilitat);
}
```

### DELETE /api/habilitats/{id} (eliminar)
```java
@DeleteMapping("/habilitats/{id}")
public void eliminarHabilitat(@PathVariable Long id) {
    habilitatRepository.deleteById(id);
}
```

---

## MAPES

### GET /api/mapes (llistar tots)
```java
@GetMapping("/mapes")
public List<Mapa> obtindreMapes() {
    return (List<Mapa>) mapaRepository.findAll();
}
```

### GET /api/mapes/{id} (obtindre un per id)
```java
@GetMapping("/mapes/{id}")
public Mapa obtindreMapaPerId(@PathVariable Long id) {
    return mapaRepository.findById(id).orElse(null);
}
```

### POST /api/mapes (crear)
```java
@PostMapping("/mapes")
public Mapa afegirMapa(@RequestBody Mapa mapa) {
    return mapaRepository.save(mapa);
}
```

### PUT /api/mapes/{id} (actualitzar)
```java
@PutMapping("/mapes/{id}")
public Mapa actualitzarMapa(@PathVariable Long id, @RequestBody Mapa mapa) {
    if (!mapaRepository.existsById(id)) {
        return null;
    }
    mapa.setId(id);
    return mapaRepository.save(mapa);
}
```

### DELETE /api/mapes/{id} (eliminar)
```java
@DeleteMapping("/mapes/{id}")
public void eliminarMapa(@PathVariable Long id) {
    mapaRepository.deleteById(id);
}
```

---

## MODOS DE JUEGO

### GET /api/modosjuego (llistar tots)
```java
@GetMapping("/modosjuego")
public List<ModoJuego> obtindreModos() {
    return (List<ModoJuego>) modoJuegoRepository.findAll();
}
```

### GET /api/modosjuego/{id} (obtindre un per id)
```java
@GetMapping("/modosjuego/{id}")
public ModoJuego obtindreModoPerId(@PathVariable Long id) {
    return modoJuegoRepository.findById(id).orElse(null);
}
```

### POST /api/modosjuego (crear)
```java
@PostMapping("/modosjuego")
public ModoJuego afegirModo(@RequestBody ModoJuego modoJuego) {
    return modoJuegoRepository.save(modoJuego);
}
```

### PUT /api/modosjuego/{id} (actualitzar)
```java
@PutMapping("/modosjuego/{id}")
public ModoJuego actualitzarModo(@PathVariable Long id, @RequestBody ModoJuego modoJuego) {
    if (!modoJuegoRepository.existsById(id)) {
        return null;
    }
    modoJuego.setId(id);
    return modoJuegoRepository.save(modoJuego);
}
```

### DELETE /api/modosjuego/{id} (eliminar)
```java
@DeleteMapping("/modosjuego/{id}")
public void eliminarModo(@PathVariable Long id) {
    modoJuegoRepository.deleteById(id);
}
```

---

## PERSONATGES

### GET /api/personatges (llistar tots)
```java
@GetMapping("/personatges")
public List<Personatge> obtindrePersonatges() {
    return (List<Personatge>) personatgeRepository.findAll();
}
```

### GET /api/personatges/{id} (obtindre un per id)
```java
@GetMapping("/personatges/{id}")
public Personatge obtindrePersonatgePerId(@PathVariable Long id) {
    return personatgeRepository.findById(id).orElse(null);
}
```

### POST /api/personatges (crear)
```java
@PostMapping("/personatges")
public Personatge afegirPersonatge(@RequestBody Personatge personatge) {
    return personatgeRepository.save(personatge);
}
```

### PUT /api/personatges/{id} (actualitzar)
```java
@PutMapping("/personatges/{id}")
public Personatge actualitzarPersonatge(@PathVariable Long id, @RequestBody Personatge personatge) {
    if (!personatgeRepository.existsById(id)) {
        return null;
    }
    personatge.setId(id);
    return personatgeRepository.save(personatge);
}
```

### DELETE /api/personatges/{id} (eliminar)
```java
@DeleteMapping("/personatges/{id}")
public void eliminarPersonatge(@PathVariable Long id) {
    personatgeRepository.deleteById(id);
}
```


