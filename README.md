# MINI-Projet_AITAIDER-Ouerdia

M1 MIAGE Apprentissage
Projet : Programmation Web


Nom du projet : Hogwarts Turnover




Réalisé par AIT AIDER Ouerdia
Assistante MOA chez Hachette Livre


Contexte :


J’ai donc décidé de travailler seule sur ce mini projet. N’ayant pas fait de la programmation web auparavant, je ne voulais pas ralentir mes camarades. J’ai avancé à mon rythme. J’espère avoir rempli les demandes du cahier des charges.


Lien vers le rapport en format Google Docs :
https://docs.google.com/document/d/11ays1GLA9oGS_2rLHTx5Hk6L4goS2lrOhcMj-h12uF8/edit

Lien vers le dossier Drive contenant  l’archive du projet :
https://drive.google.com/drive/folders/1PFHIabwY26Tl3zFXplO0Ayr8yAl7Vl7X?usp=sharing



Lien Git  vers le projet :
https://github.com/OuerdiaAIT/MINI-Projet_AITAIDER-Ouerdia


Lien vers la  vidéo - Démo du jeu : 
https://drive.google.com/file/d/1lA56SV1RuHF9j8cBGP_eTi1v_5F-TK4Z/view?usp=sharing




Merci et bonne continuation 


Dans ce rapport, vous trouverez :


un résumé des fonctionnalité développées 
Un lien vers le git du projet 
Un lien vers la vidéo: démo du projet




Le projet en question, nommé Hogwarts Turnover, est inspiré du monde de la Saga Harry Potter. J’ai pris la liberté de reprendre les noms des acteurs pour les joueurs et les ennemis, ainsi que des avatars représentatifs. 


Je me suis aussi inspirée d’animations en open source, que j’ai ensuite adapté à mon jeu côté front.


En plus des fonctionnalités demandées ( Attack - Dodge), j’ai ajouté d’autres fonctionnalités telles que la possibilité de prendre des potions pour reprendre des forces et pour augmenter la valeur de l’attaque.




Principe du jeu:




Il s’agit là d’un jeu de combat où s'affrontent des sorciers. On choisit le personnage avec lequel on veut jouer et celui-ci affronte les autres sorciers.


Chaque fois qu’on parvient à vaincre l’adversaire, on peut affronter d’autres personnages, ou simplement décider d’en rester là (arrêter le jeu). 


Il y’a trois niveaux de difficulté. Les caractéristiques des adversaires dépendent du niveau auquel il appartient : easy , medium ou hard.


Les mots clés renvoient vers les pages, assurez-vous de lancer le projet en parallèle.
 


La page de garde :




La page de garde, index, affiche en grosses lettres le nom du jeu. On est invité à entamer une partie pour cela , il faut appuyer sur Start the game.




Choose your character




Start the game, nous dirige vers la page, Choose your character. 


A ce moment là, VOLUME UP ! pour pouvoir apprécier Hedwigs Theme, la musique de la bande originale du film Harry Potter à l'école des sorciers.


A cette étape, il faut choisir le personnage avec lequel on souhaite jouer, entre Harry Potter, Ron Weasley et Hermione Granger.
Chacun des trois joueurs proposés possède des caractéristiques de début de partie propre à lui. On peut les lire en parcourant la carte du joueur avec le curseur de la souris. Les caractéristiques du joueur s’affichent donc au revers de la carte ainsi que le bouton permettant de le sélectionner.


Les caractéristiques des joueurs amis et ennemis sont :
L’attaque : représentant la valeur du dommage causé lors d’une attaque.
HP : Health Points , points de vie de départ, qui diminuent à chaque coup reçu.
Dodge : la probabilité de contrer une attaque en pourcentage.


La partie se termine lorsque l’un des joueurs n’a plus de points de vie.


 On choisit le joueur souhaité, en cliquant sur “Choose” au revers de sa carte. Ce qui nous amène à la page Choose your difficulty.




Choose your difficulty 


On peut choisir le niveau de difficulté du jeu, entre easy, medium et hard. 


Le niveau de difficulté sert à différencier les adversaires. Le nombre de points de vie, la valeur de l’attaque et le pourcentage de l’esquive varient d’un niveau à l’autre.


