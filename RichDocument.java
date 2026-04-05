public class RichDocument extends Document {

    private boolean isBold;
    private boolean isItalic;
    private String fontColor;

    public RichDocument(String title, String content, String authorName) {
        super(title, content, authorName); 
        this.isBold = false;
        this.isItalic = false;
        this.fontColor = "black"; 
    }

    // GETTERS
    public boolean isBold() {
        return isBold;
    }

    public boolean isItalic() {
        return isItalic;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void applyFormatting(boolean bold, boolean italic) {
        this.isBold = bold;
        this.isItalic = italic;
    }

    public void setFontColor(String color) {
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Font color cannot be empty.");
        }
        this.fontColor = color;
    }

    @Override
    public String getSummary() {
        return super.getSummary() +
               " | Bold: " + isBold +
               " | Italic: " + isItalic +
               " | Color: " + fontColor +
               " | Type: Rich Text";
    }
}
