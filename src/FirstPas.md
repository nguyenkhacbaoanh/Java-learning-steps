# Programmation orientée objet
## Licence d'informatique --- Feuille n° 1
### Premiers pas
> On rappelle qu'il est préférable en Java que chaque classe soit définie dans un fichier qui lui est propre. Le nom du fichier doit être le nom de la classe qu'il contient, auquel on ajoute le suffixe .java. Les noms de classes doivent être constitués de mots acollés avec la première lettre en majuscule.

---


### Exercice n° 1 (Hello Groland!)
Écrire un programme Java qui affiche Hello Groland!. Compiler et exécuter ce programme

---


### Exercice n° 2
En Java, les chaînes de caractères sont représentées par des objets de la classe String, dont les instances sont non mutables. On souhaite pouvoir convertir des chaînes de caractères contenant des nombres en valeur entières. Le faire en utilisant la méthode statique static int parseInt(String) de la classe Integer. Définir une chaîne de caractères contenant un entier et obtenir sa valeur sous forme d'entier (int). Faire attention au fait que la méthode parseInt peut lever l'exception NumberFormatException. Déclarer une chaîne de caractères contenant un nombre réel et obtenir sa valeur sous la forme d'un flottant (double).

> script corrigé pour Exo1 et Exo2 est [la](./POO/FirstPas.java)
---


### Exercice n° 3 (Tableaux)
* Déclarer deux tableaux t1 et t2 d'entiers.
* Créer pour t1 et t2 des tableaux de 5 entiers.
* Initialiser t2 avec les valeurs 1, 567, -23, 78 et 4.
* Comment faire la déclaration, la création et l'initialisation d'un tableau t3 en une seule instruction ?
* Écrire une méthode statique pour trouver le plus petit élément d'un tableau.
* Écrire une méthode statique pour trier les éléments d'un tableau.

---

### Exercice n° 4
Écrire une programme prenant sur la ligne de commande une expression mathématique en notation préfixée, de la forme opérateur nombre nombre et qui l'évalue.

---


### Exercice n° 5
Écrire une programme qui prend une liste d'entiers sur la ligne de commande, les recopie dans un tableau d'entiers, trie le tableau puis finalement affiche le contenu du tableau.

---


### Exercice n° 6 (Références et égalités)
* Créer un tableau t de 4 références sur des chaînes de caractères. Créer une chaîne de caractères dont le contenu est "Bon". Affecter les 2 premiers éléments du tableau avec cette chaîne et le troisième avec la chaîne "Bonjour". Créer une nouvelle chaîne de caractères dont le contenu est à nouveau "Bon" et affecter cette chaîne au dernier élément du tableau t. Comparer 2 à 2 les éléments du tableaux en utilisant les méthodes String.equals(), String.compareTo(), et l'opérateur ==. Que constate-t-on ?
* Concaténer t[0] avec la chaîne "jour" en utilisant la méthode String.concat() ou l'opérateur +. Comparer 2 à 2 les éléments du tableaux en utilisant les méthodes String.equals(), String.compareTo(), et l'opérateur ==. Que constate-t-on ?

---

### Exercice n° 7
* Écrire une classe Point représentant un point dans le plan et possédant un constructeur Point(int, int), une méthode réalisant une translation, et une méthode de comparaison de signature boolean sameAs(Point).
* Créer un point et le désigner par deux références p1 et p2. Comparer p1 et p2 avec l'opérateur == et avec la méthode sameAs. Effectuer une translation de p1 et refaire les comparaisons. Que constate-t-on ?
* Soit le code suivant
>        p1 = new Point(1,1);
>        p2 = new Point(1,1);
    
Comparer à nouveau p1 et p2. Que constate-t-on ? Exécuter l'affectation p1 = p2. Que devient l'objet qui était référencé par p2.

---

### Exercice n° 8
Déclarer un tableau t1 contenant les valeurs 2, 7, 5, 21 et -7. Recopier t1 dans un tableau t2. Comparer les tableaux t1 et t2 en utilisant l'opérateur == et la méthode equals.