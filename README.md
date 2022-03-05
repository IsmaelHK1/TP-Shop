Ismaël Hacquin
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=5820736&assignment_repo_type=AssignmentRepo)
# Java - TP : Shop

## Date : 

15/10/2021 
Durée : 4h

## Context

Un nouveau client vous contact pour la création d'une application de gestion de son magasin. Ce client possède un magasin exposant dans les rayons, des produits aux clients.

Via l'application, les clients doivent pouvoir acheter les produits qu'ils souhaitent et donc gérer leur panier.


## Fonctionnalités

> Cette partie est noté sur **10 points**

### Chargement du fichier de stock

Un fichier contenant tous les produits disponibles dans le stock du magasin vous à été fourni. Il sera nécessaire de charger ce fichier et d'en extraire tous les produits.

### Options de l'utilisateur

Au sein de votre application, les utilisateurs auront plusieurs choix. Ces choix seront représentés par un menu s'affichant après chaque action et par défaut lors du démarrage de l'application.

#### Afficher les produits

Un utilisateur doit pouvoir consulter tous les produits présent dans le magasin. Un produit présent correspond à un produit en rayon.

Il sera nécessaire d'afficher les produits par ordre alphabétique. Chaque produit devrai afficher 3 informations :

* Id du produit
* Nom du produit
* Le prix du produit (en euros)
* Nombre de produit restant

#### Ajouter un produit au panier

Un utilisateur doit pouvoir ajouter un produit en rayon dans son panier. On veillera à mettre à jour le stock en conséquence.

#### Supprimer un produit du panier

Tous les produits ajoutés au panier doivent pouvoir être supprimé du panier et être remis en rayon. On veillera à mettre à jour le stock en conséquence.

#### Annuler le panier en cours

L'utilisateur doit pouvoir à tout moment annuler son panier et de ce fait remettre en rayon tous les produits. On veillera à mettre à jour le stock en conséquence.

On quittera par la suite l'application.

#### Passer en caisse

Lors du passage en caisse, il sera nécessaire d'afficher le prix total du panier à l'utilisateur.

On affichera en bleu cette information.

On quittera par la suite l'application.

## Gestion des erreurs

> Cette partie est noté sur **3 points**

Dans le cas d'une erreur, on veillera à ce que le programme ne s'arrête pas prématurément. 

Si une erreur survient à la suite d'une action utilisateur (ex: Sélection d'un index invalide), on affichera en rouge une erreur explicite à l'utilisateur avant de lui reproposer le menu de l'application.

## Contraintes techniques

> Cette partie est noté sur **7 points**

Pour la réalisation de cette application, plusieurs pré-requis ont été définies :

* L'application doit être au format console / terminal
* L'application doit fonctionner sur Windows, MacOS et Linux
* L'application doit être codé en Java
* Le modèle objet doit être respecté
* Le projet doit être organisé en namespaces
* L'utlisation de librairie externe est fortement conseillée
* Les convetions Java doivent être respectées

## Outils et aide

Afin de mener à bien ce TP, il vous est fourni un fichier JSON contenant tous les articles disponibles du magasin.

Il est possible d'utiliser vos cours et Internet pour réaliser ce TP.
