package yg.blog.pojo;

public class BlogForum {
    private Integer forumId;

    private String forumTitle;

    private String forumContent;

    private String forumImg;

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getForumTitle() {
        return forumTitle;
    }

    public void setForumTitle(String forumTitle) {
        this.forumTitle = forumTitle == null ? null : forumTitle.trim();
    }

    public String getForumContent() {
        return forumContent;
    }

    public void setForumContent(String forumContent) {
        this.forumContent = forumContent == null ? null : forumContent.trim();
    }

    public String getForumImg() {
        return forumImg;
    }

    public void setForumImg(String forumImg) {
        this.forumImg = forumImg == null ? null : forumImg.trim();
    }
}