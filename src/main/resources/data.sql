
insert into marque (id, name) values (1,'Reuno');
insert into marque (id, name) values (2,'DMW');
insert into marque (id, name) values (3,'Citron');
insert into marque (id, name) values (4,'Tela');
insert into marque (id, name) values (5,'Fort');

insert into vendeur (id, name) values (1,'Dédé');
insert into vendeur (id, name) values (2,'Supcar');
insert into vendeur (id, name) values (3,'Carexpress');
insert into vendeur (id, name) values (4,'Momo');
insert into vendeur (id, name) values (5,'OldCar');

insert into adresse (id, adresse, vendeur_id) values (1,'38 rue des Poetes', 1);
insert into adresse (id, adresse, vendeur_id) values (2,'5 rue des Barbiers', 2);
insert into adresse (id, adresse, vendeur_id) values (3,'16 av. DeGaulle', 3);
insert into adresse (id, adresse, vendeur_id) values (4,'195 rue du Marché', 4);
insert into adresse (id, adresse, vendeur_id) values (5,'214 bvd. des Chats', 5);

insert into client (id, name) values (1,'Bob');
insert into client (id, name) values (2,'Jack');
insert into client (id, name) values (3,'Robert');
insert into client (id, name) values (4,'Charles');
insert into client (id, name) values (5,'Gerard');
insert into client (id, name) values (6,'Sam');
insert into client (id, name) values (7,'David');
insert into client (id, name) values (8,'Joseph');
insert into client (id, name) values (9,'Hugo');
insert into client (id, name) values (10,'Antoine');

insert into voiture (id, name, client_id, marque_id) values (1, '208', 1, 1);
insert into voiture (id, name, client_id, marque_id) values (2, '3008', 2, 1);
insert into voiture (id, name, client_id, marque_id) values (3, 'modele S', 3, 2);
insert into voiture (id, name, client_id, marque_id) values (4, 'dyane', 4, 2);
insert into voiture (id, name, client_id, marque_id) values (5, 'clio', 5, 3);
insert into voiture (id, name, client_id, marque_id) values (6, 'scenic', 6, 3);
insert into voiture (id, name, client_id, marque_id) values (7, 'multipla', 7, 4);
insert into voiture (id, name, client_id, marque_id) values (8, 'zeubi', 8, 4);
insert into voiture (id, name, client_id, marque_id) values (9, 'lamouche', 9, 5);
insert into voiture (id, name, client_id, marque_id) values (10,'monster truck', 10, 5);

insert into vend (vendeur_id, marque_id) values (1,1);
insert into vend (vendeur_id, marque_id) values (2,2);
insert into vend (vendeur_id, marque_id) values (3,3);
insert into vend (vendeur_id, marque_id) values (4,4);
insert into vend (vendeur_id, marque_id) values (5,5);

