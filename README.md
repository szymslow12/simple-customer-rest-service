# simple-customer-rest-service
Customer Simple Rest Service

#### Example requests:

###### GET /api/customers/1 -> returns customer with id 1

###### POST /api/customers -> saves customer in repository and return newly added customer

#### Example Customer format



{

    customer: {
        'firstName': 'Jan',
        'lastName': 'Kowalski',
        'phoneNumber': '123123123',
        'email': 'kowalski@kowalski.com',
        'address': {
            'country': 'Poland',
            'city': 'Cracow',
            'street': 'Grodzka",
            'zip': '30-000'
        }
    }
}

#### Running app:

###### I recommend to run this application in your ide. Can be easily run in Intellij  
###### Without ide: 

mvn clean package && java -jar target/simpleCustomerRestApi-0.0.1-SNAPSHOT.jar 

###### Then navigate to localhost:8080/api/customers/1