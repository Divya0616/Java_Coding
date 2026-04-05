import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class DocumentEditor {

    private ArrayList<Document> allDocuments;

    private Stack<String> undoHistory;

    public DocumentEditor() {
        this.allDocuments = new ArrayList<>();
        this.undoHistory = new Stack<>();
    }
    public void addDocument(Document doc) {
        if (doc == null) {
            throw new IllegalArgumentException("Cannot add a null document.");
        }
        allDocuments.add(doc);
        System.out.println("Editor: Added document '" + doc.getTitle() + "'");
    }

    public void editContent(String id, String newContent) {
        Document doc = findById(id); // private helper method below
        if (doc == null) {
            System.out.println("Editor: No document found with ID: " + id);
            return;
        }
        undoHistory.push(doc.getContent());
        doc.setContent(newContent);
        System.out.println("Editor: Content updated for '" + doc.getTitle() + "'");
    }

    public void undo(String id) {
        if (undoHistory.isEmpty()) {
            System.out.println("Editor: Nothing to undo.");
            return;
        }
        Document doc = findById(id);
        if (doc == null) {
            System.out.println("Editor: Document not found.");
            return;
        }
        String previousContent = undoHistory.pop();
        doc.setContent(previousContent);
        System.out.println("Editor: Undo successful for '" + doc.getTitle() + "'");
    }

    public void searchByTitle(String keyword) {
        if (keyword == null || keyword.isBlank()) {
            System.out.println("Editor: Search keyword cannot be empty.");
            return;
        }
        System.out.println("\n--- Search results for: '" + keyword + "' ---");
        boolean found = false;
        for (Document doc : allDocuments) {
            if (doc.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(doc.getSummary());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No documents found matching '" + keyword + "'");
        }
    }
    public void deleteDocument(String id) {
        Iterator<Document> iterator = allDocuments.iterator();
        while (iterator.hasNext()) {
            Document doc = iterator.next();
            if (doc.getId().equals(id)) {
                System.out.println("Editor: Deleted '" + doc.getTitle() + "'");
                iterator.remove();
                return;
            }
        }
        System.out.println("Editor: No document found with ID: " + id);
    }

    public void listAll() {
        if (allDocuments.isEmpty()) {
            System.out.println("Editor: No documents available.");
            return;
        }
        System.out.println("\n--- All Documents in Editor ---");
        for (Document doc : allDocuments) {
            System.out.println(doc.getSummary()); 
            System.out.println("  ID: " + doc.getId());
            System.out.println();
        }
    }
    private Document findById(String id) {
        for (Document doc : allDocuments) {
            if (doc.getId().equals(id)) {
                return doc;
            }
        }
        return null; 
    }
}