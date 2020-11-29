# JDBC : Java DataBase Connectivity

The JDBC API defines interfaces and classes for writing database applications in Java by making database connections.

### Database

   Database is a set of files containing application data.
   
   This data needs to be inserted, deleted, updated, extracted for any valid reason.
   - To perform such actions, various programs can be written.
   - Else, readymade database manaagement softwares like MySQl, Oracle etc. can be used.


### JDBC Components

- **Driver**

   A JDBC Driver is a software component enabling a Java application to interact with a database.
   - Driver handles the communications with the database server, eg. Oracle.
   - Generally, we use Driver Manager objects, which manages objects of this type.
   - It also abstracts the details associated with working with Driver Objects.


- **Driver Manager**

   Driver Manager manages a list of database drivers.
   - It matches connection requests from the Java application with the proper database driver using communication sub-protocol.
   - The first driver that recognizes a certain sub-protocol under JDBC will be used to establish a connection.


- **Connection**

   Connection interface has all methods for connecting/contacting a database.
   - The connection object(a reference variable refering to the Connection interface) represents connection context, i.e., all communications with the database is through       connection object only.
   

- **Prepared Statement**

   Prepared Statement is an interface for representing SQL statements.
   - An SQL statement is precompiled and stored in a Prepared Statement object.
   - This object can then be used to efficently execute this statement multiple times.


- **Result Set**

   Result Set is an interface to represent a database table.
   - These objects hold data retrieved from a database after you execute an SQL query using Statement object.
   - It acts as an iterator to allow you moce through its data.


- **SQLException**

   SQLException is a sub-class of the Exception class in Java.
   - It is an exception that provides information on a database access error or other errors.



### Steps for Connection

- **Loading Driver**
   
   - A program can also explicitly load JDBC drivers at any time.
   - eg. my.sql.jdbc.Driver is loaded using the following statement:
   
   ```
   Class.forName("my.sql.jdbc.Driver");
   ```
   
   In the above line of code, we are registering JDBC driver in our program.
         
   **NOTE: Class is the predefined class in Java and forName() is a static method**
   
   
- **Establishing Connection**

   - When getConnection() is called, the Driver Manager will attempt to locate a suitable driver from amongst those loaded at initialization and those loaded explicitly.
   
   ```
   DriverManager.getConnection(url,username,password);
   ```
   
   - url: database url, eg. jdbc:mysql://localhost:3306/name_of_database
   
   **NOTE: getConnection() method returns Connection object on success, else null.**
   


- **Preparing Statement**
   
   - Connection interface has a method to prepare a statement(MySql statement).
   
   ```
   statement_object = connection_object.createStatement()
   ```
   
   The above statement is used to access our database.
         
   **NOTE: createStatement() method returns object of Prepared Statement**



- **Executing Statements**
   
   - Prepared Statement interface jas several methods to execute query.
   
   ```
   execute() : if insertion/deletion goes well, returns true, else false
   
   executeQuery() : for select statement(used to fetch data)
   
   executeUpdate() : used to update/add data in database
   ```
   


- **Getting Results**
   
   - ResultSet pbject can be obtained as a returned object by executeQuery() method of PreparedStatement.
   
   ```
   resultset_object = connection_object.statement_object.executeQuery();
   
   resultset_object = connection_object.statement_object.executeUpdate();
   ```
   
   ResultSet object when non null or non empty, can be iterated over that object to get results.
