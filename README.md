# Use MySql DB to execute the following scrip in order

### To create a new database schema
1. Create database wns;

### Use the newly created database schema
2. use wns;

### Execute the scripts to create sample data
3. migrate/src/main/resources/sql/table_schema.sql
4. migrate/src/main/resources/sql/sample_data.sql
5. migrate/src/main/resources/sql/stored_procedure.sql

### Execute the stored procedure in #5
6. CALL TREFR_ACCEPT_CRIT()



# To Run the project

7. Clone the project and import into eclipse
8. Set the following environment variable in eclipse to read the custom property file.









9. By defalut the embedded tomcat server runs on 8080 port
10. Once the servr started successfully, hit the following url(end-point) to download the data in CSV format 
