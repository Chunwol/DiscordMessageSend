package xyz.chunwol.discord.model.request;

public class requestModel {
    private String everyone;
    private String content;

    public String getEveryone() {
        return everyone;
    }

    public void setEveryone(String everyone) {
        this.everyone = everyone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDiscord() {
        if(!(everyone == null)) {
            return "\n\n--------------------\n" + everyone + "\n" + "message : " + content;
        }else{
            return "\n\n--------------------\nmessage : " + content;
        }
    }
}