package mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Main {

    MongoClient mongoClient = MongoClients.create();
    MongoDatabase db = mongoClient.getDatabase("nueva");
}