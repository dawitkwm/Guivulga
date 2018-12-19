 
INSERT INTO `AUTHENTICATION` (user,password,enabled) VALUES ('guest','guest', TRUE);
INSERT INTO `AUTHENTICATION` (user,password,enabled) VALUES ('admin','admin', TRUE);
 
INSERT INTO `AUTHORITY` (username, authority) VALUES ('guest', 'ROLE_USER');
INSERT INTO `AUTHORITY` (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO `AUTHORITY` (username, authority) VALUES ('admin', 'ROLE_USER');

INSERT INTO  `USERS` (firstname, lastname,email, version, is_admin, userid) VALUES ('Curious','George','george@curious.com',0,0,'admin');
INSERT INTO `USERS` (firstname, lastname, email, version, is_admin, userid) VALUES ('Allen','Rench','allen@wrench.com',0,0,'guest');

-- Banks

INSERT INTO `bank` (`name`, `bic`, `country`) VALUES ('US Bank One', 'usbankone', 'USA');
INSERT INTO `bank` (`name`, `bic`, `country`) VALUES ('US Bank Two', 'usbanktwo', 'USA');
INSERT INTO `bank` (`name`, `bic`, `country`) VALUES ('Mongolian Bank One', 'mnbankone', 'Mongolia');
INSERT INTO `bank` (`name`, `bic`, `country`) VALUES ('Ethiopian Bank One', 'etbankone', 'Ethiopia');

-- Branches

INSERT INTO `branch` (`branchcode`, `phone`) VALUES ('usbankone-branchone', '+1-541-754-3010');
INSERT INTO `branch` (`branchcode`, `phone`) VALUES ('usbanktwo-branchone', '+1-541-754-3011');
INSERT INTO `branch` (`branchcode`, `phone`) VALUES ('mnbankone-branchone', '+976-541-754-301');
INSERT INTO `branch` (`branchcode`, `phone`) VALUES ('etbankone-branchone', '+251-975-33-54-21');

-- Customers
INSERT INTO `customer` (`id`, `firstname`, `lastname`, `gender`, `birthday`) VALUES (NULL, 'John', 'Smith', 'M', '2018/08/08');
INSERT INTO `customer` (`id`, `firstname`, `lastname`, `gender`, `birthday`) VALUES (NULL, 'Julian', 'Smith', 'F', '2018/08/08');
INSERT INTO `customer` (`id`, `firstname`, `lastname`, `gender`, `birthday`) VALUES (NULL, 'Dawit', 'Wmariam', 'M', '2018/08/08');
INSERT INTO `customer` (`id`, `firstname`, `lastname`, `gender`, `birthday`) VALUES (NULL, 'Namchin', 'De', 'M', '2018/08/08');
INSERT INTO `customer` (`id`, `firstname`, `lastname`, `gender`, `birthday`) VALUES (NULL, 'John', 'Smith', 'M', '2018/08/08');

-- Accounts : IBAN: country-bank-branch-accountnumber
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('1000000000', 'us-bankone-branchone-1000000000', 5000.0,1);
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('1000000001', 'us-bankone-branchone-1000000001', 20000.0,1);
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('2000000000', 'us-banktwo-branchone-2000000000', 50000.0,2);
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('2000000001', 'us-banktwo-branchone-2000000001', 100000.0,2);
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('3000000000', 'mn-bankone-branchone-3000000000', 55000.0,3);
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('3000000001', 'mn-bankone-branchone-3000000001', 55000.0,4);
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('4000000000', 'et-bankone-branchone-4000000000', 25000.0,4);
INSERT INTO `account` (`acntno`, `iban`, `balance`, `customer`) VALUES ('4000000001', 'et-bankone-branchone-4000000001', 130000.0,5);





