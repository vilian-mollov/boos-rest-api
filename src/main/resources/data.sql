DELETE FROM languages;
DELETE FROM countries;
DELETE FROM books;
DELETE FROM authors;


# Languages -------------------------------------------------------------------------------------------------

INSERT INTO languages ( `code`, `name` )
VALUES ("XX", "X");

INSERT INTO languages ( `code`, `name` )
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

# Countries ---------------------------------------------------------------------------------------------

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("XX", "X", "X");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("BG", "Bulgaria", "The Republic of Bulgaria");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("GB", " United Kingdom of Great Britain and Northern Ireland", "The United Kingdom of Great Britain and Northern Ireland");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("US", "United States of America", "The United States of America");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("DE", "Germany", "The Federal Republic of Germany");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("EE", "Estonia", "The Republic of Estonia");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("FI", "Finland", "The Republic of Finland");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("SA", "Saudi Arabia", "The Kingdom of Saudi Arabia");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("AE", "United Arab Emirates", "The United Arab Emirates");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("DK", "Denmark", "The Kingdom of Denmark");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("IT", " Italy", "The Italian Republic");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("CN", "China", "The People's Republic of China");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("BA", "Bosnia and Herzegovina", "Bosnia and Herzegovina");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("HU", "Hungary", "Hungary");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("JP", "Japan", "Japan");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("LU", "Luxembourg", "The Grand Duchy of Luxembourg");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("NO", "Norway", "The Kingdom of Norway");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("NP", "Nepal", "The Federal Democratic Republic of Nepal");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("RU", "Russian Federation", "The Russian Federation");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("SE", "Sweden", "The Kingdom of Sweden");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("UA", "Ukraine", "Ukraine");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("SR", "Serbia", "The Republic of Serbia");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("LV","Latvia" ,"The Republic of Latvia");

INSERT INTO countries ( `code`, `name`, `official_state_name` )
VALUES ("KR", "Korea", "The Republic of Korea");

# Books -------------------------------------------------------------------------------------------------

INSERT INTO books ( id, pages,  title, weight, cover )
VALUES (0, 0, 'X', 0.0, 0);

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

# Authors ------------------------------------------------------------------------------------------------

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (1, '1965', null, "Joanne", "Kathleen", "Rowling" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (1, '1965', null, "Joanne", "Kathleen", "Rowling" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (2, '1947', null, "Robert", "Toru", "Kiyosaki" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (3, '1847', '1912', "Abraham ", "", "Stoker" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (4, '1874', '1957', "George", "Samuel", "Clason" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (5, '1828', '1910', "Lev", "Nikolayevich", "Tolstoy" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (6, '1724', '1804', "Immanuel", "", "Kant" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (7, '-428', '-348', "Plato", "", "" );

INSERT INTO authors ( id, born_on, died_on, first_name, middle_name, last_name)
VALUES (8, '-384', '-322', "Aristotle", "", "" );