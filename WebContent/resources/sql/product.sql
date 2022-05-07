CREATE TABLE IF NOT EXISTS product(
	id VARCHAR(10) NOT NULL,
	category VARCHAR(20),
	name VARCHAR(20),
	unitPrice  INTEGER,
	description TEXT,
	manufacturer VARCHAR(20),
	fileName  VARCHAR(20),
	PRIMARY KEY (id)
)default CHARSET=utf8;

desc product;

