1. Building application 

	mvn clean install
2. Running 
         mvn spring-boot:run

3. Dependnecies 

	Application expects mysql database to be available (user root password : root , listening on 127.0.0.1:3308)

	in order to start db go to mysql folder and run : docker-compose up

4. Endpoints :
	http://localhost:8089/list-games   - get
        http://localhost:8089/insert-game  - post -- accepts json  
	sample json to insert

       {
	"empId" : "empId",
	"gameId" : "gameId",
	"actionId" : "actionId"
       }



5. inne 

Konfiguracja jest w application properties -- tak na wszelki wypadek :)
  

     