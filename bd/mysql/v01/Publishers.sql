CREATE TABLE Publishers (
  publisher_id INT(8) AUTO_INCREMENT PRIMARY KEY, 
  name CHAR(30) NOT NULL, 
  url CHAR(80) NOT NULL
);
INSERT INTO Publishers VALUES ('0201', 'Addison-Wesley', 'www.aw-bc.com');
INSERT INTO Publishers VALUES ('0471', 'John Wiley & Sons', 'www.wiley.com');
INSERT INTO Publishers VALUES ('0262', 'MIT Press', 'mitpress.mit.edu');
INSERT INTO Publishers VALUES ('0596', 'O''Reilly', 'www.ora.com');
INSERT INTO Publishers VALUES ('019', 'Oxford University Press', 'www.oup.co.uk');
INSERT INTO Publishers VALUES ('013', 'Prentice Hall', 'www.phptr.com');
INSERT INTO Publishers VALUES ('0679', 'Random House', 'www.randomhouse.com');
INSERT INTO Publishers VALUES ('07434', 'Simon & Schuster', 'www.simonsays.com');
SELECT * FROM Publishers;
