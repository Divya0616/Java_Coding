
public class TextDocument extends Document {

    private int wordCount;

    public TextDocument(String title, String content, String authorName) {
        super(title, content, authorName); 
        this.wordCount = calculateWordCount(content);
    }

    private int calculateWordCount(String content) {
        if (content == null || content.isBlank()) return 0;
        return content.trim().split("\\s+").length;
    }

    // GETTER for wordCount
    public int getWordCount() {
        return wordCount;
    }


    @Override
    public String getSummary() {
        return super.getSummary() + " | Word Count: " + wordCount + " | Type: Plain Text";
    }
}
