public class Document extends DocumentItem {

    private String title;
    private String content;
    private String authorName;
    private boolean isPublished;

    public Document(String title, String content, String authorName) {
        super(); 
        setTitle(title);      
        setContent(content);   
        this.authorName = authorName;
        this.isPublished = false;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty or null.");
        }
        this.title = title; 
    }

    public void setContent(String content) {
        if (content == null) {
            throw new IllegalArgumentException("Content cannot be null.");
        }
        this.content = content;
    }

    public void publish() {
        this.isPublished = true;
    }
    @Override
    public String getSummary() {
        return "Title: " + title +
               " | Author: " + authorName +
               " | Published: " + isPublished +
               " | Created: " + getCreatedAt(); 
    }
}