Il y’a 3 adversaires dans chaque catégorie.


En choisissant la difficulté, on est renvoyé vers la page Opponent.




Opponent 


Selon le niveau choisi, le premier adversaire s’affiche sur une carte portant son nom et son avatar. On peut aussi y lire ses caractéristiques (Attaque - Point de Vie HP) ainsi qu’une citation choisie aléatoirementi avec la fonction getRandomQuote().




On débute la partie en cliquant sur la carte de l’adversaire. A ce moment-là, on est redirigé vers la page fight ou les deux personnages s’affrontent.




Fight 


Sur fight , on trouve l’arène du jeu. C’est là que les adversaires s’affrontent 


On y trouve :


Le champ ou l’on peut suivre (lire) l’avancé du combat.
Les caractéristiques de l’adversaire en haut à droite
Les caractéristiques de notre joueur en bas à gauche.
Les boutons d’action de notre joueur.


Tout au long de la partie, on peut choisir soit d’attaquer l’adversaire soit d’esquiver ses coups. Les coups s’affichent sur la fenêtre du haut au fur et à mesure qu’on avance dans le jeu.


Pour rappel, la valeur de dodge représente la probabilité que le coup soit esquivé. Cas de figure rencontrés en utilisant le bouton dodge : 


1. On ne parvient pas à esquiver le coup et l’adversaire nous inflige un dommage (réduction de nos Health Points de la valeur d’attaque de l’adversaire, rien du côté de l’adversaire). 
2. On esquive le coupe et nos HP restent inchangés, 
3. L’adversaire ne parvient pas à esquiver notre coup (réduction des Health Points de l’adversaire de notre valeur d’attaque de l’adversaire, rien de notre côté). 
4. L’adversaire parvient à esquiver notre coup, rien ne se passe.
Voir fonctions:

foeAttackPlayer()
playerAttackFor()
dodge()
foeDodge()


A chaque partie, on peut  choisir de prendre une potion pour ajouter 10 points de vie ou pour augmenter la puissance de notre attaque de 10. Ces boutons ne sont utilisables qu’une seule fois, ils disparaissent après utilisation.


En choisissant d’attaquer, si les deux parties attaquent simultanément. Si l’attaque n’est pas contrée, les points de vie diminuent.
 
La partie s’arrête dès qu’un des joueurs n’a plus de points de vie.


Si c’est nous qui mourrons en premier. On est informé que notre joueur est vaincu et nous ne pouvons plus faire d’action. 
On nous redirige vers la page Lost.


Si c’est l’adversaire qui est vaincu, on a le choix entre terminer le jeu, ce qui nous renvoie vers la page won ou affronter l'adversaire suivant en cliquant sur confront next foe.


En cliquant sur confront next foe, on retourne à la page Opponent où on nous donne des informations sur le prochain adversaire.




Lorsqu’on gagne contre tous les adversaires du niveau choisi, on est redirigé vers la page Won




Won/Lost




Selon si on a gagné ou perdu, on est renvoyé vers Won ou Lost.respectivement.


Sur Won : on retrouve le décor de Poudlard (Hogwarts),
Sur Lost : on retrouve le décor de Serpentard (Slitherine)


 Les statistiques du jeu sont sur le revers de la carte affichée. On y trouve aussi le bouton Play again qui renvoie vers la page d’accueil si l’on souhaite rejouer une partie.




Il est stipulé dans le cahier des charge qu’il est impératif de faire au moins un appel ajax, le voici :
        
function getNext(){
                var xhr = new XMLHttpRequest();
                xhr.open('GET', 'nextFoe');
                xhr.send()
        }


Ce qui permet de récupérer le prochain adversaire si on souhaite continuer la partie.




Le mode devs permet de voir les cookies permettant de suivre la partie.


Les cookies sont supprimés au début du jeu.  


<script>
        deleteAllCookies();
</script>


Note :


En plus de l’aspect dynamique. Je me suis beaucoup investie sur la partie front dans la réalisation du jeu du fait de mon manque de pratique en js.


Ce fut une expérience très enrichissante, tant sur le plan technique que sur le plan artistique. Manque de temps, je n’ai pas pu aller au bout du projet. Je n’ai donc pas pu rajouter toutes les fonctionnalités souhaitées.
