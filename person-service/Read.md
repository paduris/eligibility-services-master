Simple db-service - CRUD operations


Create :
POST :
JSON input string
{
	"id":"1",
	"firstName":"John",
	"lastName":"Nelson",
	"dateOfBirth" :"1985-01-19",
	"gender" :"M"
}

H2 Database Connection:

http://localhost:8100/h2-console
jdbc:h2:mem:testdb

