# JPACRUDProject


### Project Description
This is a CRUD java web app that utilizes a SQL database. The database stores travel destinations and the information about them. Each destination can store information such as: id, country name, state / region, city, rating (1-5), has traveled (true or false), arrival date, and departure date.

This application allows a user to create destinations that they have taveled to or plan to travel to. The country, state/region, and city are the only fields required to enter a travel destination. Destinations can also be viewed, edited, and deleted. The homepage to the application shows a full list to all destinations, with links to each page with a printout of the destinations information and map of the location.

Edit and create pages are also available for full CRUD functionality. Along with the nav-bar containing "City search", "ID search", and create link available on each page.

### Technologies Used
- Java
  - ver: 1.8
- Spring Boot
- JPA
-  JSP / HTML
- CSS / BootStrap
- SQL / mysql
- JPQL

This project used a wide variety of technologies to create a responsive CRUD Java web application.

### What I learned

Spring boot with JPA allowed the mapping of this application to be dramatically simplified, and the overall process of creating the application a lot less complicated. Creating this application really solidified my understanding of the use of the controller to map your objects to JSPs to create a dynamic application. The use of JPA made implementing the DAO easy with auto setting destination objects from forum inputs.

I haven't used BootStrap before this project but it seems to come naturally to me. I must say the use of BootStrap allowed some really easy styling that's super easy to implement. I plan to experiment more with this style to get more comfortable with bootstrap. My time to style this project was drastically cut down due to its use.

I struggled greatly with figuring out the use of the google maps API key. I had some issues with validating the key while keeping it protected, ultimately I got the key set up correctly. This key was the key to getting the google maps iframe embed to the display. I had to have the key setup in the google developer console, and restrict the key for the "google maps embed API" only. This successfully displayed the maps iframe and kept my API key secure.  
