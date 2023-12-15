
package com.tech.blog.entities;


public class Message {
    private String content;
    private String type;
    private String casClass;

    public Message(String content, String type, String casClass) {
        this.content = content;
        this.type = type;
        this.casClass = casClass;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCasClass() {
        return casClass;
    }

    public void setCasClass(String casClass) {
        this.casClass = casClass;
    }
    
    
}
