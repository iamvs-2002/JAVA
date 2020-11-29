# JDBC : Java DataBase Connectivity

The JDBC API defines interfaces and classes for writing database applications in Java by making database connections.

- **Database**

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
