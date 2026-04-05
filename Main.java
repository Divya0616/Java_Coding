public class Main {
    public static void main(String[] args) {

        System.out.println("========== DOCUMENT EDITOR DEMO ==========\n");

        System.out.println("--- Test 1: Creating a User ---");
        User user = new User("Divya", "divya@example.com");
        System.out.println("User created: " + user.getName() + " | Email: " + user.getEmail());

        System.out.println("\n--- Test 2: Creating Documents ---");
        TextDocument t1 = new TextDocument("Java Notes", "Java is object oriented and platform independent", "Divya");
        RichDocument r1 = new RichDocument("Project Report", "This report covers Q1 results and analysis", "Divya");

        System.out.println("TextDocument created: " + t1.getTitle() + " | Words: " + t1.getWordCount());
        System.out.println("RichDocument created: " + r1.getTitle());

        System.out.println("\n--- Test 3: Polymorphism (getSummary) ---");
        Document d1 = t1;
        Document d2 = r1;
        System.out.println(d1.getSummary());
        System.out.println(d2.getSummary());

        System.out.println("\n--- Test 4: Applying Formatting ---");
        r1.applyFormatting(true, false);
        r1.setFontColor("blue");
        System.out.println("After formatting: " + r1.getSummary());

        System.out.println("\n--- Test 5: Adding Documents to User ---");
        user.addDocument(t1);
        user.addDocument(r1);
        user.listDocuments();

        System.out.println("\n--- Test 6: Edit and Undo ---");
        DocumentEditor editor = new DocumentEditor();
        editor.addDocument(t1);
        editor.addDocument(r1);

        System.out.println("\nOriginal content: " + t1.getContent());
        editor.editContent(t1.getId(), "OOP makes code reusable and organized");
        System.out.println("After edit 1: " + t1.getContent());

        editor.editContent(t1.getId(), "This is the third version of the content");
        System.out.println("After edit 2: " + t1.getContent());

        editor.undo(t1.getId());
        System.out.println("After undo 1: " + t1.getContent()); 

        editor.undo(t1.getId());
        System.out.println("After undo 2: " + t1.getContent()); 

        editor.undo(t1.getId()); 

        System.out.println("\n--- Test 7: Search ---");
        editor.searchByTitle("report");
        editor.searchByTitle("xyz"); // no results

        System.out.println("\n--- Test 8: Publishing ---");
        t1.publish();
        System.out.println("After publish: " + t1.getSummary());

        System.out.println("\n--- Test 9: Validation (Error Handling) ---");
        try {
            TextDocument bad = new TextDocument("", "some content", "author");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        try {
            User badUser = new User("Test", "notanemail");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        System.out.println("\n--- Test 10: Delete and List All ---");
        editor.listAll();
        editor.deleteDocument(r1.getId());
        editor.listAll();

        System.out.println("========== ALL TESTS COMPLETE ==========");
    }
}
