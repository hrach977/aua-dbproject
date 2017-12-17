# aua-dbproject

Introduction
The backend deals with the elasticsearch queries.
It consists of two parts Service and Common. The first one deals with connecting to elasticsearch database and returns the result of the
query that is requested. It supports match queries for fields: "instructor_name", "title", "weekdays" and "cluster"; range queries for 
fields: "start_time" and "end_time"; term queries for field "department" and also antifilter query for busy time. 

For running locally
To run this programm on your node you need to configure application.properties file with your own properties, and also CourseFilters dto 
with the appropriate values. 
Now the database runs on crossplatforms with the help of the CrossOrigin annotation in controller. You can change it with your desired 
host address. 
