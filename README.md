# Projet de Motivation : API et Application Web

Ce projet est composé de deux applications Spring Boot : une API qui fournit des citations inspirantes et une application web qui permet aux utilisateurs de soumettre des messages et de recevoir des réponses inspirantes.

## Prérequis

- Java 11 ou version ultérieure
- Maven
- MySQL (ou tout autre SGBD configuré dans `application.properties`)

## Configuration

### Base de données

**Avant de lancer les projets**, assurez-vous d'avoir créé la base de données dans MySQL. Le nom de la base de données doit correspondre à celui spécifié dans les fichiers `application.properties` de chaque projet.

Exemple de configuration dans `application.properties` :

```properties
spring.datasource.url=jdbc\:mysql://localhost:3306/votre_base_de_donnees
spring.datasource.username=votre_utilisateur
spring.datasource.password=votre_mot_de_passe
spring.jpa.hibernate.ddl-auto=update
```

## Démarrage des Applications

### Étape 1 : Ouvrir deux fenêtres de terminal

- Une fenêtre pour l'API
- Une fenêtre pour l'application web

### Étape 2 : Lancer l'API

- Ouvrez un terminal et accédez au répertoire racine du projet de l'API.
- Exécutez la commande suivante pour démarrer l'API :

```bash

./mvnw spring-boot\:run

```

### Étape 3 : Lancer l'Application Web

- Ouvrez un autre terminal et accédez au répertoire racine du projet de l'application web.

- Exécutez la commande suivante pour démarrer l'application web :

```bash

./mvnw spring-boot\:run

```

### Accéder aux Applications

- API : L'API sera accessible à l'adresse `http://localhost:8081`. Vous pouvez tester l'endpoint [/getQuote](http://localhost:8081/getQuote)
  pour obtenir une citation aléatoire.
- Application Web : L'application web sera accessible à l'adresse `http://localhost:8080`. Vous pouvez y accéder via un navigateur web.
