import java.time.LocalDateTime;
import java.util.UUID;

public abstract class DocumentItem {

    private String id;
    private String createdAt;

    public DocumentItem() {
        // UUID generates a unique random ID like "a3f9-12bc-..." every time
        this.id = UUID.randomUUID().toString();
        // Records the exact moment this document was created
        this.createdAt = LocalDateTime.now().toString();
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public abstract String getSummary();
}