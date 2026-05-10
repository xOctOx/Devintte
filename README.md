# Jeu de Devinettes - Java

Petit projet Java de console permettant à un joueur de deviner un nombre aléatoire entre 1 et 100 avec un nombre limité d’essais.

---

# Fonctionnalités

- Génération d’un nombre aléatoire
- Saisie utilisateur avec `Scanner`
- Nombre limité d’essais
- Indications :
  - trop petit
  - trop grand
- Message de victoire ou de défaite
- Utilisation de boucles et conditions

---

# Structure du projet

```text
Devinette.java
```

---

# Description du programme

Le programme :
1. génère un nombre aléatoire entre 1 et 100,
2. donne 10 essais au joueur,
3. compare chaque réponse,
4. affiche un message de victoire ou de défaite.

---

# Importations utilisées

```java
import java.util.Random;
import java.util.Scanner;
```

## `Random`

Permet de générer un nombre aléatoire.

## `Scanner`

Permet de lire les entrées clavier de l’utilisateur.

---

# Variables principales

```java
int nbreADevine
```

Nombre aléatoire que le joueur doit trouver.

---

```java
int nbreEssai = 10;
```

Nombre maximum d’essais autorisés.

---

```java
int comptEssai = 0;
```

Compteur du nombre d’essais effectués.

---

```java
boolean aGagne = false;
```

Indique si le joueur a gagné ou non.

---

# Génération du nombre aléatoire

```java
int nbreADevine = random.nextInt(100) + 1;
```

## Explication

```java
random.nextInt(100)
```

génère un nombre entre :

```text
0 et 99
```

Donc :

```java
+ 1
```

permet d’obtenir :

```text
1 à 100
```

---

# Boucle principale du jeu

```java
while (comptEssai < nbreEssai)
```

## Fonctionnement

La boucle continue tant que :
- le joueur n’a pas utilisé tous ses essais,
- et qu’il n’a pas trouvé le nombre.

---

# Lecture de la réponse utilisateur

```java
int devine = scanner.nextInt();
```

Permet de lire le nombre tapé par le joueur.

---

# Vérification de la réponse

## Si le nombre est trop petit

```java
if (devine < nbreADevine)
```

Message affiché :

```text
Trop petit !
```

---

## Si le nombre est trop grand

```java
else if (devine > nbreADevine)
```

Message affiché :

```text
Trop grand !
```

---

## Si le nombre est correct

```java
else
```

Le joueur gagne :

```java
aGagne = true;
break;
```

### `break`

Permet de quitter immédiatement la boucle.

---

# Affichage du résultat final

## Si le joueur gagne

```java
if (aGagne)
```

Affiche un message de victoire.

---

## Sinon

```java
else
```

Affiche un message de défaite avec le nombre correct.

---

# Exemple d’exécution

```text
*******Jeu de Devinettes***********
Devinez un nombre entre 1 et 100.
Vous avez 10 essais.
-----------------------------------

Essai 1/10 — Votre réponse : 50
Trop petit !

Essai 2/10 — Votre réponse : 75
Trop grand !

Essai 3/10 — Votre réponse : 62
Félicitations ! Vous avez trouvé le nombre.
```

---

# Concepts Java utilisés

- Variables
- Types primitifs (`int`, `boolean`)
- Conditions (`if`, `else if`, `else`)
- Boucles `while`
- Objets
- Méthodes
- `Scanner`
- `Random`
- Comparaison
- Entrées utilisateur
- Affichage console

---

# Améliorations possibles

- Ajouter différents niveaux de difficulté
- Ajouter un mode multijoueur
- Permettre de rejouer
- Ajouter un score
- Limiter les erreurs de saisie
- Ajouter une interface graphique

---

# Auteur
Ouattara Cheick Tydiane Othniel

Projet Java débutant pour apprendre :
- les boucles,
- les conditions,
- les entrées utilisateur,
- et la logique de programmation.
