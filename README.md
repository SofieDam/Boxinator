# BoxinatorApplication
Boxinator is a tiny application for calculating shipping cost of boxes to specific locations around the world. The application consists of two simple views, one form to add a box and one table listing all the boxes that is pulled from the same database.

The project is seperated into two different folders, */BoxinatorApplication/Server*  and */BoxinatorApplication/Client*,  where the backend and frontend are located respectively. 

## Technologies
Following technologies as been used to develop this project.

**Server-side:**
-	MySLQ
-	Java, (Spring Boot & Maven framework)

**Client-side:**
-	HTML 
-	CSS
-	Javascript (React & Redux)

## Tools
-	Server development: Eclipse 
-	Client development: Visual Studio Code
-	MySQL database
-	Postman for checking API

## Getting Started
1.	Pull the project from github

### Connect to database
2.	Start MySQL workbench and connect to local database. 

    **Note:** Remember the *“Host-name”, “Port”, “Username” and “Password”*.
    
3.	Create a new *Schema* called **"boxinator”** 

4.	Create a new *Table* called **“box_table”** with following columns: 

  ```
    id      int(11) PK
    name    varchar(255)
    weight  int(11)
    color   varchar(255)
    country varchar(255)
  ```
 
### Server-side: Set-up
5.	Open folder */BoxinatorApplication/server/BoxinatorApp* in Eclipse.

6.	Open file **“application.properties”** located in **BoxinatorApp > src > main > resources** and set the data-source with your MySQL *“Host-name”, “Port”*, *“Username” and “Password”*, as follows:  

  ```
  
  spring.datasource.url=jdbc:mysql://"Host-name":"Port"/boxinator?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC
  spring.datasource.username="Username"
  spring.datasource.password="Password"
  
  ```

7.	**Note:**  The server is running on **port 8082**. Change the portnumber of your Tomcat server if needed.

8.	**Build:**
Right click the project */server/BoxinatorApp* **> Run as > Run Configurations >** dubble click *Maven Build* **>** in field “Goals: ,” type **clean install -DskipTests >** press *“Apply”* and then *“Run”*

9.	**Run:**
Right click the project */server/BoxinatorApp* **> Run as >** choose **Spring Boot App** 

### Client-side: Set-up
10. Open directory */BoxinatorApplication/Client/boxinator* in Eclipse **> Show in local terminal > Terminal**

11. Install the *node_modules*:
```bash
npm install
```

12. Start the application in browser by typing in the Terminal:

```bash
npm start
```

12. Open http://localhost:3000/ to see the application.


# Result

## View A: Addbox
Both http://localhost:3000/  and http://localhost:3000/addbox will send you to the following view:

<img src= https://user-images.githubusercontent.com/47758672/58108197-ad81b280-7beb-11e9-99ad-c49001a852a5.JPG width=70%>

When the Save-button is pressed, error messages will be shown if either input fields are empty, the selected box-color is of any kind of shade blue  

<img src= https://user-images.githubusercontent.com/47758672/58109315-b4112980-7bed-11e9-9548-ac6ed3567b36.JPG width=70%>

or the input weight is a negative value. The weight will then be default to value zero "0":

<img src= https://user-images.githubusercontent.com/47758672/58109416-e1f66e00-7bed-11e9-9e83-1d8e33e052a1.JPG width=70%>

## View B: Listboxes

All boxes that have susseccfully been added to the database can be shown in "List boxes" or http://localhost:3000/listboxes

<img src= https://user-images.githubusercontent.com/47758672/58109427-e4f15e80-7bed-11e9-857d-0ab6b46d0abd.JPG width=70%>

**Note:** The function of deleting boxes from the list is not implemented in this application. Please do it manually in your database if you desired to delete a box. 

Enjoy the application! :) 

// Sofie Dam
