package yg.blog.pojo;

public class BlogLike {
    private Integer likeId;

    private Integer imgId;

    private Integer likeCount;

    private String likeContent;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getLikeContent() {
        return likeContent;
    }

    public void setLikeContent(String likeContent) {
        this.likeContent = likeContent == null ? null : likeContent.trim();
    }
}