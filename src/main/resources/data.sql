DELETE FROM languages;
DELETE FROM books;
DELETE FROM authors;


# Languages -------------------------------------------------------------------------------------------------
INSERT INTO languages ( code, name )
VALUES ("BG", "Bulgarian");

INSERT INTO languages ( code, name )
VALUES ("EN", "English");

INSERT INTO languages ( code, name )
VALUES ("DE", "German");

INSERT INTO languages ( code, name )
VALUES ("ET", "Estonian");

INSERT INTO languages ( code, name )
VALUES ("FI", "Finnish");

INSERT INTO languages ( code, name )
VALUES ("AR", "Arabic");

INSERT INTO languages ( code, name )
VALUES ("DA", "Danish");

INSERT INTO languages ( code, name )
VALUES ("GA", "Irish");

INSERT INTO languages ( code, name )
VALUES ("IT", "Italian");

INSERT INTO languages ( code, name )
VALUES ("FR", "French");

INSERT INTO languages ( code, name )
VALUES ("ZH", "Chinese");

INSERT INTO languages ( code, name )
VALUES ("BS", "Bosnian");

INSERT INTO languages ( code, name )
VALUES ("HU", "Hungarian");

INSERT INTO languages ( code, name )
VALUES ("JA", "Japanese");

INSERT INTO languages ( code, name )
VALUES ("JV", "Japanese");

INSERT INTO languages ( code, name )
VALUES ("LA", "Latin");

INSERT INTO languages ( code, name )
VALUES ("LB", "Luxembourgish");

INSERT INTO languages ( code, name )
VALUES ("NO", "Norwegian");

INSERT INTO languages ( code, name )
VALUES ("NE", "Nepali");

INSERT INTO languages ( code, name )
VALUES ("RU", "Russian");

INSERT INTO languages ( code, name )
VALUES ("SW", "Swahili");

INSERT INTO languages ( code, name )
VALUES ("SV", "Swedish");

INSERT INTO languages ( code, name )
VALUES ("UK", "Ukrainian");

INSERT INTO languages ( code, name )
VALUES ("SR", "Serbian");

INSERT INTO languages ( code, name )
VALUES ("LV", "Latvian");

INSERT INTO languages ( code, name )
VALUES ("KO", "Korean");


# Books -------------------------------------------------------------------------------------------------
INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (1, 352, 'Harry Potter and the philosopher\'s stone', 0.290, 1);

INSERT INTO books (  id, pages,  title, weight, cover )
VALUES (2, 418, 'Dracula', 0.952543977, 0);

INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (3, 1504 ,'The Richest Man in Babylon', 0.816466266, 1);

INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (4, 1225, 'War and Peace', 1.81436948, 1);

INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (5, 692, 'The Republic', 0.330, 1);

INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (6, 100, 'The Critique of the Pure Reason', 0.571526386, 1);

INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (7, 200, 'Politics', 0.277825327, 0 );

INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (8, 108, 'The Bible', 0.159, 0);