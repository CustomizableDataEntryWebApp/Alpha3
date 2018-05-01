# Alpha3

Customizable Data Entry Web App for CSI 418y.

Use the follow accounts to access user restricted web pages.

### ADMIN - Username = "admin", Password = "admin". 
Can access /forms and /admin/privatePage
### USER - Username = "user", Password = "user". 
Can access /forms

To test examples, you might need to use incognito mode (user sessions are saved by browsers) :
http://burtonfeng.azurewebsites.net/forms can be accessed by admins AND users
http://burtonfeng.azurewebsites.net/admin/privatePage can ONLY be accesed by admins


# JAVA
The Controller can be found at: 
```/JavaResources/src/main/java/customizable/HomeController.java```


# Security
XML Security can be found at: 
```/src/main/webapp/WEB-INF/spring/appServlet/security-context.xml```

Read the ```<http>``` block to see how pages are being intercepted and logins are required.

Read the ```<user-service>``` block to see what accounts are available, and their roles.


# Servlet Context
The views are controlled from the controller (JAVA), but it is defined in :
```/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml```

This tells our web app where to find the jsp files that are used to generate the views


# Views
Can be found under:
```/src/main/webapp/WEB-INF/views```
### Forms
Where users will enter their search results. Can be accessed by BOTH users AND admins
### Home
The default page. Nothing special about it
### privatePage
Can only be accessed by admins. Will become the admin page that is used to customize user page
