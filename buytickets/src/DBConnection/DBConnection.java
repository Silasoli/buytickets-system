package DBConnection;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author silas
 */
public class DBConnection {

    private String URL = "mongodb://localhost:27017/buytickets";

    public void tryToConnect() {
        try {
            MongoClientURI clientURI = new MongoClientURI(URL);
            MongoClient mongoClient = new MongoClient(clientURI);

            MongoDatabase mongoDatabase = mongoClient.getDatabase("buytickets");
            MongoCollection collection = mongoDatabase.getCollection("users");

            System.out.println("Database Connected");

            //Document doc = new Document("name", "Peter John");
            //doc.append("id", 12);
            //collection.insertOne(doc);
        } catch (Exception e) {
            //System.out.println(e);
        }

    }

}
