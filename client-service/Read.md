Simple db-service - CRUD operations


Create :
POST :
JSON input string
{
	
	"firstName":"John",
	"lastName":"Nelson",
	"dateOfBirth" :"1985-01-19",
	"gender" :"M",
	"cin" :"00300034",
	"pregnancyActive":"false",
	"maritalStatus":"married",
	"disabilityActive":"false",
	"ssn":"4555556677"
	
}

H2 Database Connection:

http://localhost:8100/h2-console
jdbc:h2:mem:testdb

