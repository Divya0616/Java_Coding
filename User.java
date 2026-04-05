import java.util.ArrayList;
import java.util.Iterator;

public class User {

    private String name;
    private String email;

    private ArrayList<Document> documents;

    public User(String name, String email) {
        setEmail(email);
        this.name = name;
        this.documents = new ArrayList<>(); 
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public ArrayList<Document> getDocuments() {
        return new ArrayList<>(documents);
    }


    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email: must contain '@'.");
        }
        this.email = email;
    }
    public void addDocument(Document doc) {
        if (doc == null) {
            throw new IllegalArgumentException("Cannot add a null document.");
        }
        documents.add(doc);
        System.out.println("Document '" + doc.getTitle() + "' added to " + name + "'s list.");
    }

    public void removeDocument(String id) {
        Iterator<Document> iterator = documents.iterator();
        while (iterator.hasNext()) {
            Document doc = iterator.next();
            if (doc.getId().equals(id)) {
                System.out.println("Removed: " + doc.getTitle());
                iterator.remove(); 
                return;
            }
        }
        System.out.println("No document found with ID: " + id);
    }

    public void listDocuments() {
        if (documents.isEmpty()) {
            System.out.println(name + " has no documents.");
            return;
        }
        System.out.println("\n--- " + name + "'s Documents ---");
        for (Document doc : documents) {
            System.out.println(doc.getSummary()); 
        }
    }
}
