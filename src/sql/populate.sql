 
INSERT INTO `AUTHENTICATION` (user,password,enabled) VALUES ('guest','guest', TRUE);
INSERT INTO `AUTHENTICATION` (user,password,enabled) VALUES ('admin','admin', TRUE);
 
INSERT INTO `AUTHORITY` (username, authority) VALUES ('guest', 'ROLE_USER');
INSERT INTO `AUTHORITY` (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO `AUTHORITY` (username, authority) VALUES ('admin', 'ROLE_USER');

INSERT INTO  `USERS` (firstname, lastname,email, version, is_admin, userid) VALUES ('Curious','George','george@curious.com',0,0,'admin');
INSERT INTO `USERS` (firstname, lastname, email, version, is_admin, userid) VALUES ('Allen','Rench','allen@wrench.com',0,0,'guest');

